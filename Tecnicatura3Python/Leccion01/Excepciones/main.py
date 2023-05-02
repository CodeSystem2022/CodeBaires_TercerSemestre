# Ejercicio  5: convertidor de temperatura
# Realizar dos funciones para convertir de grados selsius a grados fahrenheit y viseversa.
# Invertigar las formulas


# Funcion que convierte de celsius a fahrenheit
def celsius_fahrenheit(celsious):
    return celsious * 9 / 5 + 32 # La presedencia:multiplicacion, division y suma.

# Funcion convierte de fahrenheit a selsius
def fahrenheit_celsius(fahrenheit):
    return (fahrenheit- 32)* 5 / 9 # respetar la presedencia utilizando parentesis

celsius = float(input("digite el valor valor de celsius: "))
resultado = celsius_fahrenheit(celsius)
print(f"{celsius} c a f -> {resultado: 2f}")

fahrenheit = float(input("digite el valor de fahrenheit: "))
resultado = fahrenheit_celsius(fahrenheit)
print(f"{fahrenheit} F a C -> {resultado:.2f}")



