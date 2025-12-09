package at.ac.hcw.git;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Git!");
        System.out.println("Hello World!");

        for (int i = 0; i < 10; i++) {
            System.out.print("next value: ");
            System.out.println("i == " + i);
        }

        new Loop().loop();
    }
}
