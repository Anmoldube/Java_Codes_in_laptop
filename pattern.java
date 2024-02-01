import java.util.Scanner;

public class pattern {
    public static void main(String []args){
        int i;
        int j;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }

}