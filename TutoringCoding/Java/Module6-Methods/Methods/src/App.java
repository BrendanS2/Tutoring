import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while(true){
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your favorite letter?");
        String letter = input.nextLine();
        System.out.println("What is your favorie number?");
        int num = input.nextInt();
        System.out.println("--------------------------------");
        for (int i = 0; i < num; i++) {
        
            for (int s = 0; s < num; s++) {
                System.out.print(letter);
            }
        System.out.println("");
        }
    }
}
    }

