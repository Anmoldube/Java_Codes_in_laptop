import java.util.Scanner;

public class reversing {
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
           int rem = n%10;
           System.out.print(rem);
           n=n/10;
        }
        sc.close();
    }
}

