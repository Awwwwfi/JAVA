//Unit 05 : Program 01
//WAP to demonstrate the handling of exception occurred when 
//divide by 0 operation is done and show an appropriate message. 
//Then use the finally block to show that it is been executed when.
public class U5P1 {
    public static void main(String[] args) {
        int no1 = 8;
        int no2 = 0;
        try{
            System.out.println(no1/no2);
        }catch(ArithmeticException e){
            System.out.println("Divided by zero operation not allowed");
        }finally{
            System.out.println("Finally Executed");
            //Check above occurence with value of no2 0 & 2 both
        }
    }
}