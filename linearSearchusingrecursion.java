public class linearSearchusingrecursion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 9};
        int target = 4;
        boolean result = linearSearch(arr, 0, target);
        System.out.println(result);
    }

    static boolean linearSearch(int[] arr, int idx, int target) {
        if (idx >= arr.length) {
            return false;
        }
        if (arr[idx] == target) {
            return true;
        } else {
            return linearSearch(arr, idx + 1, target);
        }
    }
}
