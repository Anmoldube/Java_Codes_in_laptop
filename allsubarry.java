import java.util.Scanner;

public class allsubarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for index " + i + " of the array:");
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("[");
                for (int x = j; x <= i; x++) {
                    System.out.print(arr[x]);
                    if (x != i) {
                        System.out.print(", ");
                    }
                }
                System.out.print("]");
                if (j != i) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
