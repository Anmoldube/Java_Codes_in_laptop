import java.util.*;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        int i=1;
        int j;
        int row=1;
        while(row<=n){
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++){
                System.out.print("");
            }
            System.out.print("*");
        }
        System.out.println();
        i=i++;
        row++;
    }

    }
}