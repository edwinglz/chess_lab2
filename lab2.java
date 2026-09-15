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
        
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            // Converts the string directly to the matching enum constant
            return PieceType.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid piece type! Please enter one of the listed pieces.\n");
        }
    }
  }
  public static void main(String[] args){
    Chessboard chessboard = new Chessboard();
    Scanner scanner = new Scanner(System.in);
    boolean choosePieceYes = true;
    //MAIN MENU, SELECTING THE PIECE AND THE POSITIONS
    System.out.println("Welcome! If you are here this means you are trying to verify a chess piece's movement.");
    while (choosePieceYes) { 

      //choosing color (black or white), piece type (king, queen, rook, bishop, knight, pawn), and starting position of the piece
      System.out.println("\nPlease type the colour of your piece: " + "\n1. WHITE" + "\n2. BLACK");
      String chosenColor = scanner.nextLine();

      PieceType chosenType = getPieceType(scanner);

      //getting the starting position of the piece and checking if its valid, if not keep asking for a valid position
      char startingColumn = ' ';
      int startingRow = 0;
      String startingPosition = "";

      while (true) {
        System.out.println("\nPlease type the starting position of your piece (e.g., E4): ");
        startingPosition = scanner.nextLine().trim();

        // Check basic length and types before getting column and row
        if (startingPosition.length() == 2 
          && Character.isLetter(startingPosition.charAt(0)) 
          && Character.isDigit(startingPosition.charAt(1))) {

          startingColumn = startingPosition.charAt(0);
          startingRow = Character.getNumericValue(startingPosition.charAt(1));

          // Check if on the board
          if (chessboard.withinChessboard(startingColumn, startingRow)) {
              break; // Valid input, exit loop
          }
        }
        System.out.println("Invalid starting position! Must be on board (e.g., E4).");
      }

      //True inner while loop to keep asking for a target position until the user wants to change the piece or quit
      boolean tryNewMoveYes = true;
      while (tryNewMoveYes) {
        char targetColumn = ' ';
        int targetRow = 0;

        while (true) {
          System.out.println("\nPlease type the target position of your piece (e.g., E4): ");
          String targetPosition = scanner.nextLine().trim();

          // Check basic length and types before getting column and row
          if (targetPosition.length() == 2 
            && Character.isLetter(targetPosition.charAt(0)) 
            && Character.isDigit(targetPosition.charAt(1))) {

            targetColumn = targetPosition.charAt(0);
            targetRow = Character.getNumericValue(targetPosition.charAt(1));

            // Check if on the board
            if (chessboard.withinChessboard(targetColumn, targetRow) && !(targetColumn == startingColumn && targetRow == startingRow)) {
                break; // Valid input, exit loop
            }
          }
          System.out.println("Invalid target position! Must be on board (e.g., E4).");
        }
        //creating the piece object based on the chosen type and color, then verifying target and printing if the move is valid or not
        switch (chosenType) {
          case KING:{
            King piece = new King("King",chosenColor, startingColumn, startingRow);
            boolean isValidMove = piece.verifyTarget(targetColumn, targetRow);
            System.out.println(isValidMove ? "Valid move!" : "Invalid move!");
            break;
          }
          case QUEEN:{
            Queen piece = new Queen("Queen",chosenColor, startingColumn, startingRow);
            boolean isValidMove = piece.verifyTarget(targetColumn, targetRow);
            System.out.println(isValidMove ? "Valid move!" : "Invalid move!");
            break;
          }
          case ROOK:{
            Rook piece = new Rook("Rook",chosenColor, startingColumn, startingRow);
            boolean isValidMove = piece.verifyTarget(targetColumn, targetRow);
            System.out.println(isValidMove ? "Valid move!" : "Invalid move!");
            break;
          }
          case BISHOP:{
            Bishop piece = new Bishop("Bishop",chosenColor, startingColumn, startingRow);
            boolean isValidMove = piece.verifyTarget(targetColumn, targetRow);
            System.out.println(isValidMove ? "Valid move!" : "Invalid move!");
            break;
          }
          case KNIGHT:{
            Knight piece = new Knight("Knight",chosenColor, startingColumn, startingRow);
            boolean isValidMove = piece.verifyTarget(targetColumn, targetRow);
            System.out.println(isValidMove ? "Valid move!" : "Invalid move!");
            break;
        }
          case PAWN:{
            Pawn piece = new Pawn("Pawn",chosenColor, startingColumn, startingRow);
            boolean isValidMove = piece.verifyTarget(targetColumn, targetRow);
            System.out.println(isValidMove ? "Valid move!" : "Invalid move!");
            break;
          }
        }

        //asking if they want to try a new move or change the piece
        System.out.println("\nDo you want to try a new move with the same piece? (yes/no)");
        String tryNewMoveResponse = scanner.nextLine().trim().toLowerCase();
        if (!tryNewMoveResponse.equalsIgnoreCase("yes")&& !tryNewMoveResponse.equalsIgnoreCase("y")) {
          tryNewMoveYes = false;
          //asking if they want to choose a new piece or quit
          System.out.println("\nDo you want to choose a new piece? (yes/no)");
          String chooseNewPieceResponse = scanner.nextLine().trim().toLowerCase();
          if (!chooseNewPieceResponse.equalsIgnoreCase("yes") && !chooseNewPieceResponse.equalsIgnoreCase("y")) {
            choosePieceYes = false;
          }
        }
      }

    }
  }
}