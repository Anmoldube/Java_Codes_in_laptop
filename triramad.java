import java.util.Scanner;

public class triramad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         sc.close();
        int n = sc.nextInt();
        int spaces=n-1;
        int star=1;
        int row;
        for(row=1;row<=n;row++) {
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("1");
            }
             System.out.println();
            
           spaces=spaces-1;
            star=star+2;
        }
        sc.close();
    }
}
