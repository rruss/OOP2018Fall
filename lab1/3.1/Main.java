import java.util.Scanner;

public class Student{
	String name;
	String id;
	int yearofstudy;
	Student(String name, String id, int yearofstudy){
		 this.name = name;
		 this.id = id;
		this.yearofstudy = yearofstudy;
	}
	public void setStudent(String newName, String newID, int newYearofstudy){
		this.name = newName;
		this.id = newID;
		this.yearofstudy = newYearofstudy;
	}
	public String getName(){
		return this.name;
	}
	public String getId(){
		return this.id;
	}
	public int getYearofstudy(){
		return this.yearofstudy;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student("Ruslan","17BD090499", 2);
		Student s2 = new Student("Adlet", "15BD051786", 4);
		System.out.println(s1.getId());
		System.out.println(s2.getName());
	}
}