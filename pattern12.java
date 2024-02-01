import java.util.*;
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nr=2*n-1;
        int row=1;
        int nst=5;
        while (row<=nr) {
            int cst=1;
            while (cst<=nst) {
                System.out.print("*");
                cst++;
            }
            //prep
            System.out.println();
            if(row<=nr/2){
                nst=nst+1;
            }
                else{
                    nst=nst-1;
                }
            }
            sc.close();
        }
    }

