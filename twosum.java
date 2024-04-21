public class twosum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(TwoSum(arr, 100));
    }
    public static boolean TwoSum(int[] arr , int target){
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    return true;
               }
            }
        }
        return false;
    }
}
