public class printArrayusingrecursion{
    public static void main(String[] args) {
        int [] arr =  {1,2,3,4,5};
       printArray(arr,0);
    }
    static void printArray(int [] arr ,int  idx){
            if(idx == arr.length){
                return ;
            }
            System.out.println(arr[idx]);
            printArray(arr, idx+1);
    }

}
