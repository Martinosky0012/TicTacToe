import TicTacToeController.*;
import TicTacToeModel.*;
import TicTacToeView.*;

public class Main {
    public static void main(String[] args) {
        TicTacToeModel model = new TicTacToeModel();
        TicTacToeView view = new TicTacToeView();
        TicTacToeController controller = new TicTacToeController(model, view);

        controller.playGame();
    }



}