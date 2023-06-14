public class Employee {
    int id;
    String name;
    double salary;
    static String comp= "   keg";
    Employee(){
        this.id=id;
        this.name=name;
        this.salary = salary;
    }
    Employee(int id ,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary = salary;
    }
    void setValue(int id ,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary= salary;
    }
    void displaye() {
        System.out.println(this.id + " " + this.name + " " + this.salary+ this.comp);
    }
    static void change(){
        comp = "kec";
    }
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