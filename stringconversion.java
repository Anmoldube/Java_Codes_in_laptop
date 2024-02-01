import java.util.Scanner;

public class stringconversion {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.close();

        String reversedStr = reverseString(str);

        System.out.println("Reversed String: " + reversedStr);
        System.out.println("Length of the original string: " + str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}
