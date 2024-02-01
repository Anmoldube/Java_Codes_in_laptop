public class arrayma {
    public static void main(String[] args) {
        int[] array= {10,30,50,55,25};
        System.out.println(maxinarray(array));
    }
    public static int maxinarray(int[] arr){
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
        if (arr[i]>max) {
            max=arr[i];
        }
        return max;
    
}
}