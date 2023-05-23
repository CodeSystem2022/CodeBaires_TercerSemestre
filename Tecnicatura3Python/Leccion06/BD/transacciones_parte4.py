import psycopg2 as bd # Esto es para poder conectarnos a Postgre

conexion = bd.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')
try:
   conexion.autocommit = False # Esto directamente no debería estar
   cursor=conexion.cursor()
   sentencia = 'INSERT INTO persona (nombre, apellido, email) VALUES (%s, %s, %s)'
   valores = ('Jorge', 'Prol', 'jprol@mail.com')
   cursor.execute(sentencia, valores)

   sentencia = 'UPDATE persona SET nombre = %s, apellido = %s, email = %s WHERE id_persona = %s'
   valores = ('Juan Carlos', 'Perez', 'jcperez@mail', 1)
   cursor.execute(sentencia, valores)

   conexion.commit() # Hacemos el commit manualmente, se cierra la transacción
   print('Termina la transacción')
except Exception as e:
    conexion.rollback()
    print(f"Ocurrió un , se hizo un rollback: {e}")
finally:
    conexion.close()