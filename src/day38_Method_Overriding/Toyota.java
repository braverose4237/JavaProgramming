package day38_Method_Overriding;

public class Toyota extends Car{

    public Toyota(String brand, String model, String color, int year, int price, int miles) {
        super("Toyota", model, color, year, price, miles);
    }
    public void reliable(){
        System.out.println(brand +" "+ model+" "+color+ " "+year +" "+price+" "+miles+" is reliable.");

    }

}
