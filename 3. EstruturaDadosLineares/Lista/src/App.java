public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        int[] numeros = {5,9,2,78,0};

        for(int i = 0; i < numeros.length; i++){
            listaEncadeada.inserirFinal(numeros[i]);
        }

        // System.out.println(listaEncadeada.localizar(0));
        
        System.out.println(listaEncadeada.imprimir());
        listaEncadeada.trocar(5, 0);
        System.out.println(listaEncadeada.imprimir());
    }
}
