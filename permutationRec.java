public class permutationRec {
    public static void main(String[] args)
    {
        String str = "122";
        PrintPer(str, "");
}
    public static void PrintPer(String ques, String ans)
    {
        if (ques.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++)
        {
            char ch = ques.charAt(i);
            String ros = ques.substring(0,i) + ques.substring(i + 1);
            PrintPer(ros, ans + ch);
        }
    }
}
