import java.util.Scanner;
public class numbers{
    public numbers() {}
    public int check(){
        /*creates the initial input */
        System.out.print("Enter an integer: ");
        Scanner cb = new Scanner(System.in);
        String n =cb.nextLine();
        String temp = n;
        int thing = 1;
        Boolean pass = false;
        /*only returns a value when the inputed string can be converted to an int */
        while(pass == false) {
            try {
                thing = Integer.parseInt(temp);
                pass = true;
            }
            catch(NumberFormatException e) {
                System.out.print("Enter a valid integer: ");
                temp = cb.nextLine();
            }
        }
        return thing;
    }
    /*to dissuade poor programming in main */
    public String toString() {
        return "dumb dog"; // funny funny guy
    }
}
