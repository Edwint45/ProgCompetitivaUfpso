# <h1 align="center">BÚSQUEDA LINEAL</h1>

También llamada búsqueda secuencial. Es la más intuitiva que existe.

Este algoritmo compara uno a uno los elementos del arreglo indicando si el número buscado existe, hasta encontrarlo o recorrerlo por completo. No es necesario ordenar la lista de elementos y se podrá retornar el valor de la posición donde lo encontramos en caso de encontrarlo.

Si llegamos al final de la lista sin haber salido antes de la función es porque el valor de x no está en la lista, y en ese caso retornamos −1.

<img src="https://runestone.academy/ns/books/published/pythoned/_images/seqsearch2.png" alt="Imagen representativa"></img>

Dado el siguiente array: [17,20,26,31,44,54,55,65,77,93]
Buscar los valores indicados en la sección de Input e imprimir la cantidad de comparaciones y el índice donde se encuentra

# <h2>Input</h2>
* 54
* 17
* 77

# <h2>Output</h2>
* 6-5
* 1-0
* 9-8