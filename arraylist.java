import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list =  new ArrayList<>();
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(0,30);
        System.out.println(list);
        System.out.println(list.size());

         //Deleting in arraylist  and the range is 0 --> size-1
         System.out.println(list.remove(0));
         System.out.println(list);

         //get the element at some index we use get method and the range is 0 --> size-1
            list.add(-33);
            list.add(40);
         System.out.println(list.get(0));
         System.out.println(list);

         //set  --> it used to update the value and the range is 0 --> size-1
         System.err.println(list.set(2, 30));
         System.out.println(list);


         // looping in array_list
         for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
         }
         System.out.println();
             //iterative for loop forward moving only ----------> ------->  && val could be anything (Entity)
            for (int val : list) {
                System.out.print(val +" ");
            }
            System.out.println();
            // input in arraylist
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> l1 = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
               l1.add(sc.nextInt());
            }
            sc.close();
            System.out.print(l1+" ");
            System.out.println();
            //sort fuction in array_List
            Collections.sort(l1);
            System.out.println(l1);



    }
 }

