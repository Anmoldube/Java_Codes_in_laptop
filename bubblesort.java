public class bubblesort {
    public static void main(String[] args) {
        int[] arr={88,77,66,55,44,33,22};
        bubble(arr);
        display(arr);
    }
    public static void bubble(int[] arr){
        for(int counter=0; counter<arr.length-1; counter++){
            for(int j=0; j<arr.length-1-counter ;j++){
                if (arr[j]>arr[j+1]){
                    //swap function
                    int temp=arr[j];//temp=33
                    arr[j]=arr[j+1];//arr[j]=44
                    arr[j+1]=temp;//arr[j+1]=33
                }
            }
        }
    }
    public static void display(int[] arr){
        for(int i=0; i<arr.length ;i++)
        System.out.print(arr[i] +" ");
    }
}
