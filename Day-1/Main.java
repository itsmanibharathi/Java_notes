// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setValue(1,"Mani",1000);
        obj.displaye();
        Employee obj1 = new Employee(2,"kali",123);
        obj1.displaye();
        Employee.change();
        obj.displaye();
        obj1.displaye();
        System.out.println(); //sout   
    }
}