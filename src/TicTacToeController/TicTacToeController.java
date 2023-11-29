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
    private int isGameFinished() {// 1: win, 0: draw, -1:not finished

        return 0;
    }
}
