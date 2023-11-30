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
            view.displayBoard(model.getM_board());
            int row, col;

            do {
                System.out.println("Player " + model.getCurrentPlayer() + ", enter your move (row and column) numbers from 1 to 3 separated by a space: ");
                row = scanner.nextInt()-1;
                col = scanner.nextInt()-1;
                if(!isValidMove(row, col)){
                    System.out.println("Ilegal move, Try again!");
                }
            } while (!isValidMove(row, col));

            model.makeMove(row, col);

            if (isGameFinished()!=-1) {
                view.displayBoard(model.getM_board());
                view.displayMessage(getGameResult());
                break;
            }

            model.switchPlayer();
        } while (isGameFinished()==-1);

        scanner.close();
    }
    protected boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && model.getM_board()[row][col] == ' ');
    }
    protected int isGameFinished() {// 1: win, 0: draw, -1: not finished
        char[][] board = model.getM_board();

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
    private String getGameResult() {
        int result = isGameFinished();

        if (result == 1) {
            return "Player " + model.getCurrentPlayer() + " wins!";
        } else if (result == 0) {
            return "It's a draw!";
        } else {
            return "Game still ongoing...";
        }

    }
}
