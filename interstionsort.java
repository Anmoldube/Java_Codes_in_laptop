public class interstionsort {
         public static void main(String[] args) {
            int[] arr = {10,40,55,32,55,1,5};
            fun(arr);
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
        public static void fun(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int item = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > item) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = item;
        }
    }
        
}
// public class interstionsort {
//     public static void main(String[] args) {
//        int[] arr = {10,40,55,32,55,1,5};
//        fun(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
//    public static  void fun(int[] arr){
//        for(int i=1;i<arr.length;i++){
//        int item = arr[i];
//        int j = i-1;
//        while(arr[j]>item){
//            if(arr[j]>item){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            j++;
//            arr[i] = item;
//        }
//        }
//    }
// }
