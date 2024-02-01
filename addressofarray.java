public class addressofarray {

     public static void main(String[] args) {
        int[] arr = {10,6,-5,66,444,-18,44,2};
        System.out.println(min(arr, 0));
     }
     public static int min(int [] arr,int min) {
        for(int i=0;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min = i;
            }
        }
        return arr[min];
     }
}