package loops.menu;

import java.util.Scanner;

public class LatestMenuRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 1;
        do {
            System.out.println("Enter Number1: ");
            int number1 = scanner.nextInt();

            System.out.println("Enter Number2: ");
            int number2 = scanner.nextInt();

            System.out.println("Choose Operation ");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Divide");
            System.out.println("4 - Multiply");
            System.out.println("5 - Exit");

            System.out.println("Enter Choice: ");
            int choice = scanner.nextInt();

            System.out.println("Your Choices are");
            System.out.println("Number1 " + number1);
            System.out.println("Number2 " + number2);
            System.out.println("Choice " + choice);

            result(number1, number2, choice);
        } while (number >= 0);
    }
    private static void result(int number1, int number2, int choice) {
     switch (choice) {
        case 1:
            System.out.println("Result " + (number1 + number2));
            break;
        case 2:
            System.out.println("Result " + (number1 - number2));
            break;
        case 3:
            System.out.println("Result " + (number1 / number2));
            break;
        case 4:
            System.out.println("Result " + (number1 * number2));
            break;
         case 5:
             System.out.println("Exit");
        default:
            System.out.println("Invalid Operation");
            break;
    }
}
}
