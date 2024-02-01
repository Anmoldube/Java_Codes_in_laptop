import java.util.*;
public class pattern4 {
    public static void main(String []args){
        int i=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
