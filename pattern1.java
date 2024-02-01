import java.util.*;
public class pattern1 {
    public static void main(String []args){

        int i;
        int j1,j2;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j1=i;j1<=n;j1++){
                System.out.print("*");
            }
            for(j2=1;j2<i;j2++){
                System.out.print("-");
            }
            System.out.println("");
        }
}

}