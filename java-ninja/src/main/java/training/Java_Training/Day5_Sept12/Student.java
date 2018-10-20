package training.Java_Training.Day5_Sept12;

public class Student {
    String name;
    int age;
    int grade;
    int marks;
    public void writeExam(){
        System.out.println(name + " is writing exam");
    }
    public void getResult(){
        System.out.println("Marks for " + name + " is: " + marks);

    }
    public void displayGrade(){
        System.out.println(name + " studies in " + grade +"th grade");

    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name="Rohan";
        s1.age=12;
        s1.marks=555;
        s1.grade=5;
        s1.writeExam();
        s1.displayGrade();
        s1.getResult();
    }
}
