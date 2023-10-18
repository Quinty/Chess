package Chess.board;

import Chess.Color;
import Chess.pieces.*;

public class PieceSetter {
    PieceFactory whiteFactory = new WhitePieceFactory();
    PieceFactory blackFactory = new BlackPieceFactory();
    Board board;

    public PieceSetter(Board board) {
        this.board = board;
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

    private void setBishops(){
        //WHITE
        whiteFactory.createBishop();
        board.setPiece(whiteFactory.createBishop(), new Coordinate(0, 2));
        board.setPiece(whiteFactory.createBishop(), new Coordinate(0, 5));
        //BLACK
        board.setPiece(blackFactory.createBishop(), new Coordinate(7, 2));
        board.setPiece(blackFactory.createBishop(), new Coordinate(7, 5));

    }
    private void setKings(){
        //WHITE
        board.setPiece(whiteFactory.createKing(), new Coordinate(0, 4));
        //BLACK
        board.setPiece(blackFactory.createKing(), new Coordinate(7, 4));

    }
    private void setKnights(){
        //WHITE
        board.setPiece(whiteFactory.createKhight(), new Coordinate(0, 1));
        board.setPiece(whiteFactory.createKhight(), new Coordinate(0, 6));
        //BLACK
        board.setPiece(blackFactory.createKhight(), new Coordinate(7, 1));
        board.setPiece(blackFactory.createKhight(), new Coordinate(7, 6));

    }
    private void setPawns(){
        for (int row = 0; row < board.getRowsCount(); row++) {
            //WHITE
            board.setPiece(whiteFactory.createPawn(), new Coordinate(1, row));
            //BLACK
            board.setPiece(blackFactory.createPawn(), new Coordinate(6, row));
        }

    }
    private void setQueens(){
        //WHITE
        board.setPiece(whiteFactory.createQueen(), new Coordinate(0, 3));
        //BLACK
        board.setPiece(blackFactory.createQueen(), new Coordinate(7, 3));

    }
    private void setRook(){
        //WHITE
        board.setPiece(whiteFactory.createRook(), new Coordinate(0, 0));
        board.setPiece(whiteFactory.createRook(), new Coordinate(0, 7));
        //BLACK
        board.setPiece(blackFactory.createRook(), new Coordinate(7, 0));
        board.setPiece(blackFactory.createRook(), new Coordinate(7, 7));
    }
}
