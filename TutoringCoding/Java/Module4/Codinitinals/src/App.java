import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(5 > 4); // comparison expressions return booleans
        System.out.println(4 == 3);
        System.out.println(true && false);
        System.out.println(true || false); // or -- only one part needs to be true for the whole thing to be true
        
        System.out.println(20 > 25 || 4 == 4);

        System.out.println(Math.random()); // random decimal between 0 and 1
        System.out.println((int) (Math.random()*100)); // scale by multiplying by the range

        // this code shows that when you have higher sampling you get more accurate results!
        // and we also practiced loops and conditionals
        int count = 0;
        int numLoops = 100;
        for (int i = 0; i < numLoops; i++) {
            int num = ((int) (Math.random()*100));
            //System.out.println(num);
            if(num <50){
                count += 1;
            }
        }
        System.out.println((int)((double)count/(double)numLoops*100) + "%");

        // ASCII -- library of characters
        System.out.println((int)'A');
        System.out.println((char) 64);

        // random lowercase letter
        int randomNum = ((int)(Math.random()*26));
        System.out.println((char)(randomNum+97));

        // uppercase or lowercase
        boolean uppercase = false;
        int offset;
        if (uppercase) {
            offset = 65;
        } else {
            offset = 97;
        }
        System.out.println((char)(randomNum+offset));

        // have the computer pick a random lowercase letter
        // ask the user to guess the random letter
        // keep going until they guess the letter!

        // or make random names!
        // given a length, generate a random name or word
        // chars can only have 1 char but strings work with multiple chars
        char ch1 = 'f';
        char ch2 = 'l';
        String str = String.valueOf(ch1) + ch2;

        Scanner input = new Scanner(System.in);
        String someText = input.nextLine(); // might need to cast to a char

    }
}
