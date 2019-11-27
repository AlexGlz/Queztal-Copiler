from skimage import io
from skimage.filters import roberts
import numpy as np
import threading
import queue
import time

#Función que recibe un color rgb y regresa para cada compnente (red,green,blue) un limite superior e inferior
#que constituye +-55 de su valor actual
#Retorna un arreglo de 6 valores: [redUpperLimit,redLowerLimit,greenUpperLimit,greenLowerLimt,blueUpperLimit,blueLowerLimit]
def getRGBrange(rgbValue):
    #Limite superior del color rojo siendo 55 unidades mayor al valor rojo actual
    if(rgbValue[0] + 55 >255):
        redUpperLimit = 255
    else:
        redUpperLimit = rgbValue[0] + 55
    #Limite superior del color rojo siendo 55 unidades menor al valor rojo actual
    if(rgbValue[0] - 55 <0):
        redLowerLimit = 0
    else:
        redLowerLimit = rgbValue[0] - 55
    
    #Limite superior del color verde siendo 55 unidades mayor al valor verde actual
    if(rgbValue[1] + 55 >255):
        greenUpperLimit = 255
    else:
        greenUpperLimit = rgbValue[1] + 55
    #Limite superior del color verde siendo 55 unidades menor al valor verde actual
    if(rgbValue[1] - 55 <0):
        greenLowerLimit = 0
    else:
        greenLowerLimit = rgbValue[1] - 55
    
    #Limite superior del color azul siendo 55 unidades mayor al valor azul actual
    if(rgbValue[2] + 55 >255):
        blueUpperLimit = 255
    else:
        blueUpperLimit = rgbValue[2] + 55
    #Limite superior del color azul siendo 55 unidades menor al valor azul actual
    if(rgbValue[2] - 55 <0):
        blueLowerLimit = 0
    else:
        blueLowerLimit = rgbValue[2] - 55
    return [redUpperLimit,redLowerLimit,greenUpperLimit,greenLowerLimit,blueUpperLimit,blueLowerLimit]

#Función que recibe un color hexadecimal en formato de string "#ffffff"
def colorToRGB(hexValue):
    #hex color format: #ff0000 => where #ff(red)00(green),00(blue) = >(255,0,0)
    rValue = np.uint8(int(hexValue[1:3],16)) # Primer par de digitos del codigo hexadecimal correpondientes a "Red" los convierte a entero
    gValue = np.uint8(int(hexValue[3:5],16)) # Segundo par de digitos del codigo hexadecimal correpondientes a "Green" los convierte a entero
    bValue = np.uint8(int(hexValue[5:7],16)) # Tercer par de digitos del codigo hexadecimal correpondientes a "Blue" los convierte a entero
    return [rValue,gValue,bValue] #Retorna un arreglo [r,g,b]

#Función que recibe un color hexadecimal en formato de string "#ffffff" convertido a escala de grises
def colorToGrayScaleRGB(hexValue):
    rgbValue = colorToRGB(hexValue)
    grayColor = 0.2125*rgbValue[0]+0.7154*rgbValue[1]+0.0721*rgbValue[2]
    return [grayColor,grayColor,grayColor] #Retorna un arreglo [r,g,b] convertido a blanco y negro

#Función que recibe un color rgb en formato [r,g,b] convertido a escala de grises
def rgbToGrayScaleRGB(rgbValue):
    grayColor = 0.2125*rgbValue[0]+0.7154*rgbValue[1]+0.0721*rgbValue[2]
    return [grayColor,grayColor,grayColor] #Retorna un arreglo [r,g,b] convertido a blanco y negro

