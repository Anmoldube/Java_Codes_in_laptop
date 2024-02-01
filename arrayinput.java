import java.util.Scanner;

public class arrayinput{
   static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int []array = TakeInput();
        display(array);
    }
    public static int[] TakeInput()
    {
        System.out.println(" what is the size u want for array");
        int n= sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the elements "+i+" ");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void display(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
    }
}
}
