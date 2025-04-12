package ordenacao;

import java.util.Random;
import java.util.Arrays;

public class TestePerformance {

    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();
        int[] vetorOriginal = gerarVetorAleatorio(100000); // teste com 1000, 10000, 100000...

        testarAlgoritmo("BubbleSort", vetorOriginal, ordenacao::bubbleSort);
        testarAlgoritmo("MergeSort", vetorOriginal, ordenacao::mergeSort);
        testarAlgoritmo("QuickSort", vetorOriginal, ordenacao::quickSort);
        testarAlgoritmo("QuickSort + Shuffle", vetorOriginal, ordenacao::quickSortShuffle);
        testarAlgoritmo("CountingSort", vetorOriginal, ordenacao::countingSort);
    }

    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = rand.nextInt(10000);
        }
        return vetor;
    }

    @FunctionalInterface
    interface MetodoOrdenacao {
        void ordenar(int[] array);
    }

    public static void testarAlgoritmo(String nome, int[] original, MetodoOrdenacao metodo) {
        int[] copia = Arrays.copyOf(original, original.length);
        long inicio = System.nanoTime();
        metodo.ordenar(copia);
        long fim = System.nanoTime();
        System.out.println(nome + " → " + (fim - inicio) + " ns");
    }
}
