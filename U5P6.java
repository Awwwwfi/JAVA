//Unit 05 : Program 06
//WAP to create a custom Exception class called MyException of type Exception 
//that will throw an exception if the value passed in a method named compute() 
//is greater than 30. This will generate an Exception and should print 
//the message "The value must be entered less than or equal to 30"
public class U5P6 {
    public static void main(String[] args) {
        MyException myObj = new MyException();
        try{
            myObj.compute(31);
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception{
    MyException(){

    }
    MyException(String str){
        super(str);
    }
    public void compute(int value) throws MyException {
        if(value>30){
            throw new MyException("The value must be entered less than or equal to 30");
        }
    }
}
