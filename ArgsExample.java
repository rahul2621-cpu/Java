public class ArgsExample {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please pass your age as a command-line argument.");
            return;
        }

        int age = Integer.parseInt(args[0]);  // Read first argument
        System.out.println("You are " + age + " years old.");
    }
}
