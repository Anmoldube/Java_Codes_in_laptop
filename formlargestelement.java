public class formlargestelement {
    public static void main(String[] args) {
        int [] arr={3,4,5,55,9};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i] > max)
            {
                max = arr[i];
            }

             System.out.println("the lno is : " +max);
        }
    }
}
