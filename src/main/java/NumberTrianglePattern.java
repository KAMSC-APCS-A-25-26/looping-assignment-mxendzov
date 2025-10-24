import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {          
            for (int j = 1; j <= i; j++) {      
                System.out.print(j);
                if (j < i) {                    
                    System.out.print(" ");
                }
            }
            System.out.println();               
        }
    }
}
