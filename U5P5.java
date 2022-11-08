//Unit 05 : Program 05
//Create a class ThrowsDemo and create a method divide() which 
//throws an exception ArithmaticException if required and 
//create a program using that and use divide method 
//to perform division operation on 2 numbers.
public class U5P5 {
    public static void main(String[] args) {
        ThrowsDemo myObj = new ThrowsDemo();
        try{
            myObj.divide(10, 5);
            myObj.divide(10, 0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

class ThrowsDemo{

    public void divide(int no1, int no2) throws ArithmeticException{
        if(no2 == 0){            
            throw new ArithmeticException("Custom Divide By Zero Exception Occurred");
        }else{
            System.out.println(no1 + " divided by "+no2+" is "+(no1/no2));
        }
    }
    
}
