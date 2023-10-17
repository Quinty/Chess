package Chess.console;

public enum ConsoleIcon {
    BISHOP(" ♝ "),
    KING(" ♚ "),
    KNIGHT(" ♞ "),
    PAWN(" ♟ "),
    QUEEN(" ♛ "),
    ROOK(" ♜ "),
    EMPTY("   ");
    private String icon;

    ConsoleIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
