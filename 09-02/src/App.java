import java.util.Scanner;

public class App {
    static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String s){
        System.out.print("\n" + s);
        return Integer.parseInt(entrada.nextLine());
    }

    public static String menu(){
        StringBuilder s = new StringBuilder();
        s.append("\nMenu");
        s.append("\n1) Soma de números pares");
        s.append("\n2) Somar elementos de um vetor de doubles");
        s.append("\n3) Contar quantidade de repetições de um laço");
        return s.toString();
    }

    public static int somarPares(int limite, int total){

        if(limite > 0){
                // if(ePar(limite))
                    // total += limite; 
            somarPares(--limite, total);
        }

        return ePar(limite) ? total+= limite : total;
    }

    public static boolean ePar(int x){
        return x % 2 == 0;
    }

    public static void main(String[] args) throws Exception {
        
        System.out.println(menu());
        int escolha;

        do{
            escolha = Integer.parseInt(entrada.nextLine());
            switch(escolha){
                case 1 -> {
                    int max = lerInteiro("Digite até qual número deseja a soma: ");
                    int totalPares = 0;
                    System.out.println(somarPares(max, totalPares));
                }
            }

        } while(escolha != 0);  

        entrada.close();
    }
    

}
