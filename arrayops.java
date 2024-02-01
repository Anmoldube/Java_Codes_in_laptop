import java.util.Scanner;

public class arrayops {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[]=takeinput();
        System.out.println();
        display(arr);
    }
    public static int[] takeinput(){
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the value "+i+" for array");
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
