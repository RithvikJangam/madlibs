import java.util.Scanner;

public class noun
// Prompts the user to enter a noun from the console and returns the input string

{
    public static String getNoun() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();
        return noun;
    }
}



