from skimage import io
import numpy as np
import threading
import queue
import time


#Función que recibe un color hexadecimal en formato de string "#ffffff" convertido a escala de grises
def colorToGrayScaleRGB(hexValue):
    #hex color format: #ff0000 => where #ff(red)00(green),00(blue) = >(255,0,0)
    rValue = np.uint8(int(hexValue[1:3],16)) # Primer par de digitos del codigo hexadecimal correpondientes a "Red" los convierte a entero
    gValue = np.uint8(int(hexValue[3:5],16)) # Segundo par de digitos del codigo hexadecimal correpondientes a "Green" los convierte a entero
    bValue = np.uint8(int(hexValue[5:7],16)) # Tercer par de digitos del codigo hexadecimal correpondientes a "Blue" los convierte a entero
    return [0.2125*rValue,0.7154*gValue,0.0721*bValue] #Retorna un arreglo [r,g,b] convertido a blanco y negro

#Función que recibe un color hexadecimal en formato de string "#ffffff"
def colorToRGB(hexValue):
    #hex color format: #ff0000 => where #ff(red)00(green),00(blue) = >(255,0,0)
    rValue = np.uint8(int(hexValue[1:3],16)) # Primer par de digitos del codigo hexadecimal correpondientes a "Red" los convierte a entero
    gValue = np.uint8(int(hexValue[3:5],16)) # Segundo par de digitos del codigo hexadecimal correpondientes a "Green" los convierte a entero
    bValue = np.uint8(int(hexValue[5:7],16)) # Tercer par de digitos del codigo hexadecimal correpondientes a "Blue" los convierte a entero
    return [rValue,gValue,bValue] #Retorna un arreglo [r,g,b]

#Función que recibe un arreglo de 3 valores corresopndientes a un color rgb [255,147,90] 
#y que regresa el color en formato hexadecimal como un string => "#ff8e5a"
def rgbToColor(rgbValue): #Example input: [255,147,90] (rgb)
    redInt = rgbValue[0]
    greenInt = rgbValue[1]
    blueInt = rgbValue[2]

    redHex = str(hex(redInt))[2:]  #Se convierte a hexadecimal (255) => 0xff, luego a string "0xff" y se ignorarn los primeros dos caracteres => "ff"
    if(len(redHex) == 1 ): #En caso de que el valor hexadecimal tena un solo caracter (Ej. '7') 
        redHex = "0" + redHex #Se concatena un 0 al principio (7 => 07)
    greenHex = str(hex(greenInt))[2:]
    if(len(greenHex) == 1 ):
        greenHex = "0" + greenHex
    blueHex = str(hex(blueInt))[2:]
    if(len(blueHex) == 1 ):
        blueHex = "0" + blueHex
    return "#"+redHex+greenHex+blueHex #Regresa una string de formato "#ffffff"

#Recibe como parámetro de la ubicación de un archivo de una imagen y regresa un valor entero 
#que representa la anchura de la imagen(cantidad de pixeles en x)
def getImageWidth(urlPath):
    return io.imread(urlPath).shape[0]

#Recibe como parámetro de la ubicación de un archivo de una imagen y regresa un valor entero 
#que representa la altura de la imagen(cantidad de pixeles en y)
def getImageHeight(urlPath):
    return io.imread(urlPath).shape[1]

#Recibe como parámetro la ubicación de un archivo de una imagen y lo guarda en una variable de matriz de colores. 
#Ej. define color birdPhoto[100][100];
#birdPhoto = openImg(“C:\Users\lizzi\Desktop\Bird.JPG”);
def openImg(urlPath,dataX,dataY,baseMem,vm):
    imageWidth = getImageWidth(urlPath)
    imageHeight = getImageHeight(urlPath)
    inputImage = io.imread(urlPath)
    rangeX = range(dataX)
    rangeY = range(dataY)
    for row in rangeX:
        for cell in rangeY:  
            if(row > imageWidth-1 or cell > imageHeight-1):
                color = "#ffffff"
            else:
                color = rgbToColor(inputImage[row][cell])
            position = baseMem+row*dataX+cell
            vm.setValue(color,position)
    

#Recibe como parámetro una matriz de colores y lo guarda como imagen según la ruta de archivo especificada.
#saveImg(newBirdPhoto,“C:\Users\lizzi\Desktop\GrayBird.JPG”)
def saveImg(urlPath,dataX,dataY,baseMem,vm):
    image = []
    rangeX = range(dataX)
    rangeY = range(dataY)
    for row in rangeX:
        image.append([])
        for cell in rangeY:
            position = baseMem+row*dataX+cell
            color = vm.getValue(position)
            image[-1].append(colorToRGB(color))  
    io.imsave(urlPath, np.array(image))
    print(f"Image saved as : {urlPath}")

#Recibe una matriz de colores y la convierte la imagen a escala de grises.
def grayscale(urlPath,dataX,dataY,baseMem,vm):
    image = []
    rangeX = range(dataX)
    rangeY = range(dataY)
    for row in rangeX:
        image.append([])
        for cell in rangeY:
            position = baseMem+row*dataX+cell
            color = vm.getValue(position)
            image[-1].append(colorToGrayScaleRGB(color))     
    io.imsave(urlPath, np.array(image))
    print(f"Image saved as : {urlPath}")
