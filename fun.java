public class fun {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println(a+ " " +b);
        fun(a,b);
        System.out.println(a+ " " +b);
    }
    public static void fun(int a, int b){   // there the copy of actual parameter
        int temp=a; //temp=1
        a=b;//a=2
        b=temp;//b=1
        System.out.print(a+ " " +b );
        System.out.println(" :fuction");
        
    }
}
