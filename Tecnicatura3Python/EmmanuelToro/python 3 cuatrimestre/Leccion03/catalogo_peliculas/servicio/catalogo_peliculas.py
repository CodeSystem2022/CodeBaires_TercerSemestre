import os

class catalogosPeliculas :

    ruta_archivo = "peliculas.txt"

    @classmethod
    def agregar_peliculas(cls,peliculas):
        with open(cls.ruta_archivo, "a", encoding="utf8") as archivo:
            archivo.write(f"{peliculas._nombre}\n")

    @classmethod
    def listar_peliculas(cls):
        with open(clas.ruta_archivo, encoding= "utf8") as archivo:
            print(f"Catalogo de peliculas".center(50, "-"))
            print(archivo.read())


    @classmethod
    def eliminar_peliculas(cls):
       os.remove(cls.ruta_archivo)
       print(f"Archivo eliminado: {cls.ruta_archivo}")
