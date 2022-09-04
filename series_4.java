import java.util.Scanner;

public class series_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double n = sc.nextInt();
            double s = 0;
            for (double i = 1; i <= n; i++){
              s = s + 1/i;
            System.out.println(s);
        }
    }
}