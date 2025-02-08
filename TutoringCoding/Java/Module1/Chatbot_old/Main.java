import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Hello my name is Brendan" );
        Scanner input = new Scanner(System.in);
        String yourName = input.nextLine();
        System.out.println("Welcome to chatbot, " + yourName + "!");
        System.out.println("What is your favorite food?" );
        String favoriteFood = input.nextLine();
        System.out.println("What is your favorite sport?" );
        String favoriteSport = input.nextLine();
        System.out.println("What is your favorite candy?");
        String favoriteCandy = input.nextLine();
        System.out.println("So your favorite food is " + favoriteFood + ", Your favorite sport is " + favoriteSport + ", and Your favorite candy is " + favoriteCandy + "Cool but I don't care");

    }
    
}
