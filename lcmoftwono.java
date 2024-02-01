import java.util.Scanner;

public class lcmoftwono {
 public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     
     int a = sc.nextInt();
     int b = sc.nextInt();
     int y=a*b;
     
    int ans=a;
    for(int i=a;i<=y;i=i+a){
        if (i%b==0){
            ans=i;
            break;
        }
    }
    System.out.println(ans);
    sc.close();
    }   
}
