import java.util.Scanner;

public class cheakpalidromeusingrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(res(s,0));
        sc.close();
    }
    static String res(String s, int idx){
            if(idx == s.length()) return "";
            String small = res(s, idx+1);
           String sm = small + s.charAt(idx);
        String sma = s.charAt(idx) + small;
        if(sm.equals(sma)){
            return "nopes";
        }
        return "yes";
    }
}
