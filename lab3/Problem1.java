import java.util.*;
class Animal{
    private String name;
    Animal(){
    }
    Animal(String name){
        this.name = name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getAnimal(){
        return "This rabbit's name is " + name;
    }
}

class Rabbit extends Animal{
    private String color;
    Rabbit(){
        super();
    }
    Rabbit(String name, String color){
        super(name);
        this.color = color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }
    public String getColor(){ return color; }

    @Override
    public String getAnimal() {
        return super.getAnimal() + " and it's " + color + ".";
    }
}

public class Problem1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rabbit rb = new Rabbit("Lini", "grey");
        System.out.println(rb.getAnimal());
    }
}