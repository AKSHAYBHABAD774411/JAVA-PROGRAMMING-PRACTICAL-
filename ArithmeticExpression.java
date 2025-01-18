import java.util.Scanner;

public class ArithmeticExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for a, b, and c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double result = (a + b) * c;

        System.out.println("Result of (a + b) * c: " + result);

        scanner.close();
    }
}
