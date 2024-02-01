import java.util.*;
public class fabno {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;
        int counter=1 ;
        int a = 0;
        int b= 1;
        while (counter <= n) {
            sum = a+b;
            a=b;
            b=sum;
            System.out.println(sum);
            counter++;
            sc.close();
        }
    }
}
    

