public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }
        if (line == toLine && column == toColumn) {
            return false;
        }
        int direction = color.equals("White") ? 1 : -1;
        if (toLine == line + direction && column == toColumn) {
            return true;
        }
        if ((color.equals("White") && line == 1 && toLine == line + 2 && column == toColumn) ||
                (color.equals("Black") && line == 6 && toLine == line - 2 && column == toColumn)) {
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}