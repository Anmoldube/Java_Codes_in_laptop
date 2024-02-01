import java.util.Scanner;
public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter interest rate (as a percentage): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();
        
        double simpleInterest = simpint(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);
        
        scanner.close();
    }
    
    public static double simpint(double principal, double rate, double time) {
        // Convert rate from percentage to decimal
        rate = rate / 100;
        
        // Calculate simple interest
        double simpleInterest = principal * rate * time;
        return simpleInterest;
    }
}
