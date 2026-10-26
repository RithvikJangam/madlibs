import java.util.Scanner;

public class verb {
    
    // Prompt the user for a verb and return their input
    public static String getVerb() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();
        return verb;
    }
}
