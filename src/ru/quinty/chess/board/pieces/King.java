package ru.quinty.chess.board.pieces;

import ru.quinty.chess.Color;
import ru.quinty.chess.PieceType;

public class King extends Piece{
    public King(Color color) {
        super(color);
        pieceType = PieceType.KING;
    }
}
