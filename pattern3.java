import java.util.Scanner;

public class pattern3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int j=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
