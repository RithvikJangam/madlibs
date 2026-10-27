public class picker {
    public static String choice() {
        int choice = (int)(Math.random()*4 + 1); // randomly generates integer, 1-4
        if(choice == 1) { // depending on the generated integer, a corresponding madlib is returned
            return"A @ $ swooped in to ^ my bed # times."; // same madlibs are the ones in madlib.txt
        }
        else if(choice == 2) {
            return "Yesterday, I met a @ $ who was # years old and loved to ^.";
        }
        else if(choice == 3) {
            return "I used to ^ for # hours every day until I met a $ who wasn't @ at all.";
        }
        else if(choice == 4) {
            return  "Tomorrow I have plans with a $ to ^ at the park until # minutes past the @ sunset.";
        }
        return "error"; // error catcher (fortunately not used)
    }
}