#Función que recibe un color en formato hexadecimal correspondiente al color actual del pixel, otro al Color a Remplazar y un tercer color correspondiente al color con el cual remplazar
#Manda a calcular el límite de los valores rgb del color a Remplazar según la función getRGBrange
#Determina si el color del pixel entre dentro del espectro del colorOlg, si sí ajusta sus valores para que se convierte en el nuevo color
#Regresa un valor rgb[red,green,blue]
def replaceColorRGB(color,colorOld,colorNew):
    #Convierte el color a Remplazar a rgb
    rgbValueOld = colorToRGB(colorOld)
    #Calcula los limites superiores e inferiores de R,G,B
    rgbLimitsOld = getRGBrange(rgbValueOld)
    redUpperLimitOld = np.int(rgbLimitsOld[0])
    redLowerLimitOld = np.int(rgbLimitsOld[1])
    greenUpperLimitOld = np.int(rgbLimitsOld[2])
    greenLowerLimitOld = np.int(rgbLimitsOld[3])
    blueUpperLimitOld = np.int(rgbLimitsOld[4])
    blueLowerLimitOld = np.int(rgbLimitsOld[5])

    #Convierte el color con el que Remplazar a rgb
    rgbValueNew = colorToRGB(colorNew)
    
    #Valores RGB de color a remplazar
    redOld =  np.int(rgbValueOld[0])
    greenOld =  np.int(rgbValueOld[1])
    blueOld =  np.int(rgbValueOld[2])

    #Calcula los valore rgb del pixel recibido
    rgbValue = colorToRGB(color)
    red = rgbValue[0]
    green = rgbValue[1]
    blue = rgbValue[2]

    #Diferencia entre los valores del RGB a remplazar y el RGB con el que remplazar
    redDifference = redOld - red
    greenDifference = greenOld - green
    blueDifference = blueOld - blue    

    upgradeRed = red
    upgradeGreen = green
    upgradeBlue = blue
    #Si el color rgb recibido entra dentro del espectro del color a remplazar  
    if(red >= redLowerLimitOld and red <= redUpperLimitOld and green >= greenLowerLimitOld and green <= greenUpperLimitOld and blue >= blueLowerLimitOld and blue <= blueUpperLimitOld):
        
        #Ajuste de Rojo
        upgradeRed = rgbValueNew[0]
        if(upgradeRed + redDifference > 255):
            upgradeRed = 255
        elif(upgradeRed + redDifference < 0):
            upgradeRed = 0
        else:
            upgradeRed += redDifference
        
        #Ajuste de Verde
        upgradeGreen = rgbValueNew[1]
        if(upgradeGreen + greenDifference > 255):
            upgradeGreen = 255
        elif(upgradeGreen + greenDifference < 0):
            upgradeGreen = 0
        else:
            upgradeGreen += greenDifference
        #Ajuste de Azul
        upgradeBlue = rgbValueNew[2]
        if(upgradeBlue + blueDifference > 255):
            upgradeBlue = 255
        elif(upgradeBlue + blueDifference < 0):
            upgradeBlue = 0
        else:
            upgradeBlue += blueDifference
    
    return [upgradeRed,upgradeGreen,upgradeBlue]

#Función que recibe un color en formato hexadecimal correspondiente al color actual del pixel, otro al Color a Mantener
#Manda a calcular el límite de los valores rgb del color a Mantener según la función getRGBrange
#Determina si el color del pixel entre dentro del espectro del color a Mantener, si sí no modifica sus valores, y si no lo convierte a escala de grises 
#Regresa un valor rgb[red,green,blue]
def filterOutColorRGB(color,colorOld):
    #Convierte el color a Remplazar a rgb
    rgbValueOld = colorToRGB(colorOld)
    #Calcula los limites superiores e inferiores de R,G,B
    rgbLimitsOld = getRGBrange(rgbValueOld)
    redUpperLimitOld = np.int(rgbLimitsOld[0])
    redLowerLimitOld = np.int(rgbLimitsOld[1])
    greenUpperLimitOld = np.int(rgbLimitsOld[2])
    greenLowerLimitOld = np.int(rgbLimitsOld[3])
    blueUpperLimitOld = np.int(rgbLimitsOld[4])
    blueLowerLimitOld = np.int(rgbLimitsOld[5])
    
    #Valores RGB de color a remplazar
    redOld =  np.int(rgbValueOld[0])
    greenOld =  np.int(rgbValueOld[1])
    blueOld =  np.int(rgbValueOld[2])

    #Calcula los valore rgb del pixel recibido
    rgbValue = colorToRGB(color)
    red = rgbValue[0]
    green = rgbValue[1]
    blue = rgbValue[2]
    
    #Si el color rgb recibido entra dentro del espectro del color a remplazar  
    if(red >= redLowerLimitOld and red <= redUpperLimitOld and green >= greenLowerLimitOld and green <= greenUpperLimitOld and blue >= blueLowerLimitOld and blue <= blueUpperLimitOld):
        return [red,green,blue]
    else:
        return rgbToGrayScaleRGB(rgbValue)   
    

