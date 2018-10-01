import java.util.Scanner;

class Student{
    private String name;
    private String id;
    private int yos;
    Student(){

    }
    Student(String name, String id, int yos){
        this.name = name;
        this.id = id;
        this.yos = yos;
    }

    public void setName(String newName){ this.name = newName; }
    public void setId(String newId){ this.id = newId; }
    public void setYos(int newYos){ this.yos = newYos; }


    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public int getYos(){ return this.yos; }
}
public class problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.setId("17BD090499");
        s1.setName("alish");
        s1.setYos(5);
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getYos());
    }
}