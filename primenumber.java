import java.util.*;
public class primenumber {
  public static void main(String[] args)
 {
    //         int x;
               Scanner sc = new Scanner(System.in);
    //
    //         System.out.println("enter the number");
    //         int n = sc.nextInt();
    //         for( x=2;x*x<=n;x++) {
    //         while (n%x==0) {
    //         n=n/x;
    //         System.out.println(x+ " ");
    //     }
    // }
    //     if(n!=1 ){
    //         System.out.print(n);
    //         System.out.println(" is a prime no.");
    //     }
    System.out.println("enter the input");
        int count = 0;
        int n = sc.nextInt();
        for(int i=2;i<=n-1;i++){
            if (n%i==0) {
                count++;
            }
        }
        if (count >= 1) {
            System.out.println(" not prime");
        }
        else{
            System.out.println("prime");
        }
        sc.close();
    }
}
