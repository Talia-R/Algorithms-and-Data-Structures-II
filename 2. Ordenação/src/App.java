public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        Mergesort mergesort = new Mergesort(array);
        mergesort.mergesort(0, array.length-1);
    }
}
