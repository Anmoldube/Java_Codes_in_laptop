import java.util.Scanner;

public class pyramid {
        public static void main(String[] args){
        int i=1;
        int j=1;
        Scanner sc = new Scanner(System.in);        sc.close();

        System.out.println("enter a number");
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            while ( i<=n) {
                while (j<=(n-i))
                {
                    System.out.println("");
                    j++;
                }
                int k=1;
                while (k<=(2*i-1))
                {
                    System.out.print("*");
                    k++;
                }
                        i++;
                System.out.println("");
            }
        }
    }
}
