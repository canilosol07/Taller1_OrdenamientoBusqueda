public class MisAlgoritmos implements Ordenamientos, Busquedas {
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
        for (int i = 0; i < arrayPorExplorar.length; i++) {
            if (arrayPorExplorar[i] == elementoABuscar) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {

        int inicio = 0;
        int fin = arrayPorExplorar.length - 1;

        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            if (arrayPorExplorar[medio] == elementoABuscar) {
                return medio;
            } else if (arrayPorExplorar[medio] < elementoABuscar) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }

    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        int[] array = arrayDesordenado.clone();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temporal = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporal;
                }
            }
        }

        return array;
    }

    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        int[] array = arrayDesordenado.clone();

        for (int i = 0; i < array.length - 1; i++) {

            int posicionMenor = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[posicionMenor]) {
                    posicionMenor = j;
                }
            }


            int temporal = array[i];
            array[i] = array[posicionMenor];
            array[posicionMenor] = temporal;
        }

        return array;
    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {
        int[] array = arrayDesordenado.clone();

        for (int i = 1; i < array.length; i++) {

            int actual = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > actual) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = actual;
        }

        return array;
    }

    @Override
    public int[] mergeSort(int[] arrayDesordenado) {

        if (arrayDesordenado.length <= 1) {
            return arrayDesordenado;
        }
        int mitad = arrayDesordenado.length / 2;
        int[] izquierda = new int[mitad];
        int[] derecha = new int[arrayDesordenado.length - mitad];
        for (int i = 0; i < mitad; i++) {
            izquierda[i] = arrayDesordenado[i];
        }
        for (int i = mitad; i < arrayDesordenado.length; i++) {
            derecha[i - mitad] = arrayDesordenado[i];
        }
        izquierda = mergeSort(izquierda);
        derecha = mergeSort(derecha);

        int[] resultado = new int[arrayDesordenado.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] < derecha[j]) {
                resultado[k] = izquierda[i];
                i++;
            } else {
                resultado[k] = derecha[j];
                j++;
            }
            k++;
        }

        while (i < izquierda.length) {
            resultado[k] = izquierda[i];
            i++;
            k++;
        }

        while (j < derecha.length) {
            resultado[k] = derecha[j];
            j++;
            k++;
        }

        return resultado;
    }
    @Override
    public int[] quickSort(int[] arrayDesordenado) {

        int[] array = arrayDesordenado.clone();

        quickSort(array, 0, array.length - 1);

        return array;
    }


    public void quickSort(int[] array, int inicio, int fin) {

        if (inicio < fin) {

            int pivote = array[fin];

            int i = inicio - 1;

            for (int j = inicio; j < fin; j++) {

                if (array[j] < pivote) {

                    i++;

                    int temporal = array[i];
                    array[i] = array[j];
                    array[j] = temporal;
                }
            }

            int temporal = array[i + 1];
            array[i + 1] = array[fin];
            array[fin] = temporal;

            int posicionPivote = i + 1;

            quickSort(array, inicio, posicionPivote - 1);
            quickSort(array, posicionPivote + 1, fin);
        }
    }
    }
