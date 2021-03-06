package Stuff;
public class Dog extends Animal{
    private String name;
    private String breed;
    private String color;
    private double height;
    private boolean hasEars = true;
    private double walkingSpeed;
    private double runningSpeed;
    private int x = 0;
    private int y = 0;

    public Dog(){
        this.name = "Spot";
        this.breed = "Doberman";
        this.color = "Black";
        this.height = 24;
        this.walkingSpeed = 3;
        this.runningSpeed = 10;
        this.weight = 45;
    }

    public Dog(String name, String breed, String color, double height,
               double weight, double walkSpd, double runSpd){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.walkingSpeed = walkSpd;
        this.runningSpeed = runSpd;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){

    }

    @Override
    public String toString(){
        return "\nName: " + this.name + "\nColor: " +
                this.color + "\nLocation:\n\tx-coord: " +
                this.x + "\n\ty-coord: " + this.y;
    }

}
