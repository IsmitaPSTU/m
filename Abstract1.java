 abstract class Shape  {
    abstract  void RectangleArea(double length,double breadth);
    abstract  void SquareArea(double side);
    abstract  void CircleArea(double  radius);
}
class Area extends  Shape{
    @Override
    void RectangleArea(double length,double breadth){
        System.out.println("Area of rectangle:"+(length*breadth));

    }
    @Override
    void SquareArea(double side){
        System.out.println("Area of square:"+(side*side));
    }
    @Override
    void CircleArea(double radius){
        System.out.println("Area of circle:"+(3.1416*radius*radius));
    }
}
public  class Abstract1{
    public static void main(String[] args) {
        Area a= new Area();
        a.RectangleArea(4, 4);
        a.SquareArea(4);
        a.CircleArea(5);
    }
}
