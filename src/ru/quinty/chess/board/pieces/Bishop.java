package ru.quinty.chess.board.pieces;

import ru.quinty.chess.Color;
import ru.quinty.chess.PieceType;

//Слон
public class Bishop extends LongRange {

    public Bishop(Color color) {
        super(color);
        pieceType = PieceType.BISHOP;
    }
}
