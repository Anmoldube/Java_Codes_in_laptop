public class bubblesortnew {
    public static void main(String[] args) {
        int[] arr = {10,40,55,32,55,1,5};
        for(int pass =0;pass<arr.length;pass++){
            for (int i = 0; i < arr.length-1-pass; i++) {
        if(arr[i]<arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    }
    for (var i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
}
