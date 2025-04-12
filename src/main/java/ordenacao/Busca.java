package ordenacao;
import interfaces.Busca_IF;

public class Busca implements Busca_IF {

    @Override
    public boolean buscaLinearIterativa(int[] array, int valor) {
        for (int i : array) if (i == valor) return true;
        return false;
    }

    @Override
    public boolean buscaLinearRecursiva(int[] array, int valor, int index) {
        if (index >= array.length) return false;
        return array[index] == valor || buscaLinearRecursiva(array, valor, index + 1);
    }

    @Override
    public boolean buscaLinearDuasPontas(int[] array, int valor) {
        int i = 0, j = array.length - 1;
        while (i <= j) {
            if (array[i] == valor || array[j] == valor) return true;
            i++; j--;
        }
        return false;
    }

    @Override
    public boolean buscaBinariaIterativa(int[] array, int valor) {
        int esq = 0, dir = array.length - 1;
        while (esq <= dir) {
            int meio = (esq + dir) / 2;
            if (array[meio] == valor) return true;
            if (array[meio] < valor) esq = meio + 1;
            else dir = meio - 1;
        }
        return false;
    }

    @Override
    public boolean buscaBinariaRecursiva(int[] array, int valor, int inicio, int fim) {
        if (inicio > fim) return false;
        int meio = (inicio + fim) / 2;
        if (array[meio] == valor) return true;
        if (array[meio] < valor)
            return buscaBinariaRecursiva(array, valor, meio + 1, fim);
        else
            return buscaBinariaRecursiva(array, valor, inicio, meio - 1);
    }

    @Override
    public int[] geraVetorNumericoOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) vetor[i] = i;
        return vetor;
    }
}
