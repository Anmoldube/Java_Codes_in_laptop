import java.util.Scanner;

public class reveringthearray {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {10,20,7,757,5,97,0,44,777,54,};
        reverse(arr, 0, 0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
    }
    public static void reverse(int[] arr,int i,int j){
        i = sc.nextInt();
        j = sc.nextInt();
        while (i<j) {
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                i++;
                j--;
             }
    }
}
