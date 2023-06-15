class Jump
{
    void method()
    {
        Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int v=arr[0],c=1;
    while(v<n)
    {
        v=v+arr[v];
        c++;
    }
    System.out.println(c);
    }
   
}

