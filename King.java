public class King{
        //properties
    private String piece_name;
    private String color;
    private int column;
    private int row;

    //constructors

    public King(){

    }

    public King(String piece_name,String color,int column,int row){
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

    public void setColumn(int column){
        this.column = column;
    }

    public void setRow(int row){
        this.row = row;
    }

    //validation

        public boolean isValid(int column, int row){

        if((Math.abs(column - this.column) == 1 && Math.abs(row - this.row) <= 1) || (Math.abs(row - this.row) == 1 && Math.abs(column - this.column) <= 1)){
           return true;

        }

        return false;
    }
}