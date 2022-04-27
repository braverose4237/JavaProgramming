package day37_Inheritance.phoneTask;

public class Nokia extends Phone{
    public Nokia(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }
    public void selfDefence(){
        System.out.println("You can use "+brand +" "+model +"for self defence.");
    }
}
