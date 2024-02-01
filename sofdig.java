import java.util.Scanner;
public class sofdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        //int i=0;
        while(n>0){
        int rem=n%10;
        n=n/10;
        sum = sum+rem;
       // i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
