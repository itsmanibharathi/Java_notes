import java.util.*;
public class StackProblem{
    static void reverseString(String str){
        Stack<String> st= new Stack<>();
        String data[]= str.split(" ");
        for(int i =0 ; i<data.length;i++){
            st.push(data[i]);
        }
        while(!st.isEmpty())
            System.out.println(st.pop()+" ");
    }
    static String removeDuplication(String str){
        Stack<Character> st = new Stack<>();
        for(int i =0 ;i<str.length();i++){
            char c = str.charAt(i); 
            if(!st.isEmpty() && st.peek() == c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        System.out.print(sb.reverse());
        return sb.reverse().toString();
    }
    public static void main(String str[]){
        // reverseString("mani bharathi");
        System.out.println(removeDuplication("azxxzy"));
        int i= 10;
        String s= String.valueOf(i);
        System.out.print(i.getClass());


    }
}