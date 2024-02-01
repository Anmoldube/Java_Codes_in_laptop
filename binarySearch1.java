public class binarySearch1 {
    public static void main(String[] args) {
        int [] array = {10,20,30,40};
        System.out.println(binarysearch(array,20));
    }
    public static int binarysearch(int [] arr,int item){
        int lo = 0;
        int hi = arr.length-1;
        while (lo<=hi) {
        int mid = hi+lo/2;
        if(arr[mid] == item){
            System.out.println("hiii");
            return arr[mid];
        }
        else if(arr[mid] < item){
            lo = mid+1;
        }
        else{
            hi = mid -1;
        }
    }
    return -1;
}
}
