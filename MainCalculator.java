import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First number (up to 2 digits): ");
        int num1 = input.nextInt();

        System.out.println("Enter the Second number (up to 2 digits): ");
        int num2 = input.nextInt();

        if (num1 < 0 || num1 > 99 || num2 < 0 || num2 > 99) {
            System.out.println("Invalid input! Please enter numbers with at most 2 digits.");
            return;
        }

        System.out.println("Enter an Operator (+, -, *, /)");
        char ch = input.next().charAt(0);

        int result = 0;

        switch (ch) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                break;

            default:
                System.out.println("Invalid Operator!");
                return;
        }

        System.out.println(num1 + " " + ch + " " + num2 + " = " + result);
    }
}
