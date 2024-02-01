import java.util.Scanner;

public class palinedrome {
    public static void main(String[] args) {
        int s=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=n;
        while(n>0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(c==s){
            System.out.println(c+ " it's a palin "  );
        }
        else
        {
            System.out.println("it is not");
        }
        sc.close();
    }
}

