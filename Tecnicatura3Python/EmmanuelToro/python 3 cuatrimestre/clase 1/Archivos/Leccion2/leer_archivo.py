
archivo = open("prueba.txt","r", encoding="utf8")# las letras son "r"read, "a"append ,"w"white, "x"
#print(archivo.read())
#print(archivo.read(16))
#print(archivo.read(10)) = continuamos desde la linea anterior
print(archivo.readline())
print(archivo.readline())

# vamos a iterar el archivo, cada una de las de las lineas
# for linea in archivo:
# print (linea): iteramos todos los elementos del archivo
# print (archivo.readlines()[11]) # accedemos al archivo como si fuera una lista
# anexamos informacion, copiamos a otro
archivo2 = open("copia.txt", "w", encoding="utf8")
archivo2.write(archivo.read())
archivo.close() # cerramos el primer archivo
archivo2.close() #cerramos el segundo archivo

print("se ha terminado el proceso de leer y copiar archivos")




