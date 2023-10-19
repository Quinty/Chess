package ru.quinty.chess.board.pieces;

import ru.quinty.chess.Color;

public abstract class PieceFactory {
    Color color;

    public Piece createBishop() {
        return new Bishop(color);
    }

    public Piece createKing() {
        return new King(color);
    }

    public Piece createKhight() {
        return new Knight(color);
    }

    public Piece createPawn() {
        return new Pawn(color);
    }

    public Piece createQueen() {
        return new Queen(color);
    }

    public Piece createRook() {
        return new Rook(color);
    }
}
