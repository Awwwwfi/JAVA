//Unit 04 : Program 03
//Create an interface ShapeArea having a method declared called findArea() 
//now implement this interface to 2 classes called circle and Rectangle 
//and implement findArea() accordingly.
public class U4P3 {
    public static void main(String[] args) {
        Circle c = new Circle(2.0);
        Rectagle r = new Rectagle(3.0, 4.0);
        c.findArea();
        r.findArea();
        c.printArea();
        r.printArea();
    }
}

interface ShapeArea{
    public void findArea();
}

class Circle implements ShapeArea{
    double radius, area;
    Circle(double r){
        radius = r;
    }
    public void findArea(){
        area = 2 * 3.14 * radius;
    }
    public void printArea(){
        System.out.println("Area of Circle with Radius "+radius+" is "+area);
    }
}

class Rectagle implements ShapeArea{
    double length, width, area;
    Rectagle(double l, double w){
        length = l;
        width = w;
    }
    public void findArea(){
        area = length * width;
    }
    public void printArea(){
        System.out.println("Area of Rectangle with Length "+length+" and Width "+width+ " is "+area);
    }
}
