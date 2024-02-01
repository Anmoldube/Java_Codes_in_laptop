import java.util.Scanner;
public class hollowsharp {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n/2;
        int j = 0;
        int row =1;
        while(row<=n){
            for(int cst=1; cst<=n;cst++){
                System.out.print("*");
            }
            for(int csp=1; csp<=j;csp++){
                System.out.print("  ");
        }
        for(int cst=1; cst<=i;cst++){
            System.out.print("*");
    }
    System.out.println();
    if (row <=n/2)
    {
        j=j+2;
        i=i-1;
    }
    else{
        j=j-2;
        i=i+1;
    }
    row = row + 1;
}
sc.close();
    }
}
        