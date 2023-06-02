package Components;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    List<Player> playerList = new ArrayList<>();
    Board board;
    Dice dice;
    private Queue<Player> playerTurn = new LinkedList<>();
    Player winner = null;

    public Game(Dice dice, Board board) {
        this.dice = dice;
        this.board = board;
    }

    public void startGame() {
        while (winner == null) {
            Player player = playerTurn.remove();
            System.out.println(player.playerID + "'s turn now. Current Position is : " + player.currentPosition);
            int roll = dice.rollDice();
            System.out.println("The dice is rolled. Obtained number : " + roll);
            int newPosition = player.currentPosition + roll;

            if (newPosition > 100) {
                System.out.println("THE WINNER IS : " + player.playerID);
                System.out.println("G A M E   O V E R");
                return;
            }

            int jump = processSnakeLadder(newPosition);
            player.currentPosition = jump;
            System.out.println(player.playerID + "'s new position is : " + player.currentPosition);
            playerTurn.add(player);
        }
    }

    private int processSnakeLadder(int newPosition) {
        int num = newPosition - 1;
        int row = num / board.size;
        int col = num % board.size;
        Cell cell = board.board[row][col];
        if (cell.jump == null) return newPosition; // There was no Snake or Ladder. Hence no jump
        int jump = cell.jump.end;
        System.out.println(newPosition < jump ? "LADDER!!" : "SNAKE...");
        return jump;
    }

    public void addPlayer(Player p) {
        playerList.add(p);
        playerTurn.add(p);
    }
}
