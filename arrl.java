import java.util.Scanner;

public class arrl {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int []arr = {77,66,44,88,11};
        int item = sc.nextInt();
        System.out.println("the element is there! 0r not? :)  ");
        System.out.println(linearS(arr, 7));
        sc.close();
    }
    public static int linearS(int [] arr,int item) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return arr[i];
            }
        }
        return -1;
    }
}
