import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;        //stars
        int j=2*n-3;   //spces
        int row=1;
         while (row<=n) {
            for(int cst=1; cst<=i;cst++ )
            {
                System.out.print("*");
            }
            for(int csp=1; csp<=j;csp++)
            {
                System.out.print(" ");
            }
            int cst=1;
            if(row==n)
            {
                i--;
            }
            for( cst=1; cst<=i;cst++)
            {
                System.out.print("*");
            }
         System.out.println();
         i=i+1;
         j=j-2;
         row=row+1;
        }
        sc.close();
    }
}


