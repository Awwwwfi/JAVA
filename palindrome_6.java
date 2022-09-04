import java.util.Scanner;

public class palindrome_6 {
    public static void main(String[] args) {
        int r, sum = 0, temp;
        int n = 454;// It is the number variable to be checked for palindrome

        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        System.out.println((temp == sum) ? "palindrome number " : "not palindrome");
    }
}
