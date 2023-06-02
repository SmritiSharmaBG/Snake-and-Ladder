package Components;

/**
 * A small block of board is called cell.
 * It may have a snake or ladder (ie a jump).
 * It may not have any thing
 */
public class Cell {
    Jump jump;

    Cell(Jump jump) {
        this.jump = jump;
    }
}
