import java.util.*;
public class factorial{
   

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println("enter the number");
        int n = sc.nextInt();
        int i=1;
        while (n>0) {
            
              i=i*n;
             n--;
        
        System.out.println(i);
        }
        }
    }
}