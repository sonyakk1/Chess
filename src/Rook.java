public class Rook extends ChessPiece {

    public Rook(String color) {
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

        if (line == toLine || column == toColumn) {
            return true;
        }

        return false;
    }
    @Override
    public String getSymbol() {
        return "R";
    }
}
