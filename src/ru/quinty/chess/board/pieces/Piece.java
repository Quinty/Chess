package ru.quinty.chess.board.pieces;

import ru.quinty.chess.Color;

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
