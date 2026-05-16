public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //FilaVetor fila = new FilaVetor<>(Integer.class, 5);
        FilaEncadeada fila = new FilaEncadeada<>();

        fila.enfileirar(5);
        fila.enfileirar(10);
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
        
    }
}
