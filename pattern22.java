import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int spaces=n-1;
        int num=1;
        int row=1;
        int val=1;
        while (row<=n)
         {
            for(int i=1;i<=spaces;i++)
            {
                System.out.print(" ");
            }
         for(int j=1;j<=num;j++)
         {
            System.out.print(val);
            val++;
          }
         System.out.println();
         row++;
         spaces=spaces-1;
         num=num+2;
        }
        sc.close();
    }
}
