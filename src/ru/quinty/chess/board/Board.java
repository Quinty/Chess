package ru.quinty.chess.board;

import ru.quinty.chess.board.pieces.Piece;

public class Board {

    private final int rankCount = 8;
    private final int columnCount = 8;
    private static Board board;
    private Square[][] squares = new Square[rankCount][columnCount];

    private Board() {
    }

    public static Board getInstance() {
        if (board == null) {
            board = new Board();
            new BoardSetter(board).setBoard();
            new PieceSetter(board).setPieces();
        }
        return board;
    }

    public int getRankCount() {
        return rankCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public Square getSquare(int rank, int column) {
        return squares[rank][column];
    }

    public void setSquare(int rank, int column) {
        squares[rank][column] = new Square(rank, column);
    }

    void setPieceOnCoordinate(Piece piece, int rank, int column) {
        getSquare(rank, column).setPiece(piece);
    }


}
