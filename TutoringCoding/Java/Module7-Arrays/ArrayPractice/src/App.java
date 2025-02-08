


public class App {
    public static void main(String[] args) throws Exception {
        
        // arrays are ordered lists of elements containing ints, doubles, bools, and strings
        int[] array1 = new int[10]; // one way of initializing a new array
        // 0's are put into arrays by default with the above syntax {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        int[] array2 = {3, 1, 4}; // if we know what values we want to put, we can use this syntax
        int[] newArray = new int[68];

        System.out.println(array2[2]); // syntax is arrayName[index] = arrayElement at that index

        // the first element always has index 0
        // the last element always has index len(array)-1
        // example: an array of length 3 has indices 0, 1, 2

        System.out.println(array1[5]);
        array1[5] = 6;
        System.out.println(array1[5]);
        array1[8] = 1000;
        array2[2] = 89;
        System.out.println(array1); // this prints out the address in memory (we don't need to know what it means)
        int[] array4 = {4, 56, 4666, 70000};
        System.out.println(array2.length); // last index is length-1

        System.out.println();
        printArray(array1);
        printArray(array2);

        String[] words = {"I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java","I", "love", "Java"};
        // printStringArray(words);
        // printIntAray(1000);
        kaySo(newArray);
        // words = {"Hello", "Hello"};
        words[0] = "Hello";
        words[1] = "Hello";

        int[] array3 = {1, 4, 8, 2, 3, 4, 1};
        boolean sameElement = kaySo(array3);
        System.out.println(sameElement);

        int AddingNumbers = addingNumbersArrayisVeryCoolsoUShouldTryItandUhmThisISAFunction(array4);
        System.out.println(AddingNumbers);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i += 1) { // 0 is always the index of the first element 
            // i is our index: array[i] = ith element of the array
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printStringArray(String[] array){
        for (int i = 0; i < array.length; i += 1) { // 0 is always the index of the first element 
            // i is our index: array[i] = ith element of the array
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    // 1 4 9 16 25 36 49 64 81 100
    public static void printIntAray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]=i*i);
            System.out.print(" ");
            
        }
    }

    public static boolean kaySo(int[] integers) {
        int firstIndex = 0;
        int lastIndex = integers.length-1;

        int firstElement = integers[0];
        int lastElement = integers[lastIndex];
        if(firstElement == lastElement){
            System.out.println("You win");
            printArray(integers);
            return true;
        }
        else{
            System.out.println("You lose");
            printArray(integers);
            return false;
        }

        
        
    }

    public static int addingNumbersArrayisVeryCoolsoUShouldTryItandUhmThisISAFunction(int[] numbers){
        int Nums = 0;
        for (int i = 0; i < numbers.length; i++) {
            int totalNumbers = numbers[i];
            Nums += totalNumbers;
        }
        return Nums;

        
        
    } 
}
