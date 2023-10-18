package Chess.board;

public class BoardSetter {
    Board board;

    public BoardSetter(Board board) {
        this.board = board;
    }

    public void setBoard() {
        setCells();
    }

    private void setCells() {
        for (int line = board.getLinesCount() - 1; line >= 0; line--) {
            for (int row = board.getRowsCount() - 1; row >= 0; row--) {
                board.addCell(new Coordinate(line, row));
            }
        }
        System.out.println("Клетки установлены");
    }
}
