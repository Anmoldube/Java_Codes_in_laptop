import java.util.Scanner;

public class rotatarr{
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = sc.nextInt();
        rotate(nums, k);
        for (var i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
    }
    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        int n = nums.length;
         reverse(nums, 0, n-k-1);
         reverse(nums, n-k, n-1);
         reverse(nums, 0, n-1);
    }
    public static void reverse(int[] nums,int i,int j){
        while (i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
           i++;
           j--;
        }

    }
}
