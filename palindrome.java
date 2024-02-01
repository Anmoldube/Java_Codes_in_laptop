import java.util.Scanner;

class palindrome{
    public static boolean fun(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(fun(s));
        sc.close();
    }
}