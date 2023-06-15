import java.util.*;
public class QueueProblem{
    static Booline stringRotait(String str){
        Queue<Character> q = new PriorityQueue<>();
        for(int i=0;i<str.length();i++){
            q.add(str.charAt(i));
        }
        int i= q.size();
        while(i-- > 0){
            System.out.println(q.peek());
        }
        return true;
    }
    public static void main (String str[]){
        stringRotait("mani");
    }
    
}