import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
        System.out.println(fib(i));
        sc.close();
        }
    }
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int p1 = fib(n-1);
        int p2 = fib(n-2);
        return p1 + p2;
    }
}
