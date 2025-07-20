import java.util.*;

public class Substring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //acdddabcdef

        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
        sc.close();
    }

    public static int lengthOfLongestSubstring(String s){
        Set<Character> seen = new HashSet<>();
        int maxlength = 0; 
        int i = 0, j = 0;

        while (j < s.length()) {
            if (!seen.contains(s.charAt(j))) {
                seen.add(s.charAt(j));
                maxlength = Math.max(maxlength, j - i + 1);
                j++;
            }else{
                seen.remove(s.charAt(i));
                i++;
            }
        }
        return maxlength;
        
    }
}




// import java.util.*;

// public class Substring {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int result = lengthOfLongestSubstring(s);
//         System.out.println(result);
//         sc.close();
//     }

//     public static int lengthOfLongestSubstring(String s) {
//         Set<Character> seen = new HashSet<>();
//         int maxlength = 0;
//         int i = 0, j = 0;

//         while (j < s.length()) {
//             if (!seen.contains(s.charAt(j))) {
//                 seen.add(s.charAt(j));
//                 maxlength = Math.max(maxlength, j - i + 1);
//                 j++;
//             }
//             else {
//                 seen.remove(s.charAt(i));
//                 i++;
//             }

//         }
//         return maxlength;
//     }
// }