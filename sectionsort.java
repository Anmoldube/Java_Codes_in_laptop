public class sectionsort{
 public static void main(String[] args)
  {
    int[] arr={88,11,44,99,55};
    SectionSort(arr);
    display(arr);
  }
 public static void SectionSort(int[] arr)
  {
       for(int counter=0;counter<arr.length-1;counter++)
      {
        int min = counter;
        for(int j=counter+1;j<arr.length;j++)
        {
            if(arr[j]<arr[min])
          {
             int temp = arr[min];
              arr[min]=arr[j];
             arr[j]=temp;
           }
         }
     }
  }
    public static void display(int[]arr)
    {
      for(int j=0;j<arr.length;j++)
        System.out.println(arr[j]+ " ");
    }
} 