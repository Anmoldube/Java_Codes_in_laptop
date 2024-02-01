import java.util.*;

public class sum {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        //  int n = sc.nextInt();
        // int [] arr = new int[n];
        // for(int i = 0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        int[] arr = {5,1,1,1,0,0};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 || arr[i] == 1)
            System.out.print(arr[i]);
        }
        //sc.close();
    }
    public static void sort(int[] arr){
        Arrays.sort(arr);
    }
}


