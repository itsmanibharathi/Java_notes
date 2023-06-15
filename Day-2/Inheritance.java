class A{
    int i=10;
}
class B extends A{
    int i=11;
    B(){
        System.out.println(super.i);
    }
}

public class Inheritance{
    public static void main(String []str){
        A obj = new A();
        System.out.println(obj.i);
        // System.out.println(obj.j);

    }
}
