package ru.quinty.chess.board.pieces;

import ru.quinty.chess.Color;
import ru.quinty.chess.PieceType;

//башня
public class Rook extends LongRange {
    public Rook(Color color) {
        super(color);
        pieceType = PieceType.ROOK;
    }
}
