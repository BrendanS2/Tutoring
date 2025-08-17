import java.util.Scanner;


public class Game {
    public char[][] board;

    public Game() {
        board = new char[3][3];
    }
    // public static void main(String[] args) throws Exception {
    //     Scanner scam = new Scanner(System.in);
    //     int player = 1;
    //     char[][] board = new char[3][3];
    //     // board[0][0] = 'O';
    //     // board[1][1] = 'O';
    //     // board[2][1] = 'X';
    //     // board[2][2] = 'O';
    //     System.out.println((int) board[0][0]);
    //     // System.out.println(board[0][0]);
    //     // if player == 1:
    //     boolean PlayAgain;
    //     // while(true) {
            
    //     boolean gameOver = false;
    //     while(!gameOver)
    //         if(player == 1){
    //             player = 2;
    //         board = userInput(board, 'X');
    //         print(board);
    //         gameOver = winConditions(board);
    //         }else if(player ==2){
    //             player = 1;
    //         board = userInput(board, 'O');
    //         print(board);
    //          gameOver = winConditions(board);
    //         }
            
        
        
    //     // // example of grabbing string input
    //     // System.out.print("give me your example string input > ");
    //     // String myString = scam.nextLine(); // can accept any input
    //     // // example of grabbing integer input
    //     // System.out.print("give me your example integer > ");
    //     // int myInt = scam.nextInt(); // can only accept integers
    //     // System.out.println(myInt);
    // }


    public char[][] placeMarker(int x, int y, char marker){
        
        // Scanner scam = new Scanner(System.in);
        // we still want this logic about if the spot is taken
        // boolean isTaken = (int)bd[rowInp][columnInp] != 0;
        // while(isTaken){
        //     System.out.println("Please type in a valid Input this marker is already taken");
        //     System.out.print("What row do you want to put your Marker in? ");
        //     rowInp = scam.nextInt();
        //     System.out.print("What column do you want to put your Marker in? ");
        //     columnInp = scam.nextInt();
        //     if((int)bd[rowInp][columnInp] == 0){
        //         isTaken = false;
        //     }
        // }
        board[y][x] = marker;
        return board; 
        // send updated board to main function
    }

    public void print() {
        for(int i=0; i < 3; i +=1){ // gives us bd[0], bd[1], bd[2]
            for (int j = 0; j < 3; j += 1) {
                if((int)board[i][j] == 0){
                     System.out.print( "- ");
                }else{
                    System.out.print(board[i][j] + " ");
                }
                
            }
            System.out.println();
        }
    }

    public static boolean winConditions(char[][] bd){
        char[][] possibleWins = {           // 2-dimensional array. 8 possibilities with 3 markers each
            {bd[0][0], bd[0][1], bd[0][2]}, // 1st possibility. 3 markers. {'X', 'X', 'X'}
            {bd[1][0], bd[1][1], bd[1][2]},
            {bd[2][0], bd[2][1], bd[2][2]},
            {bd[0][0], bd[1][0], bd[2][0]},
            {bd[0][1], bd[1][1], bd[2][1]},
            {bd[0][2], bd[1][2], bd[2][2]},
            {bd[0][0], bd[1][1], bd[2][2]},
            {bd[0][2], bd[1][1], bd[2][0]},
        };
        for (int i = 0; i < possibleWins.length; i += 1) {
            char[] possibleWin = possibleWins[i];
            if((possibleWin[0] == possibleWin[1]) && (possibleWin[1] == possibleWin[2])){
                if(possibleWin[0] == 'X'){
                    System.out.println("X wins!");
                    return true;
                }
                else if(possibleWin[0] == 'O'){
                    System.out.println("O wins!");
                    return true;
                }
            }
            
        }
        return false;
    }
    
}