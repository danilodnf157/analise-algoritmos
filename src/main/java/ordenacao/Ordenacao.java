package ordenacao;

import interfaces.Ordenacao_IF;
import java.util.Random;

import java.util.Arrays;
import java.util.Random;

public class Ordenacao implements Ordenacao_IF {

    @Override
    public long bubbleSort(int[] array) {
        long inicio = System.nanoTime();
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return System.nanoTime() - inicio;
    }

    @Override
    public long selectionSort(int[] array) {
        long inicio = System.nanoTime();
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return System.nanoTime() - inicio;
    }

    @Override
    public long insertionSort(int[] array) {
        long inicio = System.nanoTime();
        for (int i = 1; i < array.length; i++) {
            int chave = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }
        return System.nanoTime() - inicio;
    }

    @Override
    public long mergeSort(int[] array) {
        long inicio = System.nanoTime();
        mergeSortRec(array, 0, array.length - 1);
        return System.nanoTime() - inicio;
    }

    private void mergeSortRec(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortRec(array, inicio, meio);
            mergeSortRec(array, meio + 1, fim);
            intercalar(array, inicio, meio, fim);
        }
    }

    private void intercalar(int[] array, int inicio, int meio, int fim) {
        int[] esquerda = Arrays.copyOfRange(array, inicio, meio + 1);
        int[] direita = Arrays.copyOfRange(array, meio + 1, fim + 1);
        int i = 0, j = 0, k = inicio;
        while (i < esquerda.length && j < direita.length) {
            array[k++] = (esquerda[i] <= direita[j]) ? esquerda[i++] : direita[j++];
        }
        while (i < esquerda.length) array[k++] = esquerda[i++];
        while (j < direita.length) array[k++] = direita[j++];
    }

    @Override
    public long quickSort(int[] array) {
        long inicio = System.nanoTime();
        quickSortRec(array, 0, array.length - 1);
        return System.nanoTime() - inicio;
    }

    private void quickSortRec(int[] array, int esq, int dir) {
        if (esq < dir) {
            int p = particionar(array, esq, dir);
            quickSortRec(array, esq, p - 1);
            quickSortRec(array, p + 1, dir);
        }
    }

    private int particionar(int[] array, int esq, int dir) {
        int pivo = array[esq];
        int i = esq + 1;
        int j = dir;
        while (i <= j) {
            while (i <= j && array[i] <= pivo) i++;
            while (i <= j && array[j] > pivo) j--;
            if (i < j) trocar(array, i, j);
        }
        trocar(array, esq, j);
        return j;
    }

    @Override
    public long quickSortShuffle(int[] array) {
        embaralhar(array);
        return quickSort(array);
    }

    private void embaralhar(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int j = rand.nextInt(array.length);
            trocar(array, i, j);
        }
    }

    @Override
    public long quickSortJava(int[] array) {
        long inicio = System.nanoTime();
        Arrays.sort(array);
        return System.nanoTime() - inicio;
    }

    @Override
    public long countingSort(int[] array) {
        long inicio = System.nanoTime();
        int max = Arrays.stream(array).max().orElse(0);
        int[] count = new int[max + 1];
        for (int num : array) count[num]++;
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) array[index++] = i;
        }
        return System.nanoTime() - inicio;
    }

    @Override
    public boolean checaVetorOrdenado(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }

    private void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}