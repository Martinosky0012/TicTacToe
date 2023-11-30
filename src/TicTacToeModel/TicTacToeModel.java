package TicTacToeModel;

public class TicTacToeModel {
    private char[][] m_board;
    private char currentPlayer;
    public TicTacToeModel() {
        m_board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }
    public TicTacToeModel(char[][] b){
        m_board=b;
    }
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m_board[i][j] = ' ';
            }
        }
    }
    public char[][] getM_board() {
        return m_board;
    }
    public char getCurrentPlayer() {
        return currentPlayer;
    }
    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    public void makeMove(int row, int col) {
        if (m_board[row][col] == ' ') {
            m_board[row][col] = currentPlayer;

        }

    }
}

