public class Selectionsort {
    public static void main(String[] args) {
        int[] arr= {1,3,4,6,9,4,7};
        Selection(arr);
    }
    public static void Selection(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[min_index] > arr[j]){
                min_index = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
        }
    }
}
