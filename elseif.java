import java.util.Scanner;

public class elseif {
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=11){
            System.out.println("child");
        }
        else if( n<=11 && n<=20){
            System.out.println("teenage");
        }
        else if (n>20 && n<=60){
            System.out.println("adult");
        }
        else if (n>=60){
            System.out.println("you r too old");
            sc.close();
        }
    }
}
