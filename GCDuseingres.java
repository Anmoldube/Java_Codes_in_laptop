import java.util.Scanner;

public class GCDuseingres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gofno(x,y));
        sc.close();
    }
    static int gofno(int x,int y){
        if( x == 0 || y==0 ){
            return x;
        }
       return gofno(y, x%y);
    }
}
