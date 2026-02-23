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
        s.append("\n5) Fibonacci");
        s.append("\n6) Multiplicando X por Y vezes");

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
   
    public static int fibonacci(int x){
        int fib;
        if(x == 0 || x == 1){
            fib = 1;
        } else {
            fib = fibonacci(x-1) + fibonacci(x-2);
        }
        return fib;
    }

    public static int multiplyRecursiveAddition(int x, int y){
        int sum;
        if(y == 0){
            sum = 0;
        } else {
            sum = x + multiplyRecursiveAddition(x , y - 1);
        }
        return sum;
    }

    public static int biggestNumber(int[] numbers, int size){

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
                    System.out.print(" --- Fatorial ---");
                    int x = readInt("Deseja saber o fatorial de qual número?: ");
                    System.out.printf("O fatorial de %d é: %d.", x, factorial(x));
                }
                case 5 -> {
                    System.out.print(" --- Fibonacci ---");
                    int x = readInt("Deseja saber o Fibonacci de qual número?: ");
                    System.out.printf("O Fibonacci de %d é: %d.", x, fibonacci(x));
                }
                case 6 -> {
                    int x = readInt("Digite o primeiro número: ");
                    int y = readInt("Digite o segundo número: ");
                    System.out.println(multiplyRecursiveAddition(x, y));
                }
            }

        } while(entry != 0);  

        input.close();
    }
    

}
