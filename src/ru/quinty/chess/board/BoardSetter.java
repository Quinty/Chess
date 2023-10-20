package ru.quinty.chess.board;

public class BoardSetter {
    Board board;

    public BoardSetter(Board board) {
        this.board = board;
    }

    public void setBoard() {
        for (int rank = board.getRankCount() - 1; rank >= 0; rank--) {
            for (int column = board.getColumnCount() - 1; column >= 0; column--) {
                board.setSquare(rank, column);
            }
        }
        System.out.println("Клетки установлены");
    }
}
