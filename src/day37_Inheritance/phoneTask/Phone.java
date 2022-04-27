package day37_Inheritance.phoneTask;

public class Phone {
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;


    public static boolean hasbattery;


    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    static {
        hasbattery=true;
    }
    public void call(long phoneNummer){
        System.out.println(brand+" "+model+" is calling "+phoneNummer);
    }
    public void text(long phoneNUmber){
        System.out.println(brand+" "+model+" is texting "+phoneNUmber);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=_?=)($" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasbattery + '\'' +
                '}';
    }
}
