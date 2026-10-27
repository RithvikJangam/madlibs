import java.util.Scanner;
public class adjective {
    // Prompts the user to enter an adjective from the console and returns the input string. @return the adjective entered by the user
    public static String getAdjective() {
        // Create a Scanner object to read input from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter an adjective: ");
        // Read the full line of text entered by the user
        String adjective = scanner.nextLine();
        // Return the entered adjective
        return adjective;
    }
}
