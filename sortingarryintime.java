public class sortingarryintime {
    public static void main(String[] args) {
        int[]arr={0,1,2,0,1,2};
        bubblesort(arr);
        display(arr);

    }
    public static int bubblesort(int []arr){
        for(int counter=0;counter<arr.length-1;counter++)
        {
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return 0;
    }
    public static void display(int []arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
