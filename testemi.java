import java.util.Scanner;
public class testemi {
    public static void main(String[] arg)
    {
        emi obj = new emi();
        obj.input();
        obj.call();
    }
}
class emi {
    int p,n;
    double r,emi;

    void input()
    {
        Scanner myobj = new Scanner(System.in);
         n = myobj.nextInt();
        r = myobj.nextDouble();
        p = myobj.nextInt();
        r=r/1200;
        n=12*n;
    }
    void call()
    {
        double k=1;
        for(int i=1;i<=n;i++){
        k=k*(1+r);
        emi=p*r*k/(k-1);
        System.out.println("Emi=" +emi);
        }
    }
}