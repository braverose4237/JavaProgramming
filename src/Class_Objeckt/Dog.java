package Class_Objeckt;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public String gender;
    public static String health="healthy";

    public void bark(){
        System.out.println("barking");
    }
    public Dog(String name,String breed,int age,String gender){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.gender=gender;
        System.out.println("oldiii");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
