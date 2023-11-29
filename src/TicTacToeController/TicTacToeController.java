package TicTacToeController;
import TicTacToeModel.TicTacToeModel;
import TicTacToeView.TicTacToeView;

import java.util.Scanner;

public class TicTacToeController {
    private TicTacToeModel model;
    private TicTacToeView view;

    public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
        this.model = model;
        this.view = view;
    }
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        //Game loop
        do {
            view.displayBoard(model.getBoard());
            int row, col;

        } while (isGameFinished()==-1);
    }
    private boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && model.getBoard()[row][col] == ' ');
    }
    private int isGameFinished() {// 1: win, 0: draw, -1: not finished
        char[][] board = model.getBoard();

        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return 1; // Player won
            }
            // Check columns
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return 1; // Player won
            }
        }
        // Check diagonals
        if ((board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
            return 1; // Player won
        }

        // Check for a draw
        boolean isDraw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    // If any empty cell is found, the game isn't finished yet
                    isDraw = false;
                    break;
                }
            }
            if (!isDraw) {
                break;
            }
        }

        if (isDraw) {
            return 0; // Game ended in a draw
        }

        return -1; // Game still ongoing
    }
}
