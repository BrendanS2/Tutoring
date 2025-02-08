public class Methods {
    public static  void main(String[] args) { // main method: code thqt runs when you press play
        System.out.println("Hello, world!");
        System.out.println(sum(5, 4));
        System.out.println(average(6, 7));

        // random numbers
        System.out.println((int) (Math.random()*10)); // Math.random() produces a random double between 0 and 1
        // multiply by the range to get larger numbers!
    }

    // can add functions / methods to the class
    public static int sum(int x, int y) {
        int answer = x + y;
        return answer;
    }
    public static double average (int a, int b){
        double average = ((double) a+b)/2; // double = decimal
        return average;
    }

    // methods practice
    // write a method that takes in three distinct integers and returns the smallest integer
    // write a method that takes in a base and a power and returns the value of the base raised to that power, e.g. 2 to the 3rd power

    

} {
    
}
