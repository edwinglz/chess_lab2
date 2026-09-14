public class Pawn{
        //properties
    private String piece_name;
    private String color;
    private int column;
    private int row;

    //constructors

    public Pawn(){

    }

    public Pawn(String piece_name,String color,int column,int row){
        this.piece_name = piece_name;
        this.color = color;
        this.column = column;
        this.row = row;
    }
    //getters    
    public String getColor() { return color; }
    public char getColumn() { return column; }
    public int getRow() { return row; }

    //setters
    public void setColumn(char column) { this.column = Character.toLowerCase(column); }
    public void setRow(int row) { this.row = row; }

    // Pawn movement validation
    public boolean verifyTarget(char targetCol, int targetRow) {
        char targetColLower = Character.toLowerCase(targetCol);
        char currentColLower = Character.toLowerCase(this.column);

        // A pawn can never change columns if there are no other pieces to capture
        if (targetColLower != currentColLower) {
            return false;
        }

        // White moves UP (+1 row, or +2 rows from starting row 2)
        if (this.color.equalsIgnoreCase("WHITE")) {
            if (targetRow == this.row + 1) {
                return true;
            }
            // Optional: standard chess allows 2 squares forward from row 2
            if (this.row == 2 && targetRow == this.row + 2) {
                return true;
            }
        }
        // Black moves DOWN (-1 row, or -2 rows from starting row 7)
        else if (this.color.equalsIgnoreCase("BLACK")) {
            if (targetRow == this.row - 1) {
                return true;
            }
            // Optional: standard chess allows 2 squares forward from row 7
            if (this.row == 7 && targetRow == this.row - 2) {
                return true;
            }
        }

        return false;
    }
