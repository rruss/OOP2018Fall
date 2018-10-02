import java.util.*;
class Person{
    private String name;
    Person(){
    }
    Person(String name){
        this.name = name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    String getName(){
        return this.name;
    }

    boolean equals(String name1, String name2){
        for(int i = 0; i < Math.max(name1.length(), name2.length()); i++){
            if(name1.charAt(i) != name2.charAt(i)) return false;
        }
        return true;
    }
    public String toString(){
        return "Name: " + name + ".";
    }
}

class Employee extends Person{
    private double salary;
    private int year;
    private String insNum;
    Employee(){
        super();
    }
    Employee(String name, double salary, int year, String insNum){
        super(name);
        this.salary = salary;
        this.year = year;
        this.insNum = insNum;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }
    public void setInsNum(String newInsNum){
        this.insNum = newInsNum;
    }
    public Double getSalary(){
        return this.salary;
    }
    public int getYear(){
        return this.year;
    }
    public String getInsNum(){
        return this.insNum;
    }

    public String toString() {
        return super.toString() + " Salary: " + salary + ". Year: " + year +
                ". Insurance number: " + insNum + ".";
    }
    boolean equals(String name1, double salary1, int year1, String insNum1, String name2, double salary2, int year2, String insNum2){
        super.equals(name1, name2);
        if(salary1 != salary2) return false;
        if(year1 != year2) return false;
        for(int i = 0; i < Math.max(insNum1.length(), insNum2.length()); i++){
            if(insNum1.charAt(i) != insNum2.charAt(i)) return false;
        }
        return true;
    }
}

class Manager extends Employee{
    private boolean bonus;
    Manager(){
    }
    Manager(String name, double salary, int year, String insNum, boolean bonus){
        super(name, salary, year, insNum);
        this.bonus = bonus;
    }
    public void setBonus(boolean newBonus){
        this.bonus = newBonus;
    }
    public Boolean getBonus(){
        return this.bonus;
    }
    public String toString() {
        return super.toString() + " Existence of bonus: " + bonus + ".";
    }
    public boolean equals(String name1, double salary1, int year1, String insNum1, boolean bonus1, String name2, double salary2, int year2, String insNum2, boolean bonus2){
        super.equals(name1, salary1, year1, insNum1, name2, salary2, year2, insNum2);
        if(bonus1 != bonus2) return false;
        return true;
    }
}

class Problem3{
    public static void main(String[] args){
        Manager manager = new Manager("Ruslan", 200000, 3, "077", true);
        System.out.println(manager.toString());
    }
}