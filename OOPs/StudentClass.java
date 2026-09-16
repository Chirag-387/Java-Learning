package OOPs;

public class StudentClass {
    public static void main(String[] args) {
        
        Student s1 = new Student("Chirag", 19, 73);
        s1.display();
        s1.passFail();

    }
}

class Student {
    String name;
    int age;
    double marks;

    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    void passFail() {
        if(marks >= 40) System.out.println("Pass");
        else System.out.println("Fail"); 
    }
}