import java.util.Scanner;

public class fibonaccinumber {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            if(n==0){
                System.out.println(1);
            }
            else if(n==1){
                System.out.println(1+"");
                System.out.println(1);
            }
            else{
                System.out.println(1+"");
                System.out.println(1+"");
                int a=1;
                int b=1;

                for(int i=2;i<=n;i++){
                int c;
               c = a+b;
                System.out.println(c+"");
                a=b;
                b=c;
                }
            }
        }
        
    }
}
