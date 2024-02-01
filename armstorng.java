import java.util.Scanner;

public class armstorng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstorng1(n));
        sc.close();
    }
    public static boolean armstorng1(int n){
        int temp = n;
        int d = cheakarm(n);
        int ans = 0;
        while(n>0){
        int rem = n%10;
        ans =  (int) (ans+Math.pow(rem,3));
        n= n/10;
    }
    if(ans==temp){
        return true;
    }
    return false;

}
    public static int cheakarm(int n){
        int c= 0;
        while (n>0) {
            n= n/10;
            c++;
        }
        return c;
    }
}
