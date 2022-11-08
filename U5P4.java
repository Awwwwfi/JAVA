//Unit 05 : Program 04
//WAP to demonstrate multiple catch blocks that are capable of 
//handling ArithmaticException and ArrayOutOfBoundsException. 
//In this create an array of 5 elements with a value of 1 element set to 0 
//and divide a digit with the array elements one by one and 
//loop should run between 0 to 5 values.
public class U5P4 {
    public static void main(String[] args) {
        int myArr[] = {3, 10, 0, 22, 5};
        //Make third element in myArr 10 and 0 and check program output in both case
        int number = 50;
        int i=0;
        try{
            for(i=0;i<=5;i++){
                int temp = number/myArr[i];
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Got out of Bounds");
        }catch(ArithmeticException e){
            System.out.println("Arithmatic Exception occured");
        }finally{
            System.out.println("Finally Block : Current Loop Index is "+i);
        }
    }
}
