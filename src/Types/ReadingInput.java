package Types;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();

        System.out.print("Gender: ");
        String gender = scanner.next();
        scanner.nextLine();

        System.out.print("Full name: ");
        String name = scanner.nextLine().trim();

        System.out.println("You are " + name + " and " + age + " years old and you are a " + gender);
    }
}
