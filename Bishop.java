public class Bishop{
        //properties
    private String piece_name;
    private String color;
    private char column;
    private int row;

    //constructors
    public Bishop(){

    }
    public Bishop(String piece_name,String color,char column,int row){
        this.piece_name = piece_name;
        this.color = color;
        this.column = column;
        this.row = row;
    }

    //getters
    public String getColor(){
        return this.color;
    }
    public int getColumn(){
        return this.column;
    }
    public int getRow(){
        return this.row;
    }

    //setters
    public void setColumn(char column){
        this.column = column;
    }
    public void setRow(int row){
        this.row = row;
    }

    //validation
    public boolean isValid(char column, int row){
        char targetCol = Character.toLowerCase(column);
        char currentCol = Character.toLowerCase(this.column);

        if(targetCol == currentCol && row == this.row){
            return false;
        }
        boolean isBishopMove = Math.abs(targetCol - currentCol) == Math.abs(row - this.row);

        return isBishopMove;
    }

}