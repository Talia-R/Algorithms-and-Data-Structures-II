import java.util.Scanner;

public class App {
    static Scanner entrada = new Scanner(System.in);

    static int lerInteiro(String s){
        System.out.println("Insira um inteiro: ");
        int dado = Integer.parseInt(entrada.nextLine());
        return dado;
    }

    static String lerString(String s) {
        System.out.println("Insira uma string: ");
        String dado = entrada.nextLine();
        return dado;
    }

    static double lerDouble(String s) {
        System.out.println("Insira um double: ");
        double dado = Double.parseDouble(entrada.nextLine());
        return dado;
    }

    static String menuPrincipal(){
        StringBuilder s = new StringBuilder();
        s.append("\n 1)Pilha Vetor");
        s.append("\n 2)Pilha Célula");

        return s.toString();
    }

    static String menuClassesPilhaVetor() {
        StringBuilder s = new StringBuilder();
        s.append("\n 1) Inteiro");
        s.append("\n 2)Double");
        s.append("\n 3)String");

        return s.toString();
    }

    static String menuInteracoesPilhaVetor() {
        StringBuilder s = new StringBuilder();
        s.append("\n 1) Push");
        s.append("\n 2) Pop");
        s.append("\n 3)String");

        return s.toString();
    }


    static PilhaVetor criarPilhaVetor(){
        int tamanho = lerInteiro("Qual o tamanho da Vetor?: ");

        System.out.println(menuClassesPilhaVetor());
        int tipo = lerInteiro("Qual o tipo dos dados?: ");

        PilhaVetor novaPilha;
        
        switch(tipo){
            case 1 -> novaPilha = new PilhaVetor<>(Integer.class, tamanho);
            case 2 -> novaPilha = new PilhaVetor<>(Double.class, tamanho);
            case 3 -> novaPilha = new PilhaVetor<>(String.class, tamanho);
            default -> novaPilha = new PilhaVetor<>(Integer.class, tamanho);
        }

        return novaPilha;
    }

    static void interacaoPilhaVetor(PilhaVetor pilha){
        
    }



    public static void main(String[] args) throws Exception {
       /* System.out.println(menuPrincipal());
        int opcao = Integer.parseInt(entrada.nextLine());



        switch(opcao){
            case 1 -> {
                System.out.println("--- Pilha Vetor ---");
                PilhaVetor novaPilha = new PilhaVetor<>(Integer.class, 3);

                novaPilha.push(10);
                novaPilha.verPilha();
                novaPilha.push(5);
                novaPilha.verPilha();
                novaPilha.push(7);

                novaPilha.pop();
                novaPilha.verPilha();

                novaPilha.push(5);
                novaPilha.verPilha();
            }
        }
        */

        System.out.println("--- Pilha Encadeada ---");
        PilhaEncadeada pilhaEncadeada = new PilhaEncadeada();
        pilhaEncadeada.push(10);
    
    
    }
}
