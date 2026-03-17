public class HelloApp {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello World");
        }

        System.out.println("Welcome to UC3 functionality");
    }
}