from NumerosIgualesException import NumerosIgualesException

resultado = None

try:
    a = int(input('Ingrese el primer número:'))
    b = int(input('Ingrese el segundo número:'))
    if a == b:
        raise NumerosIgualesException("Son iguales")
    resultado = a/b #modificamos
except Exception as e:
    print(f'Ocurrió un error: {e}')

print(f'El resultado es: {resultado}')
print('Seguimos...')

try:
    resultado = a/b #modificamos
except TypeError as e:
    print(f'Ocurrió un TypeError: {type(e)}')
except ZeroDivisionError as e:
    print(f'Ocurrió un ZeroDivisionError: {type(e)}')
except Exception as e:
    print(f'Exception - Ocurrió un error: {type(e)}')
else:
    print('No se arrojó ninguna excepción')
finally: #Siempre se va a ejecutar
    print('Ejecución de este bloque finally')

print(f'El resultado es: {resultado}')
print('Seguimos...')


