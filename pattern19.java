import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int space=num/2;
        int star=1;
        int row=1;
        while(row<=num){
            int i=1;
            while(i<=space)
            {
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=star)
             {
                System.out.print("*");
                j++;
            }
            if(row<=num/2)
            {
                star+=2;
                space--;
            }
            else
            {
                star-=2;
                space++;
            }
            System.out.println();
            row=row+1;
        }
        sc.close();
    }
}
