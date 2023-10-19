package ru.quinty.chess;

import ru.quinty.chess.board.Board;
import ru.quinty.chess.console.ConsoleRenderer;

public class Main {
    public static void main(String[] args) {
        Board board = Board.getInstance();
        ConsoleRenderer renderer = ConsoleRenderer.getInstance();
        renderer.renderBoard(board);
    }
}