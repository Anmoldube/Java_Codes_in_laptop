import java.util.Scanner;

public class twodarray_input {
    // public static void main(String[]  args) {
    //     int [] [] arr = new int[4][4];
    //     System.out.println(arr[2]);
    //     System.out.println(arr[3]);
    //     int [] [] a = new int[1][0];
    //     System.out.println(a[0]);
    //  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            sc.close();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
    }
}
}
