import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int spaces=n-1;
        int star=1;
        int val;
        int row=1;
        while (row<=n) {
            val=row;
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print(val);
            }
            System.out.println();
            row++;
            spaces=spaces-1;
            star=star+2;
        }
        sc.close();
    }
}
