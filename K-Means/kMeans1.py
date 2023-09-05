import numpy as np
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D

from sklearn.cluster import KMeans
from sklearn.datasets import load_iris
from sklearn import metrics

db_iris = load_iris()   # lee la base de datos

datos = db_iris.data            #db_iris['data']
clases = db_iris.target

# print(datos)
# print(clases)

# crea un objeto de Kmeans con 3 atractores principales
# sí no se especifica el valor de init en el constructor de KMeans, el algoritmo K-Means utiliza la estrategia predeterminada que es "K-Means++"

kmeans = KMeans( n_clusters=3 )     #n_clusters = 8    init=default KMeans++
#kmeans = KMeans(n_clusters=3, init='random') # los centroides iniciales se seleccionarán de manera aleatoria entre los puntos de datos existentes

kmeans.fit( datos )         # clusters
                            # inicia el proceso de agrupación K-Means en los datos 

# print( kmeans.labels_ )     # imprime las clases 0 setosa, 1 versicolor, 2 virginica

print( kmeans.cluster_centers_ ) # imprime una matriz con los centroides finales (4 caracteristicas)

print( kmeans.n_iter_ )         # num_veces que el algoritmo actualizo los centroides 


predic = kmeans.predict(datos)  # asignar cada punto de datos en datos a uno de los clusters encontrados durante el proceso de ajuste
print(predic) # imprime las clases resultantes despues de realizar la prediccion por cada objeto

predic2 = kmeans.fit_predict(datos)     #fit + predict
                                        # realizara la agrupación de datos y encontrara los centroides
                                        # predice las etiquetas dela clase para cada punto

print(predic2) # imprime las clases resultantes despues de realizar la prediccion por cada objeto

score = metrics.adjusted_rand_score(clases, predic)    #clases %OK
print( score ) #  valor que califica la similitud entre las etiquetas de clase reales y las etiquetas de cluster predichas


#plt.figure('KMeans') # crea una ventana con Matplotlib con ese nombre
#plt.subplot(211)       #fcpos
# subgrafico en el plot actual de Matplotlib con 2 filas y 1 columna y se esta seleccionando el primer subgrafico 
#plt.scatter( datos[:,1], datos[:,2], c=predic) # crear grafico de dispercion 
                # 2da y 3er columna   color de cada punto               cada cluster determina el color

#plt.subplot(212)
#plt.scatter(datos[:,1], datos[:,2], c=clases )
#plt.show()

fig = plt.figure('KMeans')
ax = fig.add_subplot(121, projection='3d')  # crear subgrafico en fig 
# 1 fila y 2 columnas y seleccionando el primer espacio/ en 3D
ax.scatter3D( datos[:,0], datos[:,1], datos[:,3], c=predic ) # grafico de dispersion 3D  con (x,y,z),  el color de cada punto
ax.set_xlabel('X sepalo')
ax.set_ylabel('Y petalo ')
ax.set_zlabel('Z')

ax2 = fig.add_subplot(122, projection='3d')
ax2.scatter3D( datos[:,0], datos[:,1], datos[:,3], c=clases )
ax2.set_xlabel('X sepalo')
ax2.set_ylabel('Y petalo ')
ax2.set_zlabel('Z')

plt.show()



