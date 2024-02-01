public class matrix_search {
    public static void main(String[] args) {
       // int x = 6;
        int [] [] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(lenears(arr, 77));
    }
    public static int lenears(int [][] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == x){
                    return arr[i][j];
                }
          }
    }
    return -1;
}
}
