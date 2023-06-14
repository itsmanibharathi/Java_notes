import java.util.*;
public class JavaCollection{
    public static void main(String arr[]){
        int arrs[]={5,4,3,2,1};
        // List<Integer> al= new ArrayList<>();
        // for(int i=0;i<arrs.length;i++)
        //     al.add(arrs[i]);
        // // System.out.print(al);
        // for(Integer x:al)
        //     System.out.print(x);
        Set <Integer> sl = new HashSet<>();
        Set <Integer> tsl = new TreeSet<>();
        Set <Integer> lsl = new LinkedHashSet<>();
        for(int i=0;i<arrs.length;i++){
            sl.add(arrs[i]);
            tsl.add(arrs[i]);
            lsl.add(arrs[i]);
        }
        // for(int i=0;i<sl.size;i++){
        //     System.out.print(sl.get(i));
        // }
    
        for(Integer x:sl)
            System.out.print(x); // 1 2 3 4 5
        System.out.println("");
        for(Integer x:tsl)
            System.out.print(x); // 1 2 3 4 5
        System.out.println("");
        for(Integer x:lsl)
            System.out.print(x); // 5 4 3 2 1
    }
}