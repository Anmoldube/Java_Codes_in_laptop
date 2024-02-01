import java.util.Scanner;

public class printingwordsinastring {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the string");
        String str = sc.nextLine();
        System.out.println("string is :" +str );
        String word = "";
        
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            if(currentChar != ' ')
            {
                word += currentChar;
            }
            else{
                System.out.println(word);
                word ="";
            }
        }
    }
}
