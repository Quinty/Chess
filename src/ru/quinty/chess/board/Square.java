package ru.quinty.chess.board;

import ru.quinty.chess.Color;
import ru.quinty.chess.board.pieces.Piece;

public class Square {
    private final Color color;
    private final Coordinate coordinate;

    private Piece piece;

    @Override
    public String toString() {
        return "Cell{" +
                " Цвет: " + color +
                " Координаты: " + coordinate +
                " Фигура: " + piece +
                '}';
    }

    public Square(Coordinate coordinate) {
        this.coordinate = coordinate;
        this.color = this.defineColor(coordinate);
    }

    private Color defineColor(Coordinate coordinate) {
        if ((coordinate.getLine() + coordinate.getRow() )% 2 == 0){
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
