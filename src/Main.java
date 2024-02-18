import ApplicationLayer.Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your birth year = ");
        Scanner scanner = new Scanner(System.in);
        int birthYear = scanner.nextInt();

        Application application = new Application();
        application.getAge(birthYear);
    }
}
