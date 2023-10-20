package ru.quinty.chess.board;

import ru.quinty.chess.Color;
import ru.quinty.chess.board.pieces.Piece;

public class Square {
    private final Color color;
    private final int rank;//горизонт
    private final int column;//вертикаль

    private Piece piece;

    @Override
    public String toString() {
        return "Cell{" +
                " Цвет: " + color +
                " Фигура: " + piece +
                '}';
    }

    public Square(int rank, int column) {
        this.rank = rank;
        this.column = column;
        this.color = this.defineColor(rank, column);
    }

    private Color defineColor(int rank, int column) {
        if ((rank + column) % 2 == 0) {
            return Color.BLACK;
        } else {
            return Color.WHITE;
        }

    }

    public Piece getPiece() {
        return piece;
    }

    public Color getColor() {
        return color;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
