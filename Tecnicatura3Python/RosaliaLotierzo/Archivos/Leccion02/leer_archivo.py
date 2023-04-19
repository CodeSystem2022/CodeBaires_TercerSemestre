# encoding='utf8' es un juego de caracteres que soporta los acentos
archivo = open('prueba.txt', 'r', encoding='utf8') # r = read
# print(archivo.read())
# print(archivo.readline()) # Muestra la primera línea del archivo prueba.txt

# Anexamos información, copiamos a otro
archivo2 = open('copia.txt', 'a', encoding='utf8')
archivo2.write(archivo.read())
archivo.close() # Cerramos el primer archivo
archivo2.close() # Cerramos el segundo archivo

print('Se terminó el proceso de leer y copiar archivos')
