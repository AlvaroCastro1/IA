import numpy as np
import pandas as pd
import sklearn
from sklearn.datasets import load_iris                  #Carga BD iris
from sklearn.model_selection import train_test_split      #Dividir en entrenamiento y pruebas
from sklearn.neighbors import KNeighborsClassifier


# este archivo ya contiene los nuevos datos
archivo = './KNN/Iris_DB.csv'


# Longitud del sépalo: de 3.5 a 4.5
# Ancho del sépalo: de 1.0 a 1.5
# Longitud del pétalo: de 2.0 a 3.0
# Ancho del pétalo: de 0.5 a 1.0

dataFrame = pd.read_csv(archivo)

print(dataFrame)
print(type(dataFrame))

x_data = dataFrame[dataFrame.columns[:-1]].to_numpy()
y_data = dataFrame[dataFrame.columns[-1]].to_numpy()

print(x_data)
print(type(x_data))

print(y_data)
print(type(y_data))

              
#train_test_split   Función para dividir los datos
#Regresa grupos entreamiento y pruebas, recibe datos y clasificación
x_entrenar, x_test, y_entrenar, y_test = train_test_split(x_data, y_data )

print(x_entrenar.shape)     #Grupo entrenamiento
print(y_entrenar.shape)     #Grupo entrenamiento clase

##CLASIFICADOR
knn = KNeighborsClassifier( n_neighbors=10 )

knn.fit(x_entrenar, y_entrenar)             #Entrenamiento

aprend = knn.score(x_test, y_test)          #Pruebas (Aprendizaje)
print('{:.5f}'.format(aprend) )

clasif = knn.predict([[3.5, 1.5, 2.0, 0.8]])    # MI Nuevo patrón
print(clasif)

