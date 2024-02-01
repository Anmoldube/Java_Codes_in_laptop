import java.util.Scanner;
import java.util.logging.StreamHandler;

public class calculater {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("select the opration :\n   1.addition\n 2.substration\n 3.multiplication\n");
        int operation = sc.nextInt();
        if (operation != 1 && operation!=2&&operation!=3){
            System.out.print("invalid input");
        }
        else {
            System.out.print("enter 1st no");
            int s = sc.nextInt();
            System.out.print("enter the 2nd no");
            int r = sc.nextInt();
        }
        if(operation==1){
            System.out.print(a+b);
        }
        else if(operation==2){
                System.out.print(a-b);
        }
        else if(operation==3)
        {
            System.out.print(a*b);
        }
    }
}
