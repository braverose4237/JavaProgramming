package day38_Method_Overriding;

public class Car {
    public String brand,model,color;
    public int year,price,miles;

    public Car(String brand, String model, String color, int year, int price, int miles) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand +" "+ model+" "+color+ " "+year +" "+price+" "+miles+" is starting.");

    }
    public void drive(){
        System.out.println(brand +" "+ model+" "+color+ " "+year +" "+price+" "+miles+" is driving.");

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
