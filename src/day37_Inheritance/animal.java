package day37_Inheritance;

public class animal {
    public String name,breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public animal(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }
    public void eat(){
        System.out.println(name+" is eating.");
    }
    public void drink(){
        System.out.println(name+" is drinking.");
    }
    public void move(){
        System.out.println(name+" is moving.");
    }
    public void sleep(){
        System.out.println(name+" is sleeping.");
    }

    @Override
    public String toString() {
        return "animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
