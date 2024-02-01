public class linearsearh {
    public static void main(String[] args) {
        int[] array={10,23,44,37,58};
        System.out.println(linearsearh(array, 44));
    }
    public static int linearsearh(int[]arr , int item){
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==item){
                return arr[i];
            }
        }
        return 0;
    }
}
