import java.util.Scanner;

public class pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int spaces=n-1;
        int star=1;
        int row=1;
        int val;
        while (row<=n) {
            val=1;
            for(int i=1;i<=spaces;i++)
            {
                System.out.print("  ");
            }
            int j;
            for( j=1;j<=star;j++)
            System.out.print(val+ "\t");
            if(j<=star/2)
                val++;
            else
                val--;
            System.out.println();
            spaces=spaces-1;
            star=star+2;
            row++;
        }
        sc.close();
    }
}
