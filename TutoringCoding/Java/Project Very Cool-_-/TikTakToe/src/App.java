
public class App {
    //human is 1.0
    //computer is 2
    public static void main(String[] args) throws Exception {
        
        System.out.println("\nThis game makes me go yes\n");
        TikTakToe game = new TikTakToe();
        game.printBoard();//Just give me my money
        System.out.println("U go first :)");
        game.playerTurn();
       
        
    }
}
