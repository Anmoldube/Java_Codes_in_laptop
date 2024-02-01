import java.util.Scanner;

class PowerCalculator {
    double base;
    double exponent;

    // Default constructor (no arguments)
    PowerCalculator() {
        // This constructor is provided by Java automatically.
    }

    double calculatePower() {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        double x = scanner.nextDouble();

        System.out.print("Enter exponent (y): ");
        double y = scanner.nextDouble();

        PowerCalculator calculator = new PowerCalculator();
        calculator.base = x;
        calculator.exponent = y;

        double result = calculator.calculatePower();
        System.out.println(x + " raised to the power of " + y + " is: " + result);

        scanner.close();
    }
}
