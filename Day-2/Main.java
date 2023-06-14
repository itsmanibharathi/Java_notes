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
    
    public static void main(String arr[]){
        // int data[]={1,5,7,-2};
        // sumOfPairs(data,6); // sunofpairs 


    }
}