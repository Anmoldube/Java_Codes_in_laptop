import java.util.Scanner;

public class stringdeletethelatterusingrecursion{
        public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter the Letter Which you Want to delete");
        String ch = sc.next();
        System.out.println(Removel(str, 0,ch));
        sc.close();
    }
     static String Removel(String str,int idx, String ch)
    {
        if(idx == str.length())
        {
            return "" ;
        }
        String  Smallchar = Removel(str,idx+1,ch);
        char currchar = str.charAt(idx);
        if(!Character.toString(currchar).equals(ch))
        return  currchar + Smallchar;
        else
        {
            return Smallchar;
        }
    }
}
