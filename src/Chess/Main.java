package Chess;

import Chess.board.Board;
import Chess.console.ConsoleRenderer;

public class Main {
    public static void main(String[] args) {
        Board board = Board.getInstance();
        ConsoleRenderer renderer = ConsoleRenderer.getInstance();
        renderer.renderBoard(board);
    }
}