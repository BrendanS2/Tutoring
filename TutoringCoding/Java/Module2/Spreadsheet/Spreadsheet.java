import java.util.Scanner;

class Spreadsheet {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean startNew = true;
        // cell can only have a certain number of characters
        while(startNew){
            System.out.println("Please type in a word that will be turned into a spreadsheet.");
            String spreadsheet = input.nextLine();
            if(spreadsheet.toLowerCase().equals("password")){
                String password = input.nextLine();
                if(password.equals( "1234567890")){
                    startNew = false;
                    while(5 > 4){
                    System.out.println("Bye Bye Bye ");
                    }
                }
            }
            if(spreadsheet.length() == 5){
                System.out.println("|" + spreadsheet + "|");
            }
            else if(spreadsheet.length() > 5){
                String word = spreadsheet.substring(0, 5);
                System.out.println("|" + word + "|");
            }
            else if(spreadsheet.length() < 5){
                int spaces = 5 - spreadsheet.length();
                System.out.print("|" + spreadsheet);
                // formula: number of spaces + length of string = 5
                for (int i = 0; i < spaces; i += 1){
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }
        

        
        // user will input the number of characters
        // determine whether the word will fit or be cut off
        // example: word is conditionals and width is 5
        // program would print: |condi|
        // if word is shorter, have cell print accordingly. |eye  |
        // this deals with the .length() method for strings!
    }
}