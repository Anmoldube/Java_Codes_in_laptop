import java.util.Scanner;

public class insertionarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int [] arr = new int[n];
        // for(int i = 0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        int[] arr = {10,20,7,757,5,97,0,44,777,54};
        int temp = arr.length-1;
        System.out.println(arr[temp]);
        int pos = sc.nextInt();
        int element  = sc.nextInt();
        fun(arr, pos, element, temp);
        sc.close();
    }
    public static void fun(int[]arr,int pos,int element,int temp){
        //int j = arr.length-1;
        int i = arr.length-1;
        for( i=temp;i>pos-1;i--){
            arr[i] = arr[i-1];
        }
           arr[pos-1] = element;
           arr[i] = arr[temp];
           for(int m = 0;m<arr.length;m++){
           System.out.print(arr[m]+ " ");
        }
    }
}
