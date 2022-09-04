import java.util.Scanner;

public class sort_8 {
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);    
        int[] arr;   
        int temp = 0;    
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number: ");
            arr[i] = sc.nextInt();
        }  
             
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
             
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
                if(arr[i] < arr[j]) {    
                    temp = arr[i];    
                    arr[i] = arr[j];    
                    arr[j] = temp;    
                }     
            }     
        }    
            
        System.out.println();    
            
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}
