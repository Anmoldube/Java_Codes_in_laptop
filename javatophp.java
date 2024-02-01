import java.util.Scanner;

public class javatophp {
    public static boolean fun(String str){
        int i  = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(fun(str));
        sc.close();
    }
}
