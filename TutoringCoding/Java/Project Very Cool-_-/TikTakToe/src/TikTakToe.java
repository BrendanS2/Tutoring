import java.util.Scanner;
public class TikTakToe {

    int[][] board;// 2d array to represent the board
    Scanner input = new Scanner(System.in);

     public TikTakToe(){
        board = new int[3][3];// 2d array to represent the board
        ;
     }

     public void playerTurn(){
      boolean valid = false;
      while(!valid){

          System.out.print("Please -_- _----____------______-----___- enter the row u want to mark >");
          int row = input.nextInt();
         System.out.println("");
          System.out.print("Please -_- _----____------______-----___-____--__-__-------___:) enter the column u want to mark >");
          int column = input.nextInt();
          valid = mark(row-1, column-1, 1);
          if(!valid){
          System.err.println("U little stop typing random words u little lasmjdflksjdjgfsdklfhihm.dsjhfhjjjkjksdnkfnmdskjsdjnkhsdhjskjjksjdskjdskidfof!!!!!!!!!@!!!!!!!!!!!!!~!!@!$#@$#@$!@#$#!$#@$#!$@#$@#!");
          }
      }
      printBoard();
     }

     public boolean mark(int row, int column, int player){
      if(row < 3 && column < 3) {

      
         board[row][column] = player;
         return true;
     }
   
     return false;
   }

     public void printBoard(){
         for(int i = 0; i < board.length; i +=1){
               for(int j = 0; j < board[i].length; j+=1){
                  System.out.print(board[i][j] + " ");
                  
               }
               System.out.println("");
         }
     }
}
