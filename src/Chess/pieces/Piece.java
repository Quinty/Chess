package Chess.pieces;

import Chess.Color;

public abstract class Piece {

    Color color;

    public Color getColor() {
        return color;
    }

    public Piece(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "color=" + color +
                '}';
    }
}
