import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int spaces=2*n-3;
        int star=1;
        int row=1;
        while (row<=n) {
           for(int i=1;i<=star;i++){
            System.out.print("*");
           }
           for(int j=1;j<=spaces;j++)
           {
            System.out.print(" ");
           }
           int i=1;
            while(i<=star){
                if(row==n && i==star)
                continue;
                System.out.print("*");
                i++;
            }
            System.out.println();
            row=row+1;
            star=star+1;
            spaces=spaces-2;
        }
        sc.close();
    }
}
