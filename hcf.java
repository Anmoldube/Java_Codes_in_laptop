import java.util.*;
public class hcf {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // n is divident
            int r = sc.nextInt(); // r is divisor
            while (n % r==0) {
                int rem = n%r;
                r=rem;
            }
                System.out.print(r);
        }

        
    }
}
