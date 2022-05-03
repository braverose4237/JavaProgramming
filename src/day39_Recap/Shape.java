package day39_Recap;

public class Shape {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name==null){
            System.out.println("Name can not be null");
            System.exit(1);// 1:some thing went wrong.
        }
        this.name=name;
    }

    public Shape(String name) {
        setName(name);
    }
    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }
}
