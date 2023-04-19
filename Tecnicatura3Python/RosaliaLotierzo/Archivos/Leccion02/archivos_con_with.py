from ManejoArchivos import ManejoArchivos
# MANEJO DE CONTEXTO WITH: sintaxis simplificada
# with open('prueba.txt', 'r', encoding='utf8') as archivo:
    # print(archivo.read())
# No hace falta ni el try, ni el finally
# Metodos: __enter__ ABRE - __exit__ CIERRA

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())
