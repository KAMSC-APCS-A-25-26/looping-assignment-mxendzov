import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
                
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        
        // TODO: Step 2 - Generate the number triangle pattern
        for (int i = 1; i <= number; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.println(j);
                if (j < i) {
                    System.out.print(" ");
        }
    }
}}}