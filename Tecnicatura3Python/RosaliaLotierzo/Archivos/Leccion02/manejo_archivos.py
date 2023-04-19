# Declaramos una variable
try:
    archivo = open('prueba.txt', 'w', encoding='utf8') # Si este archivo no existe, el metodo 'open' lo va a crear
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt. \n') # Con el metodo 'write', agregamos líneas al archivo
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('Como por ejemplo: acción, ejecución y producción\n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: # Siempre se va a ejecutar el finally
    archivo.close()

