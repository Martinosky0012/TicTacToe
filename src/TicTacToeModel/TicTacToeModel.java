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
    public char getCurrentPlayer() {
        return currentPlayer;
    }
    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    public void makeMove(int row, int col) {
        if (board[row][col] == ' ') {
            board[row][col] = currentPlayer;

        }

    }
}

