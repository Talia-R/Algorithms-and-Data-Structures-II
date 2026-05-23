public class App {

    static <T extends Comparable<T>> int initBinarySearch(T[] array, T chave){
        return binarySearch(array, chave, 0, array.length-1);
    }

    static <T extends Comparable<T>> int  binarySearch(T[] vetor, T chave, int inicio, int fim){
        if(inicio > fim) return -1;

        int meio = (inicio + fim) / 2;

        if (vetor[meio].compareTo(chave) == 0)
            return meio; // Condição de parada
        else if (chave.compareTo(vetor[meio]) < 0)
            return binarySearch(vetor, chave, inicio, meio - 1);
        else
            return binarySearch(vetor, chave, meio + 1, fim); // se n for nenhuma das de cima, a chave > meio, vetor

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Integer[] v = {4,8,11,15,16,23,42,57,61,87,92};
        // Integer target = 4;

        Character[] v = {'a','b','c','d'};
        Character target = 'd';
        
        System.out.println(initBinarySearch(v, target));


    }
}
