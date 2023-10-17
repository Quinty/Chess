package Chess.board;

import Chess.pieces.Piece;
import Chess.Color;

public class Cell {
    private final Color color;
    private final Coordinate coordinate;
    private Piece piece;

    @Override
    public String toString() {
        return "Cell{" +
                "Цвет:" + color +
                "Координаты:" + coordinate +
                "Фигура:" + piece +
                '}';
    }

    public Cell(Coordinate coordinate) {
        this.coordinate = coordinate;
        this.color = Cell.defineColor(coordinate);
    }

    private static Color defineColor(Coordinate coordinate) {
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
}
