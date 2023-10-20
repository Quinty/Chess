package ru.quinty.chess.board.pieces;

import ru.quinty.chess.Color;
import ru.quinty.chess.PieceType;

public abstract class Piece {

    Color color;

    PieceType pieceType;

    public Piece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public PieceType getType() {
        return pieceType;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "color=" + color +
                '}';
    }
}
