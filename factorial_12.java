import java.util.Scanner;

public class factorial_12 {

    public static int factoril(int n){
        if(n==0){
            return 1;
        }
        int prevfact = factoril(n-1);
        return n*prevfact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        System.out.println(factoril(n));
    }
}
