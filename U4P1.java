//Unit 04 : Program 01
//Create a class Rect and have data member length and width and 
//a method to find the area of the rectangle. 
//Create a subclass Cube from that add a member height to it and 
//create a method to find the volume of the Cube from that.

public class U4P1 {
    public static void main(String[] args) {
        Rect myRect = new Rect();
        myRect.printArea();
        Cube myCube = new Cube();
        myCube.printVolume();
    }    
}

class Rect {
    double length=3, width=4;
    public double area() {
        return length*width;
    }    
    public void printArea(){
        System.out.println("Rectagle Area : "+area());
    }
}

class Cube extends Rect {
    double height=5;   
    public double volume() {
        return length*width*height;//Length & Width info comes from base class
    }    
    public void printVolume(){
        System.out.println("Cube Volume : "+volume());
    }
}