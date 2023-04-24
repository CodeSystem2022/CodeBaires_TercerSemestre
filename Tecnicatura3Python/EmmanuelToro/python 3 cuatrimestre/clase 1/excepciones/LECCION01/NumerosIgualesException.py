class NumeroIgualesException (Exception): #Extiende dede la clase
    def __init__(self, mensaje):
      self.message = mensaje