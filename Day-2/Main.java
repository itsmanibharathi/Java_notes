import java.util.*;
public class Main{
    void arrayLeaders(int arr[]){

    }
    static void sumOfPairs(int arr[],int sum){
        int count = 0;
        for (int i =0 ;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if( arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }   
        System.out.println(count);
    }
    static void union(int[] arr1,int[] arr2){
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        int n=arr1.length;
        int m=arr2.length;
        int i=0,j=0;
        while(i<n && j< m){
            if(arr1[i]< arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if(arr2[j]< arr1[i]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else{
                System.out.print(arr2[j]+" ");
                i++;
                j++;
            }
        }
        while(i<n)
            System.out.print(arr1[i++]+" ");
        while(j<m)
            System.out.print(arr2[j++]+" ");

    }
    static void intersectionhash(int[] arr1,int[] arr2){
        Set<Integer> a1= new HashSet<>();
        Set<Integer> a2= new HashSet<>();
        for(int i=0;i<arr1.length;i++)
            a1.add(arr1[i]);
        for(int i=0;i<arr2.length;i++)
            a2.add(arr2[i]);
        a1.retainAll(a2);
        System.out.print(a1);
    }
    static void intersection(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n=arr1.length;
        int m=arr2.length;
        int i=0,j=0;
        while(i<n && j< m){
            if(arr1[i]< arr2[j]){
                i++;
                // System.out.print(arr1[i]+" ");
            }
            else if(arr2[j]< arr1[i]){
                j++;
                // System.out.print(arr2[j]+" ");
            }
            else{
                System.out.print(arr2[j]+" ");
                i++;
                j++;
            }
        }

    }
    static void zigzag(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    static void arraymaxmin(){
        int arr[]={10,20,30,40,50,60,70,80,90,110};
        int a=0 ,b=arr.length-1;
        while(a<b){ // double pointer
            System.out.print(arr[b--]+" "+ arr[a++]+ " ");
        }
    }

    public static void main(String arr[]){
        int data1[]={1,2,3,4};
        int data2[]={2,3,4,5};
        // sumOfPairs(data,6); // sunofpairs
        // union(data1,data2);
        // intersection(data1,data2);
        // intersectionhash(data1,data2);
        // zigzag(data1);
        arraymaxmin();



    }
}