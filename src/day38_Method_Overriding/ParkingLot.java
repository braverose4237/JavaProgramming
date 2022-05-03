package day38_Method_Overriding;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Toyota","Camry","Gray",2020,50000,123456);

        Tesla tesla=new Tesla("Tesla","Model S","Gray",2020,50000,123456);
        Bmw bmw=new Bmw("Bmw","520","Gray",2020,50000,123456);
        toyota.start();
        tesla.start();
        bmw.start();
    }
}
