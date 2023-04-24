from ManejoArchivos import ManejoArchivos
# Manejo de contexto WITH: Sintáxis simplificada. Abre y cierra el archivo
#with open('prueba.txt', 'r', encoding='utf8') as archivo:
    #print(archivo.read())
# No hace falta ni el try, ni el finally
# en el contexto de with lo que se ejecuta de manera automática
# Utiliza diferentes métodos: __enter__(es el que abre el archivo)
# __exit__ (es el que cierra el archivo)


with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())