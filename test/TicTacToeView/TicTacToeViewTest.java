package TicTacToeView;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeViewTest {
    private final TicTacToeView ticTacToeView = new TicTacToeView();
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @Test
    public void testDisplayEmptyBoard() {
        char[][] emptyBoard = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        String expectedOutput = "  |  |  \n" +
                "---------\n" +
                "  |  |  \n" +
                "---------\n" +
                "  |  |  \n";
        captureOutput();
        ticTacToeView.displayBoard(emptyBoard);
        assertEquals(expectedOutput, getCapturedOutput());
    }


    @Test
    void displayBoard() {
    }

    @Test
    void displayMessage() {
    }
    private void captureOutput() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    // Helper method to get captured output
    private String getCapturedOutput() {
        return outputStreamCaptor.toString().replaceAll("\r", "");
    }
}