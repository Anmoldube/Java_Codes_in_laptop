public class binarysearch{
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        System.out.println(binarysearch(array, 40));
    }

    public static int binarysearch(int[] arr, int item) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = hi+lo / 2;

            if (arr[mid] == item) {
                System.out.println("we have it!");
                return arr[mid];
            } else if (arr[mid] < item) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1; // Return -1 if the item is not found
    }
}