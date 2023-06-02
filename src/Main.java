import Components.Board;
import Components.Dice;
import Components.Game;
import Components.Player;

public class Main {
    public static void main(String[] args) {
        // I need players, Dice and Board to start game

        // Make a dice
        Dice dice = new Dice();

        // Make a board. Specify number of snakes and ladders
        Board board = new Board(10, 5, 4);

        // Making and adding players
        Player p1 = new Player("Smriti", 0);
        Player p2 = new Player("Renu", 0);

        // Making Game
        Game game = new Game(dice, board);
        game.addPlayer(p1);
        game.addPlayer(p2);

        game.startGame();

    }
}
