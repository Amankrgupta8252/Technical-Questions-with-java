public class Fibonacci {
   public static void main(String[] args) {
    int a = 6;

    int fibo = fiboOfa(a);
    System.out.println(fibo);
   }
   public static int fiboOfa(int a) {
        if (a == 0) return 0;
        if (a == 1) return 1;

        return fiboOfa(a - 1) + fiboOfa(a - 2);
   }
}
