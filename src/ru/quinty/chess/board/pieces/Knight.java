package ru.quinty.chess.board.pieces;

import ru.quinty.chess.Color;
import ru.quinty.chess.PieceType;

//конь
public class Knight extends Piece{
    public Knight(Color color) {
        super(color);
        pieceType = PieceType.KNIGHT;
    }
}
