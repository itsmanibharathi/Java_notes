class Node{
    int data;
    Node next;
    // Node(){
    // }
    Node(int x){
        data=x;
        next=null;
    }
}
public class LinkedList{
    static Node insetBeginning(Node head,int data){
        Node newNode = new Node(data);
        newNode.next= head;
        return newNode;
    }
    static Node insertEnd(Node head,int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return head;
        }
        Node temp = head;
        while(head.next != null){
            temp=temp.next;
        }
        temp.next= newNode;
        return head;    
    }
    static void display(Node head){
        Node temp= head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
    static int size(Node temp){
        // Node temp= head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    static int max(Node temp){
        // Node temp= head;
        int max=0;
        while(temp != null){
            if(temp.data >max)
                max=temp.data;
            temp=temp.next;
        }
        return max;
    }
    static boolean find(Node temp,int key){
        while(temp != null){
            if(temp.data ==key)
                return true;
            temp=temp.next;
        }
        return false;
    }
    public static void main(String str[]){
        Node head= null;
        head =insetBeginning(head,6);
        head =insetBeginning(head,5);
        head =insetBeginning(head,2);
        head =insetBeginning(head,3);
        display(head);
        System.out.println("Size of linked list is "+ size(head));
        System.out.println("Max element in linked list is "+ max(head));
        System.out.println("fin 3 in linked list is "+ find(head,8));
    }
}