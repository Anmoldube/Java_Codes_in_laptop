import java.util.Scanner;

public class parameter {
    public static void main(String[] args) {
        System.out.println("enter the numbers");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        additionparameter(num1, num2);
        System.out.println(" :u got it!");
        scanner.close();
    }
    public static void additionparameter(int a,int b)
    {
        int c= a+b;
        System.out.print(c);
    }
}
