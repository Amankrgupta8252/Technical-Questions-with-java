/*

Input:  IX
Roman Value :- IX
9

 */

import java.util.*;

public class Roman_Int {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = s.toUpperCase();

        System.out.println("Roman Value :- " + str);

        int romanResult = romanValue(str);

        System.out.println("Integer Value :- " + romanResult);
        sc.close();

    }

    public static int romanValue(String str) {
        Map<Character, Integer> RomanMap = new HashMap<>();
        RomanMap.put('I', 1);
        RomanMap.put('V', 5);
        RomanMap.put('X', 10);
        RomanMap.put('L', 50);
        RomanMap.put('C', 100);
        RomanMap.put('D', 500);
        RomanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            int curr = RomanMap.get(str.charAt(i));
            int next = 0;

            if (i + 1 < str.length()) {
                next = RomanMap.get(str.charAt(i + 1));
            }

            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }
        return result;
    }
}
