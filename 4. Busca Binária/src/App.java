public class App {

    static int initBinarySearch(int[] array, int chave){
        return binarySearch(array, chave, 0, array.length-1);
    }

    static int binarySearch(int[] vetor, int chave, int inicio, int fim){
        if(inicio > fim) return -1;

        int meio = (inicio + fim) / 2;

        if (vetor[meio] == chave)
            return meio; // Condição de parada
        else if (chave < vetor[meio])
            return binarySearch(vetor, chave, inicio, meio - 1);
        else
            return binarySearch(vetor, chave, meio + 1, fim); // se n for nenhuma das de cima, a chave > meio, vetor

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] v = {4,8,11,15,16,23,42,57,61,87,92};
        int target = 3;

        System.out.println(initBinarySearch(v, target));


    }
}
