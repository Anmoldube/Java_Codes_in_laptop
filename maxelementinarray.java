public class maxelementinarray {
    public static void main(String[] args) {
        int [] arr = {5,6,8,9};
        System.out.println(printmaxel(arr, 0));
    }
    static int printmaxel(int [] arr , int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int sm = printmaxel(arr,idx+1);
        return Math.max(idx, sm);
    }
}
