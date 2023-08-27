# Datos sobre Python utilizando scikit-learn (sklearn)

## scikit-learn (sklearn) para realizar clasificación sobre un conjunto de datos. 


1. Importación de bibliotecas:
   - `numpy` as `np` 
   - `sklearn`.
   - La función `load_iris` de `sklearn.datasets` es para cargar el conjunto de datos.
   - La función `train_test_split` de `sklearn.model_selection` para dividir los datos en conjuntos de entrenamiento y prueba.
   - La clase `KNeighborsClassifier` de `sklearn.neighbors` para crear un clasificador basado en k-Nearest Neighbors.

2. Cargar el conjunto de datos:
   - Se carga el conjunto de datos Iris utilizando la función `load_iris` y que se puede almacenar en una variable ej: `db_iris`.
   - El tipo de objeto cargado (bunch) es un diccionario `db_iris`.

3. División de datos para entrenamiento y prueba:
   - Dividir el conjunto de datos en datos de entrenamiento y prueba utilizando la función `train_test_split`. Los datos se dividen en características de entrenamiento (`x_entrenar`), características de prueba (`x_test`), etiquetas de entrenamiento (`y_entrenar`) y etiquetas de prueba (`y_test`).
   ```python
   x_entrenar, x_test, y_entrenar, y_test = train_test_split(x_data, y_data)
   ```

4. Clasificación utilizando k-Nearest Neighbors:
   - Se crea un clasificador `KNeighborsClassifier` con un valor de `n_neighbors`.
   - El clasificador se entrena utilizando los datos de entrenamiento mediante el método `fit`.
   - Se calcula y se imprime la precisión de las predicciones en los datos de prueba mediante el método `score`.
   - Se realizan predicciones sobre nuevos patrones (conjuntos de características) y se imprimen las clases predichas y sus nombres correspondientes en `db_iris['target_names']`.

5. Predicciones adicionales:
   - Se realizan predicciones sobre patrones de características y se imprimen las clases predichas y sus nombres correspondientes en `db_iris['target_names']`.



### train_test_split   Función para dividir los datos
*Regresa grupos entreamiento y pruebas, recibe datos y clasificación*
```python
x_entrenar, x_test, y_entrenar, y_test = train_test_split(x_data, y_data )
```

```python
print(x_entrenar.shape)     #Grupo entrenamiento
print(y_entrenar.shape)     #Grupo entrenamiento clase

knn.fit(x_entrenar, y_entrenar)             #Entrenamiento

aprend = knn.score(x_test, y_test)          #Pruebas (Aprendizaje)

clasif = knn.predict([[3.5, 1.5, 2.0, 0.8]])    # MI Nuevo patrón
```