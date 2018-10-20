package training.Java_Training.Day5_Sept12;

import java.util.ArrayList;

public class Employee {
    int id;
    String name;
    String department;
    public Employee(int id,String name, String department){
        this.id = id;
        this.name = name;
        this.department= department;
    }
    public void getDepartment(){
        System.out.println(name + "'s department is: "+ department);
    }
    public static void main(String[] args){
        Employee emp1 = new Employee(1234,"Rohit","Networking");
        emp1.getDepartment();

        ArrayList list = new ArrayList();
        list.add(20);
        list.add(30);
        System.out.println(list.get(0));

    }

}
