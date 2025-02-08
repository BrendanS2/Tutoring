import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length()/2)); 
        System.out.println(text.charAt(text.length()-1));
        // practice with substrings!
        System.out.println("Brendan".substring(0, 3));
        System.out.println("It is a weird name I know but now lets try to make a random word");
        // ask the user for a word
        System.out.println("Give me a word that is more than 6 letters");
        String word = input.nextLine();
         // print the word without the first letter
        System.out.println(word.substring(0, 1)); 
         // print the word without the middle letter
        System.out.println(word.substring(2, 3));
        // print the word without the last letter 
        System.out.println(word.substring(5, 6));
        System.out.println("There is your random word which was out of " + word);
        System.out.println("Now time for mad libs!");
        System.out.println("What is your favorite flavor of ice cream");
        String icecream = input.nextLine();
        System.out.println("Think of a color");
        String color = input.nextLine();
        System.out.println("Think of a name");
        String name = input.nextLine();
        System.out.println("What is your favorite youtuber");
        String youtuber = input.nextLine();
        System.out.println("Think of another name");
        String anotherName = input.nextLine();
        System.out.println("Okay so there once was a " + name + " who watched the youtuber " + youtuber + " and wanted the color " + color + " but one day another person named " + anotherName + " saw you and asked you into a ice cream duel. You decided to play and they said whoever can eat the icecream flavor " + icecream + " the fastest will get to meet their favorite youtuber. So you ate the icecream as fast as you can but on the last bite lost because of " + anotherName + " distracting you. You were so sad that you didn't get to meet " + youtuber + " and you lived sadly ever after. THE END.");
        System.out.println("What an amazing story! Alright got to go now bye!");
        
        // print out the first, middle, and last letter of the word
       
       
    }
    
}