import java.util.*;
public class JavaCollection{
    public static void main(String arr[]){
        int arrs[]={1,2,3,4,5,1,2,3,4,5};
        // List<Integer> al= new ArrayList<>();
        // for(int i=0;i<arrs.length;i++)
        //     al.add(arrs[i]);
        // // System.out.print(al);
        // for(Integer x:al)
        //     System.out.print(x);
        Set <Integer> sl = new HashSet<>();
        for(int i=0;i<arrs.length;i++){
            sl.add(arrs[i]);
        }
        // for(int i=0;i<sl.size;i++){
        //     System.out.print(sl.get(i));
        // }
        for(Integer x:sl)
            System.out.print(x+"   ");
    }
}