import java.util.Scanner;

public class tableofn {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long i = 1;
        while (i<11) {
        
            i++;
            System.out.println(i*n);
            sc.close();
        }
    }
}
