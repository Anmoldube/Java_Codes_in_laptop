import java.util.Scanner;
public class loops{
//     static int val=100;
// public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in); sc.close();
    // System.out.println("hey!");
    // int a = 8;
    // int b = 4;
    // System.out.println(addTwoNumbers());
     //addTwoNumbers(4,8);
    //  int x= 10;
    //  fun(x);
    // System.out.println(val);

    // System.out.println("enter a value here of triangle");
    // int n= sc.nextInt();
     // int sum=0;
    // int n = sc.nextInt();
    // for (int i =0;i<=n;i++){
    //     sum = sum + i;
    //     System.out.println(sum );
    //     sc.close();
    //     if(n%2 == 0 ){
    //         System.out.println("yes we got it ");
    //     }
    //     else {
    //         System.out.println("nopes");
    //     }
    // }
    // int a = 90;
    // int b = 90;
    // int c = 20;
    // if (a<b){
    //     System.out.println(b);
    // }
    // else if(a<c)
    // {
    //     System.out.println(c);
    // }
    // else if(b<){
    //     System.out.println(a);
    // }
    // if(a>b && a>c){
    //     System.out.println(a);
    // }
    // if(a<b && b>c){
    //     System.out.println(b);
    // }
    // if(b<c && a<c){
    //     System.out.println(c);
    // }
    // else{
    //     System.out.println("any value is equal");
    // }
    // while(row<=n){
    //     int i=1;
    //     while(i<=space){
    //     System.out.print("  ");
    //     i = i+1;
    // }
    //     int j =1;
    //     while(j<=star){
    //         if(j%2==0){
    //     System.out.print("   ");
    //         }
    //         else{
    //             System.out.print("*");
    //         }
    //         j++;
    // }
    // row += 1;
    // int star = 1;
    // int row=1;
    // while(row<=2*n-1){
    //     int j=1;
    //     while(j<=star){
    //         System.out.print("*"+ " ");
    //         j++;
    //     }
         //mirroring
    //     if(row<n){
    //     star++;
    //     }
    //     else{
    //         star--;
    //     }
    //     row++;
    //     System.out.println();
    // }
        // int star= n;
        // int space = 0;
        // int row = 1;
        // while(row<=2*n-1){
            //space
        //     int j = 0;
        //     while (j<=space) {
        //         System.out.print("  ");
        //         j++;
        //     }
        //     int i=1;
        //     while (i<=star) {
        //         System.out.print("*" + " ");
        //         i++;
        //     }
        //     row++;
        //     if(row<=n){
        //         space= space+2;
        //         }
        //         else{
        //             space=space-2;
        //         }
        //     if(row<=n){
        //         star--;
        //         }
        //         else{
        //             star++;
        //         }
        //     System.out.println();
        // }
        // int star = 0;
        // int row =1;
        // while (row<=n) {
        //     for(int i =0;i<=star;i++){
        //         System.out.print("* ");
        //     }
        //     row++;
        //     star++;
        //     System.out.println();
        // }

        // important to check this one pascal triangle



        // int row=0;
        // int star = 0 ;
        // System.out.println();
        // while (row<n) {
        //     int i=0;
        //     int ncr = 1;
        //     while(i<=star){
        //         System.out.print(ncr + " ");
        //         ncr = ((row-i)*ncr)/(i+1);
        //         i++;
        //     }
        //     row++;
        //     star++;
        //     System.out.println();
        // }
        //   sc.close();
        //     char ch = '1';
        //     System.out.println((int)(ch));
        // int i = 65;
        // System.out.println((char)(i));

        // for (byte b = 0; b<128; b++) {
        //     System.out.println(b);
        // }

        // byte a= 1;
        // byte b=5;
        // byte c = (byte) (a+b); // type casting because of size of byte compiler is playing on the safe side!
        // System.out.println(c );

        // int n = 45;
        // int mul = 1;
        // int ans = 0;
        // while(n>0)
        // {
        //     int rem = n%2;
        //     ans = ans + mul*rem;
        //     mul = mul*10;
        //     n /=2;
        // }
        //  System.out.println(ans);

        // public static void addTwoNumbers() {
        //     int a = 2;
        //     int b = 5;
        //     int c = a + b;
        //     System.out.println(c);
        // }
        // public static void SubTwoNumbers() {
        //     int a = 2;
        //     int b = 5;
        //     int c = a - b;
        //     addTwoNumbers();
        //     System.out.println(c);
        // }

        //Function demo2;

        // public static int addTwoNumbers(){
        //     int a = 2;
        //     int b = 5;
        //     int c = a + b;
        //     //addTwoNumbers(); // why it is not working is a question AS Because hey and bye!!?
        //     return c;
//}
            // parameterized function
            // public static void main(String[] args) {
            //     Scanner sc = new Scanner(System.in); sc.close();
            //     System.out.println("hey!");
            //     int a = 8;
            //     int b = 4;
            //      addTwoNumbers(a, b);
            //     System.out.println("bye");
            // }

            // public static void addTwoNumbers(int a,int b)
            // {
            //     int c = a+b;
            //     int d = a*b;
            //     System.out.println(d);
            //      System.out.println(c);
            // }

// In Java, when you declare and initialize variables in a method, those variables are scoped to that method. In this case, within the main method:

// java
// Copy code
// public static void main(String[] args) {
//     int a = 8;
//     int b = 4;
//     addTwoNumbers(a, b);
   // other code
// }
// Here, a and b are local variables of the main method. They are declared and assigned values (8 and 4, respectively) within the main method. The scope of these variables is limited to the main method, meaning they are only accessible within the curly braces {} of the main method.

// When you call the addTwoNumbers method:

// java
// Copy code
// addTwoNumbers(a, b);
// You are passing the values of a and b as arguments to the addTwoNumbers method. The method signature is:

// java
// Copy code
// public static void addTwoNumbers(int a, int b) {
     // method body
// }
// In this method, a and b are parameters. These parameters act like placeholders for the
//values that will be provided when the method is called. When you call the method with addTwoNumbers(a, b),
//the values of a and b from the main method are passed into the addTwoNumbers method.

// Therefore, the values of a and b within the addTwoNumbers method are not the same variables as in the
// main method; they are separate copies that receive the values passed as arguments.
//This allows methods to operate on different values without affecting the original variables in the calling method.

// public static void fun(int x){
//     System.out.println(x);
//     int val = 120;
//     System.out.println(val);

public static void main(String[] args) {
    int [] arr = {10,20,30,40} ;
    for (int i=0;i<arr.length;i++)
    System.out.println(arr[i]);
    System.out.println(arr.length);
    }
}



