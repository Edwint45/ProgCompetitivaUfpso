# <h1 align="center">BÚSQUEDA BINARIA</h1>

Este algoritmo permite buscar de una manera más eficiente un dato dentro de un arreglo, para hacer esto se determina el elemento central del arreglo y se compara con el valor que se está  buscando, si coincide termina la búsqueda y en caso de no ser así se determina si el dato es mayor o menor que el elemento central, de esta forma se elimina una mitad del arreglo junto con el elemento central para repetir el proceso hasta encontrarlo o tener solo un elemento en el arreglo. 

Para poder aplicar este algoritmo se requiere que el arreglo este ordenado. Esta basado en el paradigma divide y vencerás.

Tiene tres fórmulas fundamentales que se basan en el uso de los índices.
1) Para encontrar el pivote o medio (izq+der)/2
2) Para mover hacia la derecha (izq+der+1)/2
3) Para mover hacia la izquierda (izq-1+der)/2

<img src="https://uniwebsidad.com/static/libros/imagenes/algoritmos-python/f0801.png" width="500px" heigth="500px" alt="Imagen representativa"></img>

Dado el siguiente array: [1,3,5,7,9,11,13,15,17,19,21,23]
Buscar los valores indicados en la sección de Input e imprimir la cantidad de comparaciones y el índice donde se encuentra
# <h2>Input</h2>
*18 
*11 
*19 

# <h2>Output</h2>
*-1 
*1-5 
*4-9 