import java.util.*;
class Person  {
    private String name;
    private int id;

    public Person(){ }

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String toString(){
        return String.format("Name: %s, ID: %d", this.name, this.id);
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof Person){

            Person other = (Person) object;

            return (this.name.equals(other.name) && this.id == other.id);
        }
        else{
            return false;
        }
    }
}

public class Employee extends Person implements Comparable{
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(){
        super();
    }

    public Employee(String name, int id){
        super(name, id);
    }

    public Employee(String name, int id, double salary, Date hireDate, String insuranceNumber){
        super(name, id);

        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    public Date getHireDate() { return hireDate; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    @Override
    public String toString() {
        return String.format("%s, Salary: %f, Insurance number: %s, Hire date: %s",
                super.toString(), this.salary, this.insuranceNumber, this.hireDate.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Employee){

            Employee other = (Employee) o;

            boolean a = this.insuranceNumber.equals(other.getInsuranceNumber());
            boolean b = (this.salary == other.getSalary());
            boolean c = (this.hireDate == other.getHireDate());

            return a && b && c && super.equals(o);
        }
        else{
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee) o;

        return Double.compare(this.salary, other.salary);
    }
}

public class Manager extends Employee {
    private ArrayList<Employee> team;
    private int bonus;

    {
        bonus = 0;
        team = new ArrayList<Employee>();
    }

    public Manager() { super(); }

    public Manager(String name, int id) { super(name, id); }

    public Manager(String name, int id, ArrayList<Employee> team) {
        super(name, id);

        this.team = team;
    }

    public Manager(String name, int id, double salary, Date hireDate, String insuranceNumber, ArrayList<Employee> team){
        super(name, id, salary, hireDate, insuranceNumber);

        this.team = team;
    }

    public ArrayList<Employee> getTeam() { return team; }
    public void setTeam(ArrayList<Employee> team){ this.team = team; }

    public int getBonus() { return bonus; }
    public void setBonus(int bonus) { this.bonus = bonus; }

    public void addEmployee(Employee e) {
        this.team.add(e);
    }

    public void addBonus(int a){
        this.bonus += a;
    }

    @Override
    public String toString() {
        String team = "Team: [";

        for (int i = 0; i < this.team.size(); i++) {
            team += this.team.get(i).getName();

            if (i == this.team.size() - 1){
                break;
            }

            team += ", ";
        }

        team += "], ";

        return String.format("%s, Team: %s, Bonus: %d", super.toString(), team, this.bonus);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Manager){

            Manager other = (Manager) o;

            boolean a = this.team.equals(other.getTeam());
            boolean b = this.bonus == other.bonus;

            return a & b & super.equals(o);
        }
        else {
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        Manager other = (Manager) o;

        if (super.compareTo(o) == 0) {
            return Integer.compare(this.bonus, other.bonus);
        }
        else return super.compareTo(o);
    }
}


public class Problem3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Employee e1 = new Employee("Aza", 3);

        Employee e2 = new Employee("Qwe", 3);

        System.out.println(e1.compareTo(e2));

        ArrayList<Employee> ems = new ArrayList<Employee>();

        ems.add(e1);
        ems.add(e2);

        Manager m1 = new Manager("Qwe", 2, ems);
        Manager m2 = new Manager("Wsx", 4, ems);

        System.out.println(m1.compareTo(m2));
    }
}