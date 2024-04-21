public class Wrapper_Class {
    public static void main(String[] args) {
        Integer a = 100;
        int a1  = 10;
       // System.out.println(a);// Wrapper Class access ho  rhi hai heap memory m!!
       // System.out.println(a1);
        a=a1;
        System.out.println(a); //10 (int to Wrapper ) This process is known as auto boxing!!
        Integer ii = 100;
        int i= 10;
        i=ii;  // this is known as (unboxing)   wrapper to int
        System.out.println(i); //100


        Integer c1 = 19;
        Integer c2 = 19;
        System.out.println(c1==c2);
        Integer b1 = 128;
        Integer b2 = 128;
        System.out.println(b1==b2);
    }
}
