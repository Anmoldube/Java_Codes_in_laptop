import java.util.Scanner;

public class N!{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fact(n));
        sc.close();
    }
    static int fact(int n){
         if(n==0) return 1;
        int sa = fact(n-1);
        return sa*n;
    }
}
