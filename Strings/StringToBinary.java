public class StringToBinary {
    public static void main(String[] args) {
        String str = "Amna";
        String BinaryString = ""; // extra space hata diya

        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            String binary = String.format("%8s", Integer.toBinaryString(ascii)).replace(' ', '0');

            BinaryString += binary; 
        }

        System.out.println(BinaryString);
    }
}
