package TicTacToeModel;

public class TicTacToeModel {
    private char[][] board;
    private char currentPlayer;
    public TicTacToeModel() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public char[][] getBoard() {
        return board;
    }
}

