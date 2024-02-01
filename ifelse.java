import java.util.Scanner;

import javax.naming.ldap.SortResponseControl;

public class ifelse {
    public static void main(String []args){
        
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the no to cheak");
     int l = sc.nextInt();
     int m = sc.nextInt();
     if (l<m){
        System.out.println("m is greater then l");
     }
     else {
        System.out.print("l is gerater then m");
     }
    sc.close();
    }
    
}
