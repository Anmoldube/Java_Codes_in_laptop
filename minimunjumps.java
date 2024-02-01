import java.util.Scanner;

public class minimunjumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []h = new int[n];
        for(int i=0;i<h.length;i++){
            System.out.println("enter the elements "+i+" ");
            h[i]=sc.nextInt();
        System.out.println(minJumps(h,nq,0));
        sc.close();
    }
    }
    static int minJumps(int[] h, int nq,int idx) {
        if(nq == 0){
            return 0;
        }
        int opt1 = Math.abs(h[idx] - h[idx+1] + minJumps(h, nq, idx+1));
        if(idx == nq-2)
        return opt1;
        int qpt2 = Math.abs(h[idx] - h[idx+2] + minJumps(h, nq, idx+2));
        return Math.min(opt1, qpt2);
    }
}
