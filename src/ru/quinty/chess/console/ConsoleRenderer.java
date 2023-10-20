package ru.quinty.chess.console;

import ru.quinty.chess.Color;
import ru.quinty.chess.board.Board;
import ru.quinty.chess.board.Square;
import ru.quinty.chess.board.pieces.Piece;

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
        printColumnLetters();
        for (int rank = board.getRankCount() - 1; rank >= 0; rank--) {
            System.out.print(' ' + Integer.toString(rank + 1) + ' ');
            for (int column = 0; column < board.getColumnCount(); column++) {
                System.out.print(getSquareString(board, rank, column));
            }
            System.out.print(ConsoleColor.ANSI_RESET.getColor());
            System.out.println(' ' + Integer.toString(rank + 1)  + ' ');
        }
        printColumnLetters();
    }
    
    private void printColumnLetters(){
        System.out.println("    A  B  C  D  F  E  G  H ");
    }

    private String getSquareString(Board board, int rank, int column) {
        Square square = board.getSquare(rank, column);
        return getBackgroundRenderString(square) + getPieceRenderString(square);
    }

    private String getBackgroundRenderString(Square square) {
        Color color = square.getColor();
        if (color == Color.WHITE) {
            return ConsoleColor.ANSI_WHITE_SQUARE_BACKGROUND.getColor();
        } else {
            return ConsoleColor.ANSI_BLACK_SQUARE_BACKGROUND.getColor();
        }
    }

    private String getPieceRenderString(Square square) {
        Piece piece = square.getPiece();
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
        return switch (piece.getType()) {
            case BISHOP -> ConsoleIcon.BISHOP.getIcon();
            case KING -> ConsoleIcon.KING.getIcon();
            case KNIGHT -> ConsoleIcon.KNIGHT.getIcon();
            case PAWN -> ConsoleIcon.PAWN.getIcon();
            case QUEEN -> ConsoleIcon.QUEEN.getIcon();
            case ROOK -> ConsoleIcon.ROOK.getIcon();
            default -> ConsoleIcon.EMPTY.getIcon();
        };
    }
}
