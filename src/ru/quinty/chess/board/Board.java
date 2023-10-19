package ru.quinty.chess.board;

import ru.quinty.chess.board.pieces.Piece;

public class Board {

    private final int linesCount = 8;
    private final int rowsCount = 8;
    private static Board board;
    private Square[] squares = new Square[64];

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

    private int getCellPosition(Coordinate coordinate) {
        int line = coordinate.getLine();
        int row = coordinate.getRow();
        return ((line * rowsCount) + row);
    }

    public int getLinesCount() {
        return linesCount;
    }

    public int getRowsCount() {
        return rowsCount;
    }


    public void addCell(Coordinate coordinate) {
        for (int i = 0; i < squares.length; i++) {
            if (squares[i] == null) {
                squares[i] = new Square(coordinate);
                break;
            }
        }
    }

    public Square getCell(Coordinate coordinate) {
        return squares[getCellPosition(coordinate)];
    }
    void setPiece(Piece piece, Coordinate coordinate) {
        board.getCell(coordinate).setPiece(piece);
    }


}
