public class Main {
    public static void main(String[] args) {

        MisAlgoritmos misAlgoritmos = new MisAlgoritmos();

        int[] numeros = {2, 5, 8, 12, 16, 23, 38, 45};

        System.out.println(misAlgoritmos.binarySearch(numeros, 23));
        System.out.println(misAlgoritmos.binarySearch(numeros, 100));

        int[] desordenado = {70, 12, 19, 45, 11, 33, 26};
        int[] ordenado = misAlgoritmos.selectionSort(desordenado);
        for (int i = 0; i < ordenado.length; i++) {
            System.out.println(ordenado[i]);
        }
        System.out.println("     ");

        int[] desordenado2 = {70, 12, 19, 45, 11, 33, 26};
        int[] ordenado2 = misAlgoritmos.insertionSort(desordenado2);
        for (int i = 0; i < ordenado2.length; i++) {
            System.out.println(ordenado2[i]);
        }

        System.out.println("     ");

        int[] desordenado3 = {70, 12, 19, 45, 11, 33, 26};

        int[] ordenado3 = misAlgoritmos.bubbleSort(desordenado3);

        for (int i = 0; i < ordenado3.length; i++) {
            System.out.println(ordenado3[i]);
        }
        System.out.println("     ");

        int[] desordenado4 = {70, 12, 19, 45, 11, 33, 26};

        int[] ordenado4 = misAlgoritmos.mergeSort(desordenado4);

        for (int i = 0; i < ordenado4.length; i++) {
            System.out.println(ordenado4[i]);
        }
        System.out.println("     ");

        int[] desordenado5 = {70, 12, 19, 45, 11, 33, 26};

        int[] ordenado5 = misAlgoritmos.quickSort(desordenado5);

        for (int i = 0; i < ordenado5.length; i++) {
            System.out.println(ordenado5[i]);
        }
    }
}