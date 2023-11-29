package TicTacToeController;
import TicTacToeModel.TicTacToeModel;
import TicTacToeView.TicTacToeView;

public class TicTacToeController {
    private TicTacToeModel model;
    private TicTacToeView view;

    public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
        this.model = model;
        this.view = view;
    }
    public void playGame() {

    }
    private boolean isValidMove(int row, int col) {

        return false;
    }
    private int isGameFinished() {
        return 0;
    }
}
