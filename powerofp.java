public class powerofp {
    public static void main(String[] args) {
        System.out.println(power(4,5));
    }
    static int power(int p, int q){
        if(q == 0){
            return 1;
        }
        int r = power(p,q-1);
        return r*p;
    }
}
