package ru.quinty.chess.console;

public enum ConsoleColor {
    ANSI_RESET("\u001B[0m"),
    ANSI_WHITE_PIECE_COLOR("\u001B[97m"),
    ANSI_BLACK_PIECE_COLOR("\u001B[30m"),
    ANSI_WHITE_SQUARE_BACKGROUND("\u001B[47m"),
    ANSI_BLACK_SQUARE_BACKGROUND("\u001B[0;100m"),
    ANSI_HIGHLIGHTED_SQUARE_BACKGROUND("\u001B[45m");

    private String color;

    ConsoleColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
