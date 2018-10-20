package training.Java_Training.Day7_Sep17;

public class ConstructorTest {
    int empId;
    String name;
    ConstructorTest()//No-aug constructor
    {
        System.out.println("We are just testing a constructor");
        this.name="Rohan";
    }
    ConstructorTest(int n, String empName)//Parameterized Constructor
    {
        this.empId = n;
        this.name = empName;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args){
        ConstructorTest ct1 = new ConstructorTest();
        System.out.println(ct1.name);
        ConstructorTest ct2 = new ConstructorTest(123,"Sam");
        System.out.println(ct2.name + "\n"+ct2.empId);
        System.out.println(ct1.getName());

    }
}
class Employee{
    int id;
    String name;
    Employee(String name, int id){
        this.id =id;
        this.name=name;
    }
    public static void main(String[] args){
        Employee emp = new Employee("Soni",123);
        System.out.println(emp.id + " and " + emp.name);
    }
}