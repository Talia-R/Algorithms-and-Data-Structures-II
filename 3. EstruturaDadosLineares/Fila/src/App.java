public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //FilaVetor fila = new FilaVetor<>(Integer.class, 5);
        FilaEncadeada<Integer> fila = new FilaEncadeada<>();

        /* 

        System.out.println(fila.imprimirFila());

        fila.desenfileirar();
        System.out.println(fila.imprimirFila());

        fila.enfileirar(20);
        System.out.println(fila.imprimirFila());

        fila.enfileirar(15);
        System.out.println(fila.imprimirFila());

        fila.enfileirar(35);
        System.out.println(fila.imprimirFila());

        fila.desenfileirar();
        System.out.println(fila.imprimirFila());

        fila.enfileirar(8);
        System.out.println(fila.imprimirFila());
        fila.desenfileirar();
        System.out.println(fila.imprimirFila());

        fila.desenfileirar();
        System.out.println(fila.imprimirFila());

        fila.desenfileirar();
        System.out.println(fila.imprimirFila());

        fila.desenfileirar();
        System.out.println(fila.imprimirFila());
        */

        int[] numeros = {1,2,3,5,10};
        for(int i = 0; i < numeros.length;i++){
            fila.enfileirar(numeros[i]);
        }
        System.out.print("Itens na fila: ");
        System.out.println(fila.imprimirFila());
        
        System.out.print("Quantidade números a frente: ");
        System.out.println(fila.obterNumItensAFrente(3));
        //System.out.println(fila.obterNumItensAFrente(15));


        System.out.println(fila.imprimirFila());
        System.out.print("Fila par: ");
        System.out.println(fila.dividir().imprimirFila());
        System.out.print("Fila impar: ");
        System.out.println(fila.imprimirFila());
        
    }
}
