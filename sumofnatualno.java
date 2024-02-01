import java.util.*;
public class sumofnatualno {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=1;
        int sum=0;
        while (c<n) {
            sum = sum + c;
            c = c+1;

        }
        System.out.println(sum);
        sc.close();
    }
       
    
}
