package TicTacToeView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.io.OutputStream;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeViewTest {
    private final TicTacToeView view = new TicTacToeView();
    private ByteArrayOutputStream printed;
    @Test
    public void testDisplayEmptyBoard() {
        char[][] emptyBoard = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };


    }


    @Test
    void displayBoard() {
    }

    @Test
    void displayMessage() {
    }
}