import java.util.Scanner;

//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------
//  Lab Two - Continous Chess Piece Practice - Made by Edwin Gonzalez, Osmar Leon ^v^
//
//  Main Objective: User chooses a chess piece type and color, chooses current and target coordinates to attempt different
//  chess moves to practice chess moves!  
//
//  Create chesspiece objects depending on the piece type selected by the user then instantiating an object of the correct Class.
//  Then it takes in a starting position from the user and checks them against a target coordinate. If a move works it prints the 
//  validity of each piece making the move, otherwise it prints it cannot move to that location. While loops to continuously ask for
//  if they want to try a new move or new piece, otherwise quit the program.
//--------------------------------------------------------------------------------------------------------------------------------------------
// Change Log:
// 9/10 - Framework for classes was made, Pieces, Chessboard created.
// 9/13 - Chessboard started, updated the Pieces classes and started comments and changelog
// 9/14 - added enum for PieceType into Lab2 
// 9/14 - finished chessboard class
// 9/14 - changed all piece classes using col in variable and method from int to char.
//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------
public class lab2{
  public enum PieceType {
    KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN
  }

  public static PieceType getPieceType(Scanner scanner) {
    while (true) {
        System.out.println("\nStart by typing the chess piece of your choice (in all capitals): ");
        for (PieceType type : PieceType.values()) {
            System.out.print(type + " ");
        }
        System.out.print("\nEnter choice: ");
        
        String input = scanner.next().trim().toUpperCase();

        try {
            // Converts the string directly to the matching enum constant
            return PieceType.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid piece type! Please enter one of the listed pieces.\n");
        }
    }
}
  public static void main(String[] args){
      
    Scanner scanner = new Scanner(System.in);
    boolean choosePieceYes = true;
    //MAIN MENU, SELECTING THE PIECE AND THE POSITIONS
    System.out.println("Welcome! If you are here this means you are trying to verify a chess piece's movement.");
    while (choosePieceYes) { 
      //choosing color (black or white)
      System.out.println("\nPlease type the colour of your piece: " +
            "1. WHITE" +
            "2. BLACK");
      String chosenColor = scanner.nextLine();
      //piece type (king, queen, rook, bishop, knight, pawn)
      PieceType chosenType = getPieceType(scanner);
      //setting the starting position of the piece
      System.out.println("\nPlease type the starting position of your piece (e.g., E4): ");
      String startingPosition = scanner.nextLine();
      //col and row from the starting position
      char startingColumn = startingPosition.charAt(0);
      int startingRow = Character.getNumericValue(startingPosition.charAt(1));
      //while its not a valid position, keep asking for a valid position
      while (startingPosition.length() != 2 || !Character.isLetter(startingPosition.charAt(0))
        || !Character.isDigit(startingPosition.charAt(1)) || Chessboard.withinChessboard(startingColumn, startingRow) == false) {
          System.out.println("Invalid starting position! Please enter a valid position (e.g., E4): ");
          startingPosition = scanner.nextLine();
      }
      

    }
    
  }
}