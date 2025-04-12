package ordenacao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OrdenacaoTest {

    private final Ordenacao ordenacao = new Ordenacao();

    private int[] numerosDesordenados = {
        1,3,5,7,9,2,4,6,8,10,11,13,15,12,14
    };
    
    @Test
    public void testChecaVetorOrdenado() {
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original, para os testes, não deve estar ordenado
    }

    @Test
    public void testBubbleSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        ordenacao.bubbleSort(numerosDesordenadosClonados);
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testSelectionSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        ordenacao.selectionSort(numerosDesordenadosClonados);
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
   }
    
    @Test
    public void testInsertionSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        ordenacao.insertionSort(numerosDesordenadosClonados);
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testMergeSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        ordenacao.mergeSort(numerosDesordenadosClonados);
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testQuickSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        ordenacao.quickSort(numerosDesordenadosClonados);
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testRandomQuickSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        ordenacao.quickSort(numerosDesordenadosClonados);
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testQuickSortJava() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        ordenacao.quickSort(numerosDesordenadosClonados);
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }
    
    @Test
    public void testCountingSort() {
    	int[] numerosDesordenadosClonados = numerosDesordenados.clone();
        ordenacao.countingSort(numerosDesordenadosClonados);
        assertTrue(ordenacao.checaVetorOrdenado(numerosDesordenadosClonados)); // O vetor clonado deve estar ordenado após executar o método
        assertFalse(ordenacao.checaVetorOrdenado(numerosDesordenados)); // O vetor original não deve estar ordenado após executar o método
    }

}