class Shape{
    void show(){
        System.out.println("This is a shape  class");
    }
    void getInfo(){
        System.out.println("This defined as a shape class");
    }
}
class Circle extends  Shape{
    @Override
    void show(){
        System.out.println("This is a circle class");
    }
}
class Rectangle extends Shape{
    void show(){
        System.out.println("This is a rectangle class");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        Circle c= new Circle();
        Rectangle r= new Rectangle();
        c.show();
        r.show();
        c.getInfo();
        r.getInfo();
    
}
    
}
