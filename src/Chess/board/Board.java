package Chess.board;

import Chess.pieces.Piece;

public class Board {

    private final int linesCount = 8;
    private final int rowsCount = 8;
    private static Board board;
    private Cell[] cells = new Cell[64];

    private Board() {
    }

    public static Board getInstance() {
        if (board == null) {
            board = new Board();
            board.setupDefault();
        }
        return board;
    }

    private int getCellPosition(Coordinate coordinate) {
        int line = coordinate.getLine();
        int row = coordinate.getRow();
        return (((linesCount - line - 1) * (rowsCount -1)) + row);
    }

    public int getLinesCount() {
        return linesCount;
    }

    public int getRowsCount() {
        return rowsCount;
    }

    private void setupDefault() {
        board.setCells();
        board.setPieces();
    }

    private void setCells() {
        for (int line = linesCount - 1; line >= 0; line--) {
            for (int row = rowsCount - 1; row >= 0; row--) {
                Coordinate coordinate = new Coordinate(line, row);
                cells[getCellPosition(coordinate)] = new Cell(coordinate);
            }
        }
        System.out.println("Клетки установлены");
    }

    private void setPiece(Piece piece, Coordinate coordinate){

    }
    private void setPieces() {
        System.out.println("Фигуры установлены");
    }

    public Cell getCell(Coordinate coordinate) {
        return cells[getCellPosition(coordinate)];
    }
}
