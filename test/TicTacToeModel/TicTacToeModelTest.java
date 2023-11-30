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
    void correctPlayerName() {
        boolean correctName= (model.getCurrentPlayer()=='X' || model.getCurrentPlayer()=='O');
       assertTrue(correctName);
    }

    @Test
    void switchPlayer() {
        char player=model.getCurrentPlayer();
        correctPlayerName();
        model.switchPlayer();
        assertNotEquals(player,model.getCurrentPlayer());
        correctPlayerName();
    }

    @Test
    void makeMove() {
        char iniPlayer=model.getCurrentPlayer();
        model.makeMove(2,2);
        assertEquals(iniPlayer,model.getBoard()[2][2]);
    }

    @Test
    void getBoard() {
    }
}