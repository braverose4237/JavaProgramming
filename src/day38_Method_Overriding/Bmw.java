package day38_Method_Overriding;

public class Bmw extends Car {

    public Bmw(String brand, String model, String color, int year, int price, int miles) {
        super(brand, model, color, year, price, miles);
    }

    public void breaksDown() {
        System.out.println(brand + " " + model + " " + color + " " + year + " " + price + " " + miles + " is breaksdown.");

    }

    public void racing() {
        System.out.println(brand + " " + model + " " + color + " " + year + " " + price + " " + miles + " is racing.");

    }
}