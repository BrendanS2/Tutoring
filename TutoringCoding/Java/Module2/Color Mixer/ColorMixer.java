
import java.util.Scanner;


class ColorMixer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome User12345689");
        int number=0;
        System.out.println("Please type in one primary colors");
       
        String onePrimary = input.nextLine().toLowerCase();

        while (!onePrimary.equals("blue") && !onePrimary.equals("yellow") && !onePrimary.equals("red")) {
            System.out.print("Please type in two >>>>>PRIMARY<<<<< COLORS: ");
            onePrimary = input.nextLine().toLowerCase();
        }
        System.out.println("Please type in another primary color");
        String secondPrimary = input.nextLine().toLowerCase();
        while (!secondPrimary.equals( "blue") && !secondPrimary.equals( "yellow") && !secondPrimary.equals( "red")) {
            System.out.println("Please type in two >>>>>PRIMARY<<<< COLORS");
            secondPrimary = input.nextLine().toLowerCase();
        }
        if(onePrimary.equals("blue")){
            if(secondPrimary.equals( "red")){
                System.out.println("You made the color purple");
            }
            else if(secondPrimary.equals("yellow")){
                System.out.println("You made the color green");
            }

        }
        else if(onePrimary.equals("yellow")){
            if(secondPrimary.equals("blue")){
                System.out.println("You made the color green");
            }
            else if(secondPrimary.equals("red")){
                System.out.println("You made the color orange");
            }

        }
        else if(onePrimary.equals("red")){
            if (secondPrimary.equals("blue")){
                System.out.println("You made the color purple");
            }
            else if(secondPrimary.equals("yellow")){
                System.out.println("You made the color orange");
                while(5>4){
                    
                    System.out.println(number++);

                }
            }

        }
    }
}
