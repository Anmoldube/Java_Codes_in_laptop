import java.util.Scanner;

public class aaaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int nr=2*n-1;
            int nst=1;
        for(int i=1;i<=nr;i++)
        {
            for(int j=1;j<=nst;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            if (i<=nr/2)
            {
                nst=nst+1;
            }
            else
            {
                nst=nst-1;
            }
            sc.close();
        }
    }
}
