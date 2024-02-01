import java.util.*;
public class leapyr {
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
          System.out.println("enter the yr");
        int n = sc.nextInt();
        if(n%4==0 && n%100!= 0)
        {
            System.out.println("yes it is a leap yr");
        }
        else if (n%400==0 ){
            System.out.println("yes it is a leap yr");
        }
        else{
            System.out.println(" it'nt is a leap yr");
        }
        sc.close();
}
    
}
