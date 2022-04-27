package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone1=new Iphone("Apple","Iphone 12 Pro","12,3 cm",459,"grey");
        Samsung samsung1=new Samsung("Samsung","S19","14,3 cm",459,"grey");
        System.out.println(iphone1);
        System.out.println(samsung1);
        iphone1.call(123456);
        System.out.println("---------------------");
        samsung1.freeze();


    }
}
