from NumerosIgualesException import NumeroIgualesException

resultado = None

try:
    a = int(input("digite el primer numero: "))
    b = int(input("digite el segundo numero: "))
    if a == b:
        raise NumerosIgualesException("son numeros iguales")
    resultado = a / b #modificamos
except TypeError as e:
    print(f"TypeError - Ocurrio un error: {type(e)}")
except ZeroDivisionError as e:
    print(f"ZeroDivisionError - ocurrio un error: {type(e)}")
except Exception as e:
    print(f"Exception - Ocurrio un error:{type(e)}")
else:
    print("No se arrojo ninguna excepcion")
finally:# siempre se va a ejecutar
    print("Ejecucion de este bloque finally")

print(f"El resultado es: {resultado}")

print(" seguimos...")

