import java.util.Scanner;

public class CharacterPerLine {
    public static void main(String[] args) {        
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++ ) {
            System.out.println(word.charAt(i));
        }

        // TODO: Step 2 - Print each character on a separate line

    }
}
