// import java.util.*;
// public class Strings{
//     static void anagram(char[])
//     public static void main(String []arr){
        
//     }
// }
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the first string: ");
        // String str1 = scanner.nextLine();
        // System.out.print("Enter the second string: ");
        // String str2 = scanner.nextLine();

        // if (isAnagram(str1, str2)) {
        //     System.out.println("The strings are anagrams.");
        // } else {
        //     System.out.println("The strings are not anagrams.");
        // }

        // check Pangram
        // System.out.print(checkPangram("qwertyuiopasdfghjklzxcvb nm"));
        // System.out.print(areRoration("abcd","cdab"));
    }
    static boolean areRoration(String a,String b){
        return (a.length()==b.length()) && ((a+a).indexOf(b) != -1);
    }
    static boolean checkPangram(String str){
        Set<Character> fin = new HashSet<>();
        // for(int i=0;i<str.length();i++){
        for(char ch : str.toCharArray()){
            if(ch>= 'a' && ch<= 'z')
                fin.add(ch);
            else if(ch>='A'&& ch<='Z'){
                ch = Character.toLowerCase(ch);
                fin.add(ch);
            }

        }
        if(fin.size()==26)
            return true;
        else
            return false;
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!str2.contains(String.valueOf(ch))) {
                return false;
            }
        }
        return true;
    }
}
