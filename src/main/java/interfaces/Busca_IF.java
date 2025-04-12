package interfaces;
public interface Busca_IF {
    boolean buscaLinearIterativa(int[] array, int valor);
    boolean buscaLinearRecursiva(int[] array, int valor, int index);
    boolean buscaLinearDuasPontas(int[] array, int valor);
    boolean buscaBinariaIterativa(int[] array, int valor);
    boolean buscaBinariaRecursiva(int[] array, int valor, int inicio, int fim);
    int[] geraVetorNumericoOrdenado(int tamanho);
}
