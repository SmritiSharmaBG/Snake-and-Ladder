package Components;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    int size;
    Cell[][] board;

    public Board(int size, int snakeCount, int ladderCount) {
        this.size = size;
        initializeBoard(this.size);
        addSnake(snakeCount);
        addLadder(ladderCount);
    }

    private void addSnake(int snakeCount) {
        int snake = 0;
        while(snake != snakeCount) {
            int snakeStart = ThreadLocalRandom.current().nextInt(1, 101);
            int snakeEnd = ThreadLocalRandom.current().nextInt(1, 101);
            // for snake, start > end
            if (snakeStart <= snakeEnd) continue;
            Jump newSnake = new Jump(snakeStart, snakeEnd);
            addJump(newSnake);
            snake ++;
        }
    }

    private void addLadder(int ladderCount) {
        int ladder = 0;
        while(ladder != ladderCount) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, 101);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, 101);
            // for ladder, start < end
            if (ladderStart >= ladderEnd) continue;
            Jump newLadder = new Jump(ladderStart, ladderEnd);
            addJump(newLadder);
            ladder ++;
        }
    }

    private void addJump(Jump jump) {
        int num = jump.start - 1;
        int row = num / size;
        int col = num % size;
        board[row][col] = new Cell(jump);
    }

    private void initializeBoard(int size) {
        board = new Cell[size][size];

        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                board[i][j] = new Cell(null); // by default, there will be no jumps
            }
        }

    }
}
