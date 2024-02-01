public class spiral_printing_the_matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        spiral(arr);
    }
      public static void spiral(int[][] arr) {
        int minr = 0;    //row = 0
        int maxr = arr.length - 1;    // row = 4
        int minc = 0; // column = 0
        int maxc = arr[0].length - 1;    // column = 4
        int total = arr.length * arr[0].length;      //  4*4 = 16
        int count = 0;
        while (count < total ) {
            for (int i = minc; i <= maxc; i++) {
                System.out.print(arr[minr][i]+ " ");  //
                count++;
            }
            minr++;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
                count++;
            }
            maxc--;
                for (int i = maxc; i >= minc; i--) {
                    System.out.print(arr[maxr][i] + " ");
                    count++;
                }
                maxr--;
                for (int i = maxr; i >= minr; i--) {
                    System.out.print(arr[i][minc] + " ");
                    count++;
                }
                minr++;
        }
    }
}
