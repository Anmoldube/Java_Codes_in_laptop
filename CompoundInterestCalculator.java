import java.util.Scanner;

class InterestCalculator {
    protected double principal;
    protected double rate;
    protected double time;

    public InterestCalculator(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateInterest() {
        return principal * Math.pow(1 + rate / 100, time);
    }
}

class YearlyInterest extends InterestCalculator {
    public YearlyInterest(double principal, double rate, double time) {
        super(principal, rate, time);
    }

    public double calculateInterest() {
        return super.calculateInterest() - principal;
    }
}

class HalfYearlyInterest extends YearlyInterest {
    public HalfYearlyInterest(double principal, double rate, double time) {
        super(principal, rate, time);
    }

    public double calculateInterest() {
        double n = time * 2;
        double r = rate / 200;
        return principal * (Math.pow(1 + r, n) - 1);
    }
}

class QuarterlyInterest extends HalfYearlyInterest {
    public QuarterlyInterest(double principal, double rate, double time) {
        super(principal, rate, time);
    }

    public double calculateInterest() {
        double n = time * 4;
        double r = rate / 400;
        return principal * (Math.pow(1 + r, n) - 1);
    }
}

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();

        YearlyInterest yearly = new YearlyInterest(principal, rate, time);
        System.out.println("yearly" +yearly.calculateInterest());

        HalfYearlyInterest halfYearly = new HalfYearlyInterest(principal, rate, time);
        System.out.println("halfyearly" +halfYearly.calculateInterest());

        QuarterlyInterest quarterly = new QuarterlyInterest(principal, rate, time);
        System.out.println("qua" +quarterly.calculateInterest());

        sc.close();
    }
}
