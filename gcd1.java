import java.util.Scanner;

public class gcd1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int divident = sc.nextInt();
        int divisor = sc.nextInt();
       // int rem=0;
        while(divident%divisor != 0)
        {
          //int rem = divident%divisor;
         int rem = divident % divisor;
            divident = divisor;
           divisor = rem;
          //  divident = divisor;
          //  divisor = rem;
        }
        System.out.println(Math.abs(divisor));
        sc.close();
    }
}
