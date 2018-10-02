import java.util.*;
class Person{
    private String name;
    Person(){
    }
    Person(String name){
        this.name = name;
    }
    public String getName(){
        System.out.println("Person Name: " + name);
        return name;
    }
}

class Student extends Person{
    private String name;
    Student(){
    }
    Student(String name){
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        System.out.println("Student Name: " + name);
        return name;
    }
}

class Employee extends Person{
    private String name;
    Employee(){
    }
    Employee(String name){
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        System.out.println("Employee Name: " + name);
        return name;
    }
}

public class Problem4{
    public static void main(String[] args){
        Student stObj = new Student("Ruslan");
        Employee emObj = new Employee("Adlet");

        Person ref = (Student)stObj;
        String temp = ref.getName();
        System.out.println(temp);

        ref = emObj;
        temp = ref.getName();
        System.out.println(temp);
    }
}