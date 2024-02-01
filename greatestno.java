import java.util.*;
public class greatestno {
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ans_1 = Math.max(a,b);
            int ans = Math.max(ans_1,c);
            System.out.println("the max no is:");
            System.out.print(ans);
        }  


    }
    
}
