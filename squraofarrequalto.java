import java.util.Scanner;

public class squraofarrequalto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        System.out.println(nearestvalue(n));
        sc.close();
    }
    public static int nearestvalue(int x){
        int lo = 0;
        int hi = x;
        int ans = 0;
        while(lo<=hi){
            int mid = hi-lo/2;
            if((long)mid*mid<=(long)x){
                ans = mid;
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
