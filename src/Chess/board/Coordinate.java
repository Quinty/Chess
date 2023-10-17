package Chess.board;

public class Coordinate {
    private final int line;
    private final int row;

    public Coordinate(int line, int row) {
        this.line = line;
        this.row = row;
    }

    public int getLine() {
        return line;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "Строка:" + line +
                "Столбец:" + row +
                '}';
    }
}
