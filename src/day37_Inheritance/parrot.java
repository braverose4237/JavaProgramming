package day37_Inheritance;

public class parrot extends animal{
    public String parrotWingColor;
    public parrot(String name, String breed, char gender, int age, String size, String color,String parrotWingColor) {
        super(name, breed, gender, age, size, color);
        this.parrotWingColor=parrotWingColor;
    }
    public void sing(){
        System.out.println(name +" is singing.");
    }
}
