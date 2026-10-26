import java.util.Scanner;

public class noun
// Prompts the user to enter a noun from the console and returns the input string
{
    public static String getNoun() {
        // Create a Scanner object to read input from standard input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter a noun: ");
         // Read the full line of text entered by the user
        String noun = scanner.nextLine();
        // Return the entered noun
        return noun;
    }
}
