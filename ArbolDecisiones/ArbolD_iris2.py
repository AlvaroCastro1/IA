import matplotlib.pyplot as plt
from sklearn import tree
from sklearn.datasets import load_iris
from sklearn.model_selection import cross_val_score, train_test_split

db_iris = load_iris()
# data clase
data_train, data_test, c_train, c_test = train_test_split(db_iris.data, db_iris.target)


##ARBOL DE DECISIÓN
t = tree.DecisionTreeClassifier()  #max_depth=3)

t = t.fit( data_train, c_train )

score = t.score(data_test, c_test)
print('Score - test: ', score)

score = t.score(data_train, c_train)
print('Score - entrenamiento: ', score)

# export to .dot 
# proporcionar los nombres de las características utilizadas en el árbol de decisión
# nombres de las clases a las que se hacen referencia en el árbol de decisión
# colorear el fondo de los nodos 
tree.export_graphviz(t, out_file="arbol_iris.dot",
                     feature_names = db_iris.feature_names,
                     class_names = db_iris.target_names, filled=True)

plt.figure('Arbol')
tree.plot_tree(t, filled=True)
plt.show()
#                       arbol   características  labels     k
presc = cross_val_score(t, db_iris.data, db_iris.target, cv=5)
print("Precisión: %0.2f (+/- %0.2f)"%(presc.mean(), presc.std()*2))



obj=[[4.6,3.5,1.4,0.3]]
obj_p = t.predict(obj)
print(obj_p,' = ', db_iris.target_names[obj_p])

obj=[[7.6,2.5,6.4,2.3]]
obj_p = t.predict(obj)
print(obj_p,' = ', db_iris.target_names[obj_p])

obj=[[5.5,3.5,4.4,1.3]]
obj_p = t.predict(obj)
print(obj_p,' = ', db_iris.target_names[obj_p])

obj=[[5.5,2.4,3.8,1.1]]
obj_p = t.predict(obj)
print(obj_p,' = ', db_iris.target_names[obj_p])

obj=[[6.7,3.3,5.4,2.3]]
obj_p = t.predict(obj)
print(obj_p,' = ', db_iris.target_names[obj_p])

# nuevo objeto 
obj=[[4.1,3.9,1.9,0.3]]
# predecir su clase
obj_p = t.predict(obj)
# mostrar su clase y el nombre de la clase
print(obj_p,' = ', db_iris.target_names[obj_p])


