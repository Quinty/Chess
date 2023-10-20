package ru.quinty.chess.board.pieces;

import ru.quinty.chess.Color;
import ru.quinty.chess.PieceType;

public class Queen extends LongRange {
    public Queen(Color color) {
        super(color);
        pieceType = PieceType.QUEEN;
    }
}
