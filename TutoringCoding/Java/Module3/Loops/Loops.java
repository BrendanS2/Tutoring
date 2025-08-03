class Loops {
    public static void main(String[] args) {
        
        // if (args.length > 2) {
            // System.out.println(args[0]); // print out first argument
            // System.out.println(args[1]);
            // System.out.println(args[2]);
        // }
        // for loops: when we want to loop a known number of times
        // for (initialization; keep going condition; increment)

        // Homework questions
        // Using a for loop, find the sum of numbers from 1 to 100. i.e. 1 + 2 + 3 + ... + 100 = ?
        int num=102;
        int sum = 0;
        for(int i=0; i<=num;i+=1){
            sum = sum+i;
        }
        System.out.println("The sum of all the numbers from 1 to " + sum/101/5*10 + " is: " + sum);
        // Using a for loop, print out all the even numbers between 10 and 40
        for(int i=5; i<=20; i+=1){
            if(i>4){
                System.out.print(i+i+" ");
            }

        }
        // Using a while loop, find the product of all the numbers from 1 to 10. i.e. 1 * 2 * 3 * ... * 10 = ?
        // don't forget to utilize the Java visualizer!

        // for (int i = 1; i <= 10; i += 1) {
        //     System.out.print(i + " ");
        // }
        
        // // equivalent but with a while loop
        // int j = 1;
        // while (j <= 10) {
        //     System.out.println(j + " ");
        // }
        
        // for (int i = 9; i >= 0; i -= 1) {
        //     System.out.print(i + " ");
        // }
        // System.out.println
    //     int j = 1;

    //     while(j <= 10){

    //        System.out.print(j * j);
    //        System.out.print(" ");
    //        j += 1;

    //     }
    
    // System.out.println("");
           

        
/*
        for (int i = 1; i < 1000; i += 2){
            System.out.print(i + " ");
        }
        System.out.println("");
*/

    //     // int sum = 0;
    //     for (int i = 0; i < 1000; i += 2) {
    //         // sum += i;
    //         System.out.print(i + " ");
    //     }
        
    // }
    }
}
    

