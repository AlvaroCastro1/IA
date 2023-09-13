import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn import tree
from sklearn.model_selection import cross_val_score

#t = tree.DecisionTreeClassifier(criterion='entropy')
#t = t.fit( train_attributes, train_labels)
#t.score(test_attributes, test_labels)
#t.predict(example_attributes)
#cross_val_score(t, all_attributes, all_labels)

dFrame = pd.read_csv('./student/student-por.csv', sep=';')
print('Filas: ',len(dFrame))
#print('Tipo: ',type(dFrame))
#print(dFrame)



#apply -> Función Pandas: aplica una regla a una fila (axis=1) o columna (axis=0)
'''
apply 
crear una nueva columna llamada 'pass'
Esta columna se llena con 1 si la suma de las columnas 'G1', 'G2', y 'G3' >= a 35
< se llena con 0
'''
dFrame['pass'] = dFrame.apply( lambda obj: 1 if (obj['G1']+obj['G2']+obj['G3'])>=35 else 0, axis=1)

# elimina las columnas 'G1', 'G2', y 'G3' del DataFrame.
dFrame = dFrame.drop(['G1','G2','G3'], axis=1)

print(dFrame.head())

#print(dFrame.shape)

# one-hot crea nuevas columnas binarias para cada categoría única en estas columnas
dFrame = pd.get_dummies(dFrame, columns=['sex','school','address', 'famsize','Pstatus',
                                         'Mjob', 'Fjob', 'reason','guardian','schoolsup',
                                         'famsup','paid','activities','nursery','higher',
                                         'internet','romantic'])

#print(dFrame.shape)

dFrame = dFrame.sample(frac=1)      #Muestra aleatoria / Shuffle

dF_entrenar = dFrame[:500] #los primeros 500
dF_test = dFrame[500:] #el resto

#clases
dF_entrenar_c = dF_entrenar['pass']                 #Entrenamiento (rasgos=r, clases=c)
# nuevo DataFrame que contiene todas las columnas de características (o atributos)
# del conjunto de datos de entrenamiento dF_entrenar, excepto la columna 'pass'.
dF_entrenar_r = dF_entrenar.drop('pass', axis=1)

dF_test_c = dF_test['pass']                         #Pruebas (rasgos=r, clases=c)
dF_test_r = dF_test.drop('pass', axis=1)

dF_r = dFrame.drop(['pass'], axis=1)                #Total
dF_c = dFrame['pass']

print(dFrame)

print('Pass: %d de %d = %.2f%%'% (np.sum(dF_c),len(dF_c),100*float( np.sum(dF_c)/len(dF_c) )))

##ARBOL DE DECISIÓN
t = tree.DecisionTreeClassifier(criterion='entropy', max_depth=5)
t = t.fit( dF_entrenar_r, dF_entrenar_c )
score = t.score(dF_test_r, dF_test_c)
print(score)

#tree.export_graphviz(t, out_file="arbol_student.dot", label='all', impurity='False', proportion='True',
#                     feature_names=list(dF_entrenar_r), class_names=['fail','pass'], filled=True, rounded=True)


plt.figure('Arbol')
# colorear los nodos del árbol 
tree.plot_tree(t, filled=True)
plt.show()

#  evaluar la precisión de un modelo de árbol de decisión
presc = cross_val_score(t, dF_r, dF_c, cv=5)
# la precisión media y la variabilidad de la precisión 
print("Precisión: %0.2f (+/- %0.2f)"%(presc.mean(), presc.std()*2))

obj=[[1,0,0,1,17,1,0,1,0,1,0,1,1,1,0,0,0,0,0,1,1,0,0,1,0,0,0,0,1,0,1,2,0,0,1,1,0,0,1,0,1,0,1,1,0,1,0,0,1,5,3,3,1,1,3,4]]
obj_p = t.predict(obj)
print(f"Objeto: {obj_p}")

#obj2=[[1,0,1,0,15,1,0,0,1,1,0,4,4,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,1,1,0,0,1,1,0,1,0,1,0,1,0,1,0,1,0,0,1,4,3,3,1,3,5,2]]
#obj_p2 = t.predict(obj2)
#print(obj_p2)




# Arbol decisión, recorrido
#  número total de nodos en el árbol 
n_nodes = t.tree_.node_count
#  matriz que contiene información sobre los índices de los hijos izquierdos de cada nodo
children_left = t.tree_.children_left
children_right = t.tree_.children_right
# matriz que contiene el índice de la característica utilizada para la división en cada nodo
feature = t.tree_.feature
# valores de umbral utilizados en cada nodo para la división
threshold = t.tree_.threshold

#profundidad de cada nodo y si es una hoja o no.
node_depth = np.zeros(shape=n_nodes, dtype=np.int64)
is_leaves = np.zeros(shape=n_nodes, dtype=bool)

# una stack con una tupla que contiene el ID del nodo raíz (0) y su profundidad inicial (0)
stack = [(0, 0)]  # start with the root node id (0) and its depth (0)
while len(stack) > 0:
    # `pop` garantiza que cada nodo solo se visite una vez
    # nodo y profundidad 
    node_id, depth = stack.pop()
    
    node_depth[node_id] = depth

    # If the left and right child of a node is not the same we have a split
    # node
    """ si el nodo actual es un nodo de división 
    verificando si sus hijos izquierdo y derecho son diferentes. 
    """
    is_split_node = children_left[node_id] != children_right[node_id]
    # If a split node, append left and right children and depth to `stack`
    # so we can loop through them
    if is_split_node:
        """Agrega el hijo izquierdo del nodo
        actual a la pila con una profundidad incrementada en 1."""
        stack.append((children_left[node_id], depth + 1))
        stack.append((children_right[node_id], depth + 1))
    else:
        # hoja 
        is_leaves[node_id] = True

#  información detallada sobre la estructura del árbol 
print(
    "The binary tree structure has {n} nodes and has "
    "the following tree structure:\n".format(n=n_nodes)
)
for i in range(n_nodes):
    if is_leaves[i]:
        print(
            "{space}node={node} is a leaf node.".format(
                space=node_depth[i] * "\t", node=i
            )
        )
    else:
        print(
            "{space}node={node} is a split node: "
            "go to node {left} if X[:, {feature}] <= {threshold} "
            "else to node {right}.".format(
                space=node_depth[i] * "\t",
                node=i,
                left=children_left[i],
                feature=feature[i],
                threshold=threshold[i],
                right=children_right[i],
            )
        )
