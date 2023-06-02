package Components;

/**
 * Each player has a name and its current position.
 * At the start of game, player is out of board, i.e 0
 */
public class Player {
    String playerID;
    int currentPosition;

    public Player(String playerID, int currentPosition) {
        this.playerID = playerID;
        this.currentPosition = currentPosition;
    }
}
