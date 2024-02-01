import java.util.Scanner;

public class Sumofdigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
        sc.close();
    }
    static int f(int n){
        if(n<=0 && n<=9){
            return n;
        }
        int sm = f(n/10);
        return sm + n%10;
    }
}
