//Unit 05 : Program 02
//WAP to access the 11th element of the array of size 10 and handle the exception.

public class U5P2 {
    public static void main(String[] args) {
        int numerArray[] = {1,2,3,4,5,11,12,13,14,15};
        try{
            System.out.println("11th Element is "+numerArray[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Accessed is Out of Bounds");
        }        
    }
}
