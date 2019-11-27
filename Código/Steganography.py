import numpy as np
def tobits(s):
    result = []
    for c in s:
        bits = bin(ord(c))[2:]
        bits = '00000000'[len(bits):] + bits
        result.extend([int(b) for b in bits])
    return result

def frombits(bits):
    chars = []
    for b in range(len(bits) // 8):
        byte = bits[b*8:(b+1)*8]
        chars.append(chr(int(''.join([str(bit) for bit in byte]), 2)))
    return ''.join(chars)

def encode(data,message):
    messageCounter = 0
    data = np.array(data)
    char = tobits(message[0])
    bitCounter = 0;
    for row in range(data.shape[0]):
        for cell in range(data.shape[1]):
            for color in range(3):      
                if(bitCounter==8):
                    bitCounter = -1
                    messageCounter+=1
                    if(messageCounter>=len(message)):      
                        if(data[row][cell][color]%2==0):
                            data[row][cell][color] -= 1
                            return(data)
                    else:
                        if(data[row][cell][color]%2==1):
                            data[row][cell][color] -=1
                        char = tobits(message[messageCounter])
                elif(data[row][cell][color]%2 != char[bitCounter]):
                    data[row][cell][color] += -1
                bitCounter+=1
    print(data)

def decode(data):
    message = ""
    data = np.array(data)
    bitStack = []
    for row in range(data.shape[0]):
        for cell in range(data.shape[1]):
            for color in range(3): 
                bitStack.append(data[row][cell][color]%2)
                if(len(bitStack)==8):
                    message += frombits(bitStack)         
                elif(len(bitStack)==9):
                    bitStack = []
                    if(data[row][cell][color]%2 == 1):
                        return message
