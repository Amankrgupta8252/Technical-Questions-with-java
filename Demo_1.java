public class Demo_1 {
    public static void main(String[] args) {
        int Rs = 100;
        int A;
        int B;
        int C;

        A = Rs / 2;
        B = Rs / 3; 
        C = Rs / 6;
        int total = A + B + C;
        int remaining = Rs - total; 
        int  D = C + remaining;
        System.out.println("A gets: " + A);
        System.out.println("B gets: " + B);
        System.out.println("C gets: " + D);
        
    }
    
}
