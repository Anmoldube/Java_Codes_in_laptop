//import java.util.*;
public class pattern5 {
    public static void main(String []args){
        int i;
        int j;
        for(i=1;i<=9;i++){
            for(j=1;j<=9;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        int midRow = (9 / 2) + 1;
      for ( i = 1; i <= 9; i++) {
         for (j = 1; j <= 9; j++) {
            if (j == midRow || i == midRow || i + j == midRow + 1 || j - i == midRow - 1) {
               System.out.print(" ");
            } else {
               System.out.print(" ");
            }
         }
         System.out.println();
    }
}
}
