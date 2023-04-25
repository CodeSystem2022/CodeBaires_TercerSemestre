import os # importar desde el sistema operativo el metodo 'remove'

class CatalogoPeliculas:

    ruta_archivo = 'peliculas.txt'

    @classmethod # Metodo para agregar peliculas
    def agregar_peliculas(cls, pelicula):
        with open(cls.ruta_archivo, 'a', encoding='utf8') as archivo:
            archivo.write(f'{pelicula.nombre}\n')

    @classmethod # Metodo para listar peliculas
    def listar_peliculas(cls):
        with open(cls.ruta_archivo, 'r', encoding='utf8') as archivo:
            print(f'Catalogo de peliculas'.center(50, '-'))
            print(archivo.read())

    @classmethod # Metodo para eliminar
    def eliminar_peliculas(cls):
        os.remove(cls.ruta_archivo)
        print(f'Archivo eliminado: {cls.ruta_archivo}') # Para saber si el archivo fue eliminado




