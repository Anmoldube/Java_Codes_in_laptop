import java.util.*;
public class gcd{
    public static void main(String[] args) {
        int ans=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.:");
        int a= sc.nextInt();
        int b= sc.nextInt();

        int x = Math.min(a,b);
        for(int i=1;i<=x;i++)
        if(a%i==0 && b%i==0)
        ans = i;
        System.out.println(ans);
        sc.close();
 }
}
