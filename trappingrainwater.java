public class trappingrainwater {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,5};
        System.out.println(trappingrainwater1(arr));
    }
    public static int trappingrainwater1(int [] arr){
        int n = arr.length;
        int[] right = new int[n];
        int[] left = new int[n];
        left[0]  = arr[0];
        for (int i = 1; i < left.length-1; i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }
            right[n-1] = arr[n-1];
            for (int i= right.length-2;i>=0; i--) {
                right[i]  = Math.max(right[i+1], arr[i]);
            }
            int ans = 0;
            for (int i = 0; i < right.length-1; i++) {
                int min = Math.min(left[i], right[i]);
                ans = ans + (min - arr[i]);
            }
            return ans;
    }
}
