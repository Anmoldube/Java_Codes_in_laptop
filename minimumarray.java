public class minimumarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumsubarray(arr));
      //  System.out.println(maximumsubarray(arr));
    }
    //brutforce
    public static int maximumsubarray(int[] arr){
        int ans = Integer.MIN_VALUE; // 2^32 it is a fixed value
        for (int i = 0; i < arr.length; i++) {
            int prevsum =0;
            for (int j = i; j < arr.length; j++) {
                prevsum += arr[j];
                ans = Math.max(ans,prevsum);
            }
        }
        return ans;
    }
    //optimized
        public int maxSubarray(int[] nums) {
            int ans = 0 ; // Initialize with the smallest possible integer
            for (int i = 0; i < nums.length; i++) {
                int prevsum = 0;
                 prevsum = prevsum + nums[i];
                 ans = Math.max(ans ,prevsum);
                if(prevsum<0){
                    prevsum = 0;
                }
        }
        return ans;
    }
}
