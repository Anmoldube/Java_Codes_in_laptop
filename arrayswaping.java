public class arrayswaping {
        public static void main(String[] args) {
     int arr[];
     arr = new int[5];
     arr[0]=10;
     arr[1]=20;
     arr[2]=30;
     arr[3]=40;
     arr[4]=50;
           int temp =arr[0];//temp->20
            arr[0]=arr[2];//arr1->30
            arr[2]=temp;//arr2->20
            for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        }
    }
