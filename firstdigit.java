import java.util.Scanner;

public class firstdigit {
    
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while (10>=n) {
                n=n%10; 
                {
                System.out.println(n);
            }
   }
            System.out.print(n);
        }

    }  
    
}
