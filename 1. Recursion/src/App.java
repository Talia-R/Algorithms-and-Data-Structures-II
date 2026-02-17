import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static int readInt(String s){
        System.out.print("\n" + s);
        return Integer.parseInt(input.nextLine());
    }

    public static String menu(){
        StringBuilder s = new StringBuilder();
        s.append("\nMenu");
        s.append("\n1) Soma de números pares");
        s.append("\n2) Somar elementos de um vetor de doubles");
        s.append("\n3) Contar quantidade de repetições de um laço");
        s.append("\nExtras");
        s.append("\n4) Fatorial");

        return s.toString();
    }

    public static int sumEven(int limit, int total){

        if(limit > 0){
                // if(ePar(limite))
                    // total += limite; 
            sumEven(--limit, total);
        }

        return isEven(limit) ? total+= limit : total;
    }

    public static boolean isEven(int x){
        return x % 2 == 0;
    }

    public static int factorial(int x){
        int total;
        if(x == 1){
           total = 1;
        } else {
            total = x * factorial(x-1);
        }
        return total;
    }
    public static void main(String[] args) throws Exception {
        int entry;
        
        do{
            System.out.println(menu());
            entry = Integer.parseInt(input.nextLine());
            switch(entry){
                case 1 -> {
                    int max = readInt("Digite até qual número deseja a soma: ");
                    int totalEven = 0;
                    System.out.println(sumEven(max, totalEven));
                }
                case 4 -> {
                    System.out.println(" --- Fatorial ---");
                    int x = readInt("Qual fatorial deseja saber?: ");
                    System.out.printf("O fatorial de %d é: %d.", x, factorial(x));
                }
            }

        } while(entry != 0);  

        input.close();
    }
    

}
