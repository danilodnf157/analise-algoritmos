package interfaces;


public interface Ordenacao_IF {
    long bubbleSort(int[] array);
    long selectionSort(int[] array);
    long insertionSort(int[] array);
    long mergeSort(int[] array);
    long quickSort(int[] array);
    long quickSortShuffle(int[] array);
    long quickSortJava(int[] array);
    long countingSort(int[] array);
    boolean checaVetorOrdenado(int[] array);
}
