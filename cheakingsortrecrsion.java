public class cheakingsortrecrsion {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        boolean result = bubblesort(arr,0);
        System.out.println(result);
    }
    static boolean bubblesort(int [] arr , int idx){
        if(arr[idx] == arr.length-1){
            return true;
        }
        if(arr[idx] > arr[idx+1]){
            return false;
        }
            return bubblesort(arr, idx+1);
        }
    }

