package day37_Inheritance;

public class cat extends animal {
    public int teath;
    public void meow() {
        System.out.println(name + " is meawing");
    }

    public cat(String name,String breed,char gender,int age,String size,String color,int teath) {
        super(name, breed, gender, age, size, color);
        this.teath = teath;
    }
}
