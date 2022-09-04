import java.util.Scanner;

public class maxOfThree_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value:");
        int a = sc.nextInt();
        System.out.println("Enter value:");
        int b = sc.nextInt();
        System.out.println("Enter value:");
        int c = sc.nextInt();
        if (a>b && a>c) 
            System.out.println(a + " is Max");
        else if (b>a && b>c) 
            System.out.println(b + " is Max");
        else
            System.out.println(c + " is Max");
    }
}
