import java.util.*;
public class sumof {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans  =  twoSum(arr,target);
        System.out.println(ans);
        sc.close();
    }
     public static int[] twoSum(int[] nums, int target) {
        // int [] ans = new int[2];
         for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
                 if(nums[i]+nums[j] == target){
                    //int[] ans = {i,j} this will not work!!
                    return new int [] {i,j};
                 }
             }
         }
         return null;
     }
 }
