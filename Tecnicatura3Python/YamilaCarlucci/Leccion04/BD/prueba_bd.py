import psycopg2 #Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(
    user = 'postgres',
    password = 'trix3579',
    host = '127.0.0.1',
    port='5432',
    database='test_bd'
)

cursor = conexion.cursor()
sentencia = 'SELECT * FROM persona'
cursor.execute(sentencia) # De esta manera ejecutamos la sentencia
registros = cursor.fetchall() #Recupera todos los registros de la sentencia que se ejecutó
print(registros)

cursor.close()
conexion.close()