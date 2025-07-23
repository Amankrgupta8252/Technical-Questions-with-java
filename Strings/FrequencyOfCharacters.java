/*

📊 7. Frequency of Characters
Input: "aabccc"
Output: a:2, b:1, c:3
📋 Har character kitni baar aaya?

 */

import java.util.*;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String CountChar = CountCharOfString(str);
        System.out.println("Remaining String: " + CountChar);
        sc.close();

    }
    public static String CountCharOfString(String str) {
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                    str = str.substring(0, j) + str.substring(j + 1);
                    j--;
                }
            }
            System.out.println(ch + ": " + count);
        }
        return str;
    }
}
