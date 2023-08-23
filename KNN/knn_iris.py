import numpy as np
import sklearn
from sklearn.datasets import load_iris      #BD
from sklearn.model_selection import train_test_split   #Dividir train/test 80%-20%  90%-10%
from sklearn.neighbors import KNeighborsClassifier

nuevos_datos = 

db_iris = load_iris()       #Cargar BD
print(type(db_iris))        # bunch solo Sklearn

print( db_iris.keys() )         #llaves del diccionario

print( db_iris['data'])         #Datos BD

print( db_iris['target'])       #Clasificación de c/u objetos

print( db_iris['target_names']) #Nombres de c/u clases

print( db_iris['feature_names'])


#Dividir entrenamiento - pruebas
x_entrenar, x_test, y_entrenar, y_test = train_test_split( db_iris['data'], db_iris['target'])

print( x_entrenar.shape)
print( y_entrenar.shape) 

print( x_entrenar)


##CLASIFICACIÓN

knn = KNeighborsClassifier( n_neighbors=15 )

knn.fit( x_entrenar, y_entrenar )       #Entrenamiento/Aprendiendo

preApr = knn.score( x_test, y_test )    #Pruebas
print( '{:.5f}'.format(preApr) )

clasif = knn.predict( [[1.2, 3.4, 5.6, 1.1]] )  #Nuevo patrón
print(clasif, " = ", db_iris['target_names'][clasif])

clasif = knn.predict( [[4.9, 4.0, 2.0, 0.3]] )  #Nuevo patrón
print(clasif, " = ", db_iris['target_names'][clasif])

clasif = knn.predict( [[7.0, 3.0, 5.0, 2.3]] )  #Nuevo patrón
print(clasif, " = ", db_iris['target_names'][clasif])

# clasif = knn.predict( [[4.1, 3.4, 1.6, 1.1]] )  # Setosa
# print(clasif, " = ", db_iris['target_names'][clasif])