import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double rectangleArea = calculateRectangleArea(length, width);
        System.out.println("Area of Rectangle: " + rectangleArea);

        System.out.print("Enter side length of square: ");
        double sideLength = sc.nextDouble();

        double squareArea = calculateSquareArea(sideLength);
        System.out.println("Area of Square: " + squareArea);

        sc.close();
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateSquareArea(double sideLength) {
        return sideLength * sideLength;
    }
}
