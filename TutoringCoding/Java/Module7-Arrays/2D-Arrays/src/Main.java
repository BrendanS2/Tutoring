public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to 2D arrays");
        System.out.println("2D arrays can represent lots of things, like a grid used for a game such as tic tac toe, or chess");

        // like one-dimensional arrays, there are several ways of initializing new 2D arrays
        int[][] arr1 = new int[3][2]; // (3, 1)
        int[][] arr1_2 = {{0, 0, 0}, {0, 0, 0}}; // exact same array as arr1, just different way of initializing
        // {{0, 0, 0},
        //  {0, 0, 0}}

        int[][] arr2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        // arr2[0] is the array {1, 2, 3, 4}
        // print1DArray(arr2[0]);
        // print1DArray(arr2[1]);
        // print1DArray(arr2[2]);
        System.out.println("printing 1D array");
        print1DArray(arr2[2]);
        System.out.println("printing 2D array");
        print2DArray(arr2);
    }

    public static void print2DArray(int[][] array) {
        for(int i=0; i<array.length; i+=1) { // for arr2, i will be 0, 1, 2
            for (int j = 0; j<array[0].length; j+= 1) { // for arr2, j will be 0, 1, 2
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // i = 0, j = 0, print arr[0][0] > 1
        // i = 0, j = 1, print arr[0][1] > 2

    }

    public static void print1DArray(int[] array){
        for (int i = 0; i < array.length; i += 1) { // 0 is always the index of the first element 
            // i is our index: array[i] = ith element of the array
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
