import java.util.Scanner;

public class drivable_sum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            long[] result = GoodSubArray(arr);
            for (long val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static long[] GoodSubArray(int[] arr) {
        int n = arr.length;
        long[] frq = new long[n];
        int sum = 0;
        frq[0] = 1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            sum = sum % n;
            if (sum < 0) {
                sum += n;
            }
            frq[sum]++;
        }
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (frq[i] >= 2) {
                count += (frq[i] * (frq[i] - 1)) / 2;
            }
        }
        return frq;
    }
}
