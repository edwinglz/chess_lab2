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
    
    public String getColor() { return color; }
    public char getColumn() { return column; }
    public int getRow() { return row; }
    
    public void setColumn(char column) { this.column = Character.toLowerCase(column); }
    public void setRow(int row) { this.row = row; }

