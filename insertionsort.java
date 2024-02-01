public class insertionsort {
public static void main(String[] args) {
    int []arr={10,55,44,77,66};
    intersort(arr);
    display(arr);

} 
public static void intersort(int[]arr){
    for(int counter=1;counter<arr.length;counter++)
    {
        int j=counter-1;
        int val=arr[counter];
        while (j>=0 && arr[j]>val) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=val;
    }
}
public static void display(int[]arr) {
    for(int j=0;j<arr.length;j++)
    System.out.println(arr[j]+ " ");
}
}
