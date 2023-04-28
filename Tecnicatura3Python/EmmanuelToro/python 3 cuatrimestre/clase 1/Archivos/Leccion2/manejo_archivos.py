#Declaramos una variable

try:
    archivo = open('prueba.txt', 'w', encoding= 'utf8') #La w es de write
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt. \n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    archivo.write('Las letras son: \nr read, \na append, \nw write, \nx create\n')
    archivo.write('\nt text, \nb binary, \nw+ read and write, \nr+ read and write \n')
    archivo.write('Saludos a todos los alumnos de la tecnicatura\n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: #Siempre se ejecuta
    archivo.close() #Con esto se debe cerrar el archivo
# archivo.write('Todo quedó perfecto') //Este es un error