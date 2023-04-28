class Peliculas:
    def __init__(self,nombre):
        self._nombre = nombre

    def __str__(self):
        return f"Peliculas: {self._ nombre}"

        @property
        def nombre(self):
            return self._nombre

        @nombre.setter
        def nombre(self,nombre):
            self._nombre = nombre


