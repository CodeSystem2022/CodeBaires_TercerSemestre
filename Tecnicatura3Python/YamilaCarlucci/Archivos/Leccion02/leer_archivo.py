archivo = open('prueba.txt', 'r', encoding='utf8') # Las letras son: 'r' read, 'a' append, 'w' write, 'x'
#print(archivo.read()) #Leemos el archivo completo
#print(archivo.read(26)) #Muestra las primeras n letras
#print(archivo.read(10)) #Continuamos desde la línea anterior
#print(archivo.readline()) #Lee solo la primer linea
#print(archivo.readline()) #Continua con la siguiente linea

#Vamos a itarar el archivo, cada una de las líneas
#for linea in archivo:
    #print(linea) #iteramos todos los elementos del archivo

#print(archivo.readlines()[11]) #Muestra los elementos como una lista

#Anexamos información, copiamos a otro
archivo2 = open('copia.txt', 'w', encoding='utf8')
archivo2.write(archivo.read())
archivo.close() #cerramos el primer archivo
archivo2.close()#cerramos el segundo archivo
print('Se ha terminado el proceso de leer y copiar archivos')


