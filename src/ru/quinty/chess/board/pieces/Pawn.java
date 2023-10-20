package ru.quinty.chess.board.pieces;

import ru.quinty.chess.Color;
import ru.quinty.chess.PieceType;

//пешка
public class Pawn extends Piece{
    public Pawn(Color color) {
        super(color);
        pieceType = PieceType.PAWN;
    }
}
