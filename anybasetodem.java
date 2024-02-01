import java.util.Scanner;

public class anybasetodem 
    {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int snum = sc.nextInt();
        int sb = sc.nextInt();
        int result = anybasetodecimal(snum,sb);
        System.out.println(result);
        sc.close();
    }
    public static int anybasetodecimal(int snum,int sb)
    {
        int ans = 0;
        int multipler=1;
            while (snum !=0)
        {
            int res=snum%10;
            ans=ans+(res*multipler);
            multipler=multipler*sb;
            snum=snum/10;
        }
        return ans;
    }
}
