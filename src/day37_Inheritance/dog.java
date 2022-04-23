package day37_Inheritance;

public class dog extends animal{

    public dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void barking(){
        System.out.println(name + "is barking." );
    }

}
