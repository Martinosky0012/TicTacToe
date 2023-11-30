package TicTacToeController;

import TicTacToeModel.TicTacToeModel;
import TicTacToeView.TicTacToeView;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
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
    @Test
    void TestWinXHorizontal() {
        char[][] b={{'X','X','X'},
                    {' ',' ',' '},
                    {' ',' ',' '}};
        TicTacToeModel model1=new TicTacToeModel(b);
        TicTacToeView view1=new TicTacToeView();
        TicTacToeController controller1=new TicTacToeController(model1,view1);
        assertEquals(1,controller1.isGameFinished());
    }
    @Test
    void TestWinXVertical() {
        char[][] b={{' ',' ','X'},
                    {' ','O','X'},
                    {' ',' ','X'}};
        TicTacToeModel model1=new TicTacToeModel(b);
        TicTacToeView view1=new TicTacToeView();
        TicTacToeController controller1=new TicTacToeController(model1,view1);
        assertEquals(1,controller1.isGameFinished());
    }

@Test
    void TestWinXDiagonal() {
        char[][] b={{' ',' ','X'},
                    {' ','X',' '},
                    {'X',' ',' '}};
        TicTacToeModel model1=new TicTacToeModel(b);
        TicTacToeView view1=new TicTacToeView();
        TicTacToeController controller1=new TicTacToeController(model1,view1);
        assertEquals(1,controller1.isGameFinished());

    char[][] b2={{'X','X','O'},
                {' ','O',' '},
                {'O',' ','X'}};
     model1=new TicTacToeModel(b2);
     view1=new TicTacToeView();
     controller1=new TicTacToeController(model1,view1);
    assertEquals(1,controller1.isGameFinished());

    }
    @Test
    void testDraw(){
        char[][] b={{'X','O','X'},
                    {'O','O','X'},
                    {'X','X','O'}};
        TicTacToeModel model1=new TicTacToeModel(b);
        TicTacToeView view1=new TicTacToeView();
        TicTacToeController controller1=new TicTacToeController(model1,view1);
        assertEquals(0,controller1.isGameFinished());
    }
    @Test
    void TestNotFinished(){
        char[][] b={{'X','O','X'},
                    {'O',' ','X'},
                    {'X','X','O'}};
        TicTacToeModel model1=new TicTacToeModel(b);
        TicTacToeView view1=new TicTacToeView();
        TicTacToeController controller1=new TicTacToeController(model1,view1);
        assertEquals(-1,controller1.isGameFinished());
    }

}
