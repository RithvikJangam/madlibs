import java.util.Scanner;

public class noun
{
    public static String getNoun() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();
        return noun;
    }
}



