public class largest_element {
       public static void main(String[] args)
    {
          int [] arr = {1, 2, 3, 4, 5,44,55,64,33,44};
          System.out.println(largest_elemenT(arr));

    }
    public static int largest_elemenT(int[] arr){
            int largest  =  arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>largest){
                    largest = arr[i];
                }
            }
            return largest;
    }
}