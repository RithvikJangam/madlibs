public class picker {
    public static String choice() {
        int choice = (int)(Math.random()*4 + 1);
        if(choice == 1) {
            return"A @ $ swooped in to ^ my bed # times.";
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
        return "error";
    }
}
