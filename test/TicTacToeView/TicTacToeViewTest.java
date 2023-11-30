package TicTacToeView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.io.OutputStream;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.*;

class TicTacToeViewTest {
    private final TicTacToeView view = new TicTacToeView();
    private ByteArrayOutputStream printed;
    @Test
    public void testDisplayBoard() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        //  Set up the board state
        TicTacToeView game = new TicTacToeView();
        char[][] testBoard = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {' ', 'X', ' '}
        };
        game.displayBoard(testBoard);

        // Expected output based on the test board state
        String expectedOutput = "X O X " + System.lineSeparator() +
                                "O X O " + System.lineSeparator() +
                                "  X   " + System.lineSeparator();

        // capture output and compare it with the expected output
        String actualOutput = outputStreamCaptor.toString();
        assertEquals(expectedOutput, actualOutput);

    }


    @Test
    void displayMessage() {
    }
}