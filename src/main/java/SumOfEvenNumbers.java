  import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int num = sc.nextInt();

     
        if (num < 2) {
            System.out.println("Error: Input must be 2 or greater.");
        
        }


        int sum = 0;
        for (int i = 2; i <= num; i += 2) {
            sum += i;
        }
        System.out.println("The sum of even numbers between 2 and " + num + " is " + sum + ".");

    }
}


    }
}
