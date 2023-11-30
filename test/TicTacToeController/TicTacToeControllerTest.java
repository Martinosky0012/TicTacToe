package TicTacToeController;

import TicTacToeModel.TicTacToeModel;
import TicTacToeView.TicTacToeView;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeControllerTest {
    TicTacToeView view= new TicTacToeView();
    TicTacToeModel model= new TicTacToeModel();

    TicTacToeController controller=new TicTacToeController(model,view);
@Test
    public void isValidMove(){
    //rows out of bounds
    assertFalse(controller.isValidMove(3,2));
    assertFalse(controller.isValidMove(-1,2));
    //columns out of bounds
    assertFalse(controller.isValidMove(1,-1));
    assertFalse(controller.isValidMove(2,3));
    //Correct move
    assertTrue(controller.isValidMove(1,2));

}
}