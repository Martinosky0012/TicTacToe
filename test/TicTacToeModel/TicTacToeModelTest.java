package TicTacToeModel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeModelTest {
    TicTacToeModel model= new TicTacToeModel();
    final int rows=3;
    final int cols=3;

    private final char[][] board= new char[rows][cols];


    @Test
    void TestBoardSize() {

        assertEquals( 3,model.getBoard().length);
        assertEquals(3,model.getBoard()[1].length);
    }

    @Test
    void initializeBoardTest() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                assertEquals(' ', model.getBoard()[i][j]);
            }
        }

    }
    @Test
    void getCurrentPlayer() {
    }

    @Test
    void switchPlayer() {
    }

    @Test
    void makeMove() {
    }
}