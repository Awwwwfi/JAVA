import java.util.Scanner;

public class avgOfTen_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] avgOf;
        int avg = 0;
        int sum = 0;
        avgOf = new int[10];
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number: ");
            avgOf[i] = sc.nextInt();
        }
        for (int i = 1; i <= 10; i++) {
            sum = sum + avgOf[i];
            avg = sum / 10;
        }

    }
}