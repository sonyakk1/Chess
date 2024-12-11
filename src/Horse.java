public class Horse extends ChessPiece {
    public Horse(String color) {
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


        int rowDifference = Math.abs(toLine - line);
        int colDifference = Math.abs(toColumn - column);

        return (rowDifference == 2 && colDifference == 1) || (rowDifference == 1 && colDifference == 2);
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
