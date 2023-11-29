package TicTacToeView;

public class TicTacToeView {

    public void displayBoard(char[][] board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