#Función que recibe un arreglo de 3 valores corresopndientes a un color rgb [255,147,90] 
#y que regresa el color en formato hexadecimal como un string => "#ff8e5a"
def rgbToColor(rgbValue): #Example input: [255,147,90] (rgb)
    redInt = int(rgbValue[0])
    greenInt = int(rgbValue[1])
    blueInt = int(rgbValue[2])

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
    return io.imread(urlPath).shape[1]

#Recibe como parámetro de la ubicación de un archivo de una imagen y regresa un valor entero 
#que representa la altura de la imagen(cantidad de pixeles en y)
def getImageHeight(urlPath):
    return io.imread(urlPath).shape[0]

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
            if(row >imageHeight -1 or cell > imageWidth-1):
                color = "#ffffff"   
            else:
                color = rgbToColor(inputImage[row][cell])
            position = baseMem+row*dataY+cell
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
            position = baseMem+row*dataY+cell
            color = vm.getValue(position)
            image[-1].append(colorToRGB(color))  
    io.imsave(urlPath, np.array(image))
    print(f"Image saved as : {urlPath}")

#Recibe una matriz de colores y la convierte la imagen a escala de grises.
def grayscale(dataX,dataY,baseMem,vm):
    rangeX = range(dataX)
    rangeY = range(dataY)
    for row in rangeX:
        for cell in rangeY:
            position = baseMem+row*dataY+cell
            color = vm.getValue(position)
            newRGB = colorToGrayScaleRGB(color)
            color = rgbToColor(newRGB)
            vm.setValue(color,position)

#Recibe una matriz de colores y un color. 
#Esta función convierte en escala de gris todos los colores de la matriz que no sean iguales al segundo parámetro.
def colorReplace(colorOld,colorNew,dataX,dataY,baseMem,vm):
    rangeX = range(dataX)
    rangeY = range(dataY)
    for row in rangeX:
        for cell in rangeY:
            position = baseMem+row*dataY+cell
            color = vm.getValue(position)
            newRgb = replaceColorRGB(color,colorOld,colorNew)
            newColor = rgbToColor(newRgb)
            vm.setValue(newColor,position)

def colorFilter(maintainColor,dataX,dataY,baseMem,vm):
    rangeX = range(dataX)
    rangeY = range(dataY)
    for row in rangeX:
        for cell in rangeY:
            position = baseMem+row*dataY+cell
            color = vm.getValue(position)
            newRgb = filterOutColorRGB(color,maintainColor)
            newColor = rgbToColor(newRgb)
            vm.setValue(newColor,position)

def edgeDetection(dataX,dataY,baseMem,vm):
    image = []
    rangeX = range(dataX)
    rangeY = range(dataY)
    for row in rangeX:
        image.append([])
        for cell in rangeY:
            position = baseMem+row*dataY+cell
            color = vm.getValue(position)
            color = colorToGrayScaleRGB(color)[0]
            image[-1].append(color)
    filteredImage = roberts(np.array(image))
    for row in rangeX:
        for cell in rangeY:
            position = baseMem+row*dataY+cell
            pixel = filteredImage[row][cell]
            newColor = rgbToColor([pixel,pixel,pixel])
            vm.setValue(newColor,position)

            
