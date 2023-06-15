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
    static int celebrity(boolean arr[][],int n){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
            st.push(i);
        while(st.size()>1){
            int a= st.pop();
            int b=st.pop();
            if(arr[a][b]==1){
                st.push(b);
            }
            else if(arr[b][a]) {
                st.push(a);
            }
        }
        int c= st.peek();
        for(int i =0 ; i< n;i++){
            if(arr[i][c]==0 && i != c){
                return -1;
            }
            if(arr[c][i]==0 && i != c){
                return -1;
            }
        }
        return c;
    }
    public static void main(String str[]){
        // reverseString("mani bharathi");
        // System.out.println(removeDuplication("azxxzy"));
        // int i= 10;
        // String s= String.valueOf(i);
        // System.out.print(i.getClass());
        int n=3;
        // boolean data[n][n]={{0,1,0},{0,0,0},{0,1,0}};
        System.out.print(celebrity({{0,1,0},{0,0,0},{0,1,0}},n));


    }
}