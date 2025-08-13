public class palindrome1 {
     public static void main(String[] args) {
        String str = "I - love evol - I";

        // sab spaces remove
        String noSpaces = str.replaceAll("[\\s-]+", "").toLowerCase();
        

        String reverseStr = new StringBuilder(noSpaces).reverse().toString();

         if (reverseStr.equals(noSpaces)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
