public class Busca {
    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }