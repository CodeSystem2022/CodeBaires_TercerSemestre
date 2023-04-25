#declaramos una variable
try:
    archivo = open("prueba.txt", "w",encoding="utf8")# la w proviene de la palabla write que es escribir
    archivo.write("Programos con diferentes tipos de archivos, ahora en txt.\n")
    archivo.write("Los acentos son importantes para las palablas\n")
    archivo.write("como por ejemplo: acción, ejecución y producción\n")
    archivo.write("las letras son:\n r read leer, \n a append anexa, \n w white escribe, \n x crea un archivo")
    archivo.write("\n t esta es para texto o text, \n b archivo binarios, \n w+ lee y escribir, \n r+ y w+ son iguales \n")
    archivo.write("Con esto terminamos")

except Exception as e:
     print(e)
finally:  # siempre se ejecuta
    archivo.close() # con esto se debe cerrar el archivo
# archivo.write("todo quedo perfecto") Este es un error frecuente una vez ejecutado el archivo no se puede trabajar con el archivo
