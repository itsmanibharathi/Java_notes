import java.util.*;
public class BracketBalanc{
    static boolean check(String val){
        Stack<Character> sc= new Stack<>();
        for(int i=0;i<val.length();i++){
            char x = val.charAt(i);
            if(x=='('|| x== '{'|| x== '['){
                sc.push(x);
                System.out.println("-->"+x);
            }
            else if(x==')'||x=='}'||x==']'){
                if(sc.peek()==x){
                    System.out.println(x);
                    return false;
                }
                else{
                    System.out.println(x);
                    sc.pop();
                }
            }
        }
        return (sc.isEmpty());
    }
    public static void main(String str[]){
        System.out.print(check("{([])}"));
    }
}