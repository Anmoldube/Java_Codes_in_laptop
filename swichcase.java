 import java.util.*;
    public class swichcase {
        public static void main(String []args)
        {
            int x=0;
            int y=0;
            System.out.println("enter here");
            Scanner sc = new Scanner(System.in);
            char move = sc.next().charAt(0);
            switch(move)
            {
                case 'l':
                x--;
                break;
                case 'r':
                x++;
                break;
                case 'u':
                y++;
                break;
                case 'd':
                y--;
                break;
                default:
                System.out.println("invalid");
                sc.close();
            }
        }
    }
