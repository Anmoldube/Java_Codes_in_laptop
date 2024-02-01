import java.util.Scanner;

public class add {
    public static void main(String[] args)
     {
            System.out.print("enter the numbers");
            addition();
            System.out.println(  ":u got your result");
        }
        private static void addition() {
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c;
             c= a+b;
            System.out.print(c);
            sc.close();
        }
    }
}


