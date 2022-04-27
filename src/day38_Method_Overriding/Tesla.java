package day38_Method_Overriding;

public class Tesla extends Car {
    public Tesla(String brand, String model, String color, int year, int price, int miles) {
        super("Tesla", model, color, year, price, miles);
    }

    public void autoPilot() {
        System.out.println(brand + " " + model + " " + color + " " + year + " " + price + " " + miles + " driving Autopilot.");

    }
}
