import java.util.*;
public class ifelsrlader {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
          System.out.println("enter the number");
        int n = sc.nextInt();
        if (n>0)
        {
            System.out.println("positive");
            if(n%2==0){
                System.out.print("even");
            }
            else {
                System.out.print("odd");
            }
        }
             else if(n<0){
                System.out.println("negative ");
                if(n%2==0){
                    System.out.println("even");
                }
                else
                {
                    System.out.println("odd");
                }

            }
        else
         {
            System.out.println("zero");
        }
        sc.close();
    }

    
}
