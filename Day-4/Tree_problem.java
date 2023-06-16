import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class Tree_problem{
    static void inorder(Node root){
        Node temp= root;
        if(temp==null){
                return ;
        }
        inorder(temp.left);
        System.out.print(temp.data+ " ");
        inorder(temp.right);
    }
    static void preeorder(Node root){
        Node temp= root;
        if(temp==null){
                return ;
        }
        System.out.print(temp.data+ " ");
        inorder(temp.left);
        inorder(temp.right);
    }
    static void postorder(Node root){
        Node temp= root;
        if(temp==null){
                return ;
        }
        inorder(temp.left);
        inorder(temp.right);
        System.out.print(temp.data+ " ");
    }
    static void levelorder(Node root){ // Level Order using Queue ;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        int count=0;
        while(!q.isEmpty()){
            Node temp = q.poll();
            count++;
            if(temp.left!= null)
                q.add(temp.left);
            if(temp.right!= null)
                q.add(temp.right);
            System.out.print(temp.data+ " ");
        }
        System.out.println("size  :"+count);
    }
    static Node insert(Node root,int data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        else if(root.data < data) {
            root.right = insert(root.right,data);
        }
        else{
            root.left = insert(root.left,data);
        }
        return root;
    }
    static int min(Node root){
        Node temp= root;
        if(temp == null){
            return -1;
        }
        while(temp.left != null){
            temp= temp.left;
        }
        return temp.data;
    }
    static int max(Node root){
        Node temp= root;
        if(temp == null){
            return -1;
        }
        while(temp.right != null){
            temp= temp.right;
        }
        return temp.data;
    }
    static int maxreg(Node root){
        Node temp= root;
        if(temp == null){
            return -1;
        }else if(temp.right == null){
            return temp.data;
        }
        return maxreg(temp.right);
        // while(temp.right != null){
        //     temp= temp.right;
        // }
        // return temp.data;
    }
    static Boolean bstsearch(Node temp,int key){  // binary search
        while(temp != null){
            if(temp.data < key){
                temp=temp.right;
            }
            else if(temp.data > key){
                temp=temp.left;
            }
            else 
                return true;
        }
        return false; 
        // if(temp ==null){
        //     return null;
        // }else if(temp.data == key){
        //     return temp;
        // }
        // else if(temp.data<= key){
        //     return bstsearch(temp.right);
        // }
        // else
        //     return bstsearch(temp.right);
        
    }
    static int treehight(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        int hight=0;
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp == null)
                hight++;
            if(temp != null){
                if(temp.left!= null)
                    q.add(temp.left);
                if(temp.right!= null)
                    q.add(temp.right);
            }
            else if(!q.isEmpty())
                q.add(null);
        }
        return hight;
        
    }
    public static void main(String str[]){
        
        // System.out.print("hi");
        // Node root = null;
        // root= new Node(10);
        // root.left= new Node(5);
        // root.right= new Node(15);
        // preeorder(root);
        // System.out.println(" ");
        // inorder(root);
        // System.out.println(" ");
        // postorder(root);
        // System.out.println(" ");
        // levelorder(root);


        //---------------------------
        // Binary tree
        Node root = null;
        // root = insert(root,20);
        // root = insert(root,27);
        // root = insert(root,13);
        // root = insert(root,9);
        // root = insert(root,14);
        // root = insert(root,21);
        // root = insert(root,23);
        root = insert(root,60);
        root = insert(root,10);
        root = insert(root,70);
        root = insert(root,40);
        root = insert(root,30);
        root = insert(root,50);
        root = insert(root,20);
        inorder(root);
        // System.out.println();
        // levelorder(root);
        // System.out.println(min(root));
        // System.out.println(maxreg(root));
        // System.out.println(bstsearch(root,20));
        System.out.println("Hight of the tree : "+ treehight(root));
        // System.out.println(bstsearch(root,20));


    }
}