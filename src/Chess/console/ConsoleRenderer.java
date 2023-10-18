package Chess.console;

import Chess.board.Board;
import Chess.board.Cell;
import Chess.Color;
import Chess.board.Coordinate;
import Chess.pieces.Piece;

public class ConsoleRenderer {
    private static ConsoleRenderer consoleRenderer;

    private ConsoleRenderer() {
    }


    public static ConsoleRenderer getInstance() {
        if (consoleRenderer == null) {
            consoleRenderer = new ConsoleRenderer();
        }
        return consoleRenderer;
    }

    public void renderBoard(Board board) {
        for (int line = board.getLinesCount() - 1; line >= 0; line--) {
            for (int row = 0; row < board.getRowsCount(); row++) {
                Coordinate coordinate = new Coordinate(line, row);
                System.out.print(getColorString(board, coordinate));
            }
            System.out.println(ConsoleColor.ANSI_RESET.getColor());
        }
    }

    private String getColorString(Board board, Coordinate coordinate) {
        Cell cell = board.getCell(coordinate);
        return getCellRenderString(cell) + getPieceRenderString(cell);
    }

    private String getCellRenderString(Cell cell) {
        Color color = cell.getColor();
        if (color == Color.WHITE) {
            return ConsoleColor.ANSI_WHITE_SQUARE_BACKGROUND.getColor();
        } else {
            return ConsoleColor.ANSI_BLACK_SQUARE_BACKGROUND.getColor();
        }
    }

    private String getPieceRenderString(Cell cell) {
        Piece piece = cell.getPiece();
        if (piece == null) {
            return ConsoleIcon.EMPTY.getIcon();
        } else {
            return getPieceColorString(piece) + getPieceIconString(piece);
        }
    }

    private String getPieceColorString(Piece piece) {
        Color color = piece.getColor();
        if (color == Color.WHITE) {
            return ConsoleColor.ANSI_WHITE_PIECE_COLOR.getColor();
        } else {
            return ConsoleColor.ANSI_BLACK_PIECE_COLOR.getColor();
        }

    }

    private String getPieceIconString(Piece piece) {
        return switch (piece.getClass().getSimpleName()) {
            case "Bishop" -> ConsoleIcon.BISHOP.getIcon();
            case "King" -> ConsoleIcon.KING.getIcon();
            case "Knight" -> ConsoleIcon.KNIGHT.getIcon();
            case "Pawn" -> ConsoleIcon.PAWN.getIcon();
            case "Queen" -> ConsoleIcon.QUEEN.getIcon();
            case "Rook" -> ConsoleIcon.ROOK.getIcon();
            default -> ConsoleIcon.EMPTY.getIcon();
        };
    }
}
