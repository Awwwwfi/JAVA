//Unit 05 : Program 03
//WAP to use the keyword throw which will throw 
//the NullPointerException with a messeage "hello"

public class U5P3 {
    public static void main(String[] args) {        
        try{
            sampleMethod();
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception Occurred with Messge : "+e.getMessage());
        }
    }

    public static void sampleMethod() throws NullPointerException {
        throw new NullPointerException("hello");
    }
}
