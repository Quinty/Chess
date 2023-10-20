package ru.quinty.chess.board;
import ru.quinty.chess.board.pieces.BlackFactory;
import ru.quinty.chess.board.pieces.Factory;
import ru.quinty.chess.board.pieces.WhiteFactory;

public class PieceSetter {
    Factory blackFactory;
    Factory whiteFactory;
    Board board;

    public PieceSetter(Board board) {
        this.board = board;
        blackFactory = new BlackFactory();
        whiteFactory = new WhiteFactory();
    }

    void setPieces() {
        setBishops();
        setKings();
        setKnights();
        setPawns();
        setQueens();
        setRook();
        System.out.println("Фигуры установлены");
    }

    private void setBishops() {
        board.setPieceOnCoordinate(whiteFactory.createBishop(), 0, 2);
        board.setPieceOnCoordinate(whiteFactory.createBishop(), 0, 5);

        board.setPieceOnCoordinate(blackFactory.createBishop(), 7, 2);
        board.setPieceOnCoordinate(blackFactory.createBishop(), 7, 5);

    }

    private void setKings() {
        board.setPieceOnCoordinate(whiteFactory.createKing(), 0, 4);

        board.setPieceOnCoordinate(blackFactory.createKing(), 7, 4);

    }

    private void setKnights() {
        board.setPieceOnCoordinate(whiteFactory.createKhight(), 0, 1);
        board.setPieceOnCoordinate(whiteFactory.createKhight(), 0, 6);

        board.setPieceOnCoordinate(blackFactory.createKhight(), 7, 1);
        board.setPieceOnCoordinate(blackFactory.createKhight(), 7, 6);

    }

    private void setPawns() {
        for (int column = 0; column < board.getColumnCount(); column++) {
            board.setPieceOnCoordinate(whiteFactory.createPawn(), 1, column);

            board.setPieceOnCoordinate(blackFactory.createPawn(), 6, column);
        }

    }

    private void setQueens() {
        board.setPieceOnCoordinate(whiteFactory.createQueen(), 0, 3);

        board.setPieceOnCoordinate(blackFactory.createQueen(), 7, 3);

    }

    private void setRook() {
        board.setPieceOnCoordinate(whiteFactory.createRook(), 0, 0);
        board.setPieceOnCoordinate(whiteFactory.createRook(), 0, 7);

        board.setPieceOnCoordinate(blackFactory.createRook(), 7, 0);
        board.setPieceOnCoordinate(blackFactory.createRook(), 7, 7);
    }
}
