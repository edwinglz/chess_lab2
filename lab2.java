import java.util.Scanner;


//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------
//  Made by Edwin Gonzalez, Osmar Leon
//
//  creates chesspiece objects depending on the piece type selected by the user. Then it takes in a starting position from the user
//  and checks them against a target coordinate. If a move works it prints the validity of each piece making the move
//--------------------------------------------------------------------------------------------------------------------------------------------
// Change Log:
// 9/13 -
// 9/14 -
// 9/14
//--------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------------

  enum PieceType {
    KING,
    QUEEN,
    ROOK,
    BISHOP,
    KNIGHT,
    PAWN
  }
  enum LocationX {
    a, b, c, d, e, f, g, h
  }

public class lab2{
    public static void main(String[] args){
        
      
        Scanner scanner = new Scanner(System.in);
    
        //MAIN MENU, SELECTING THE PIECE AND THE POSITIONS
        System.out.println("Welcome! If you are here this means you are trying to verify a chess piece's movement.");
        System.out.println("\nStart by typing the chess piece of your choice (in all capitals): " +
                                "1. PAWN" +
                                "2. ROOK" +
                                "3. KNIGHT" +
                                "4. BISHOP" +
                                "5. QUEEN" +
                                "6. KING ");
        PieceType pieceType = null;
        while (pieceType == null) {
            System.out.println("Enter piece type: ");
            String input = scanner.nextLine().toUpperCase();
            try {
                pieceType = PieceType.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid piece type, please try again.");
            }
        }


        //COLOR INPUT
        System.out.println("\nNext, please type the colour of your piece: (In all capitals)" +
                                "1. WHITE" +
                                "2. BLACK");

        //LOOP THE USER UNTIL THEY WRITE CORRECTLY ONE OF THE TWO COLORS
        boolean colorCheck = false;
        String chosenColor;
        while(!colorCheck){
          chosenColor = scanner.nextLine();
          if(chosenColor.equalsIgnoreCase("white") || chosenColor.equalsIgnoreCase(("black"))){
            colorCheck = true;
          }else{
            System.out.println("Color invalid. Please Try again (WHITE or BLACK)");
          }
        }

        //NEXT ASK THE USER FOR THE INITIAL COLUMN
        System.out.println("\nNext is the initial position for the column: " +
                                "a" +
                                "b" +
                                "c" +
                                "d" +
                                "e" +
                                "f" +
                                "g" +
                                "h");
        
        //VALIDATE INPUT THROUGH LOOP
        //LOOP THE USER UNTIL THEY WRITE CORRECTLY A column LETTER
        boolean columnCheck = false;
        char chosenColumn;
        while(!columnCheck){
          String input = scanner.nextLine().toLowerCase();

          if (input.isEmpty()) {
            System.out.println("Invalid column, please try again. (a...h)");
            continue; // skips the rest of this loop iteration, goes back to the while check
          } 

          chosenColumn = input.charAt(0);
          //check that it is in bounds
          if(chosenColumn >= 'a' && chosenColumn <= 'h'){
            columnCheck = true;
          }else{
            System.out.println("Invalid column number. Please try again. (a...h)");
          }
        }

        //NEXT ASK THE USER FOR THE INITIAL ROW
        System.out.println("\nNext is the initial position for the row. Please type a number (1...8)");

        //LOOP THE USER UNTIL THEY WRITE CORRECTLY A ROW NUMBER
        boolean rowCheck = false;
        int chosenRow;
        while(!rowCheck){
          chosenRow = scanner.nextInt();
          scanner.nextLine(); //flush empty line
          if(chosenRow >= 1 && chosenRow <= 8){
            rowCheck = true;
          }else{  
            System.out.println("Invalid row number. Please try again. (1...8)");
          }
        }
    

    //////////////////////////////////////////////////////////////
    //TARGETTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT

    //////////////////////////////////////////////////////////////


    //MAKE A LOOP TO CHECK THAT THE POSITIONS AREN'T THE SAME

    boolean equalCoords = true;

    //NEXT ASK THE USER FOR THE TARGET COLUMN

      while(equalCoords){
    
        System.out.println("\nNext is the target position for the column: " +
                                "a" +
                                "b" +
                                "c" +
                                "d" +
                                "e" +
                                "f" +
                                "g" +
                                "h");
        
        //VALIDATE INPUT THROUGH LOOP
        //LOOP THE USER UNTIL THEY WRITE CORRECTLY A column LETTER
        columnCheck = false;
        char targetColumn;
        while(!columnCheck){
          String input = scanner.nextLine().toLowerCase();

          if (input.isEmpty()) {
            System.out.println("Invalid column, please try again. (a...h)");
            continue; // skips the rest of this loop iteration, goes back to the while check
          } 

          targetColumn = input.charAt(0);
          //check that it is in bounds
          if(targetColumn >= 'a' && targetColumn <= 'h'){
            columnCheck = true;
          }else{
            System.out.println("Invalid column number. Please try again. (a...h)");
          }
        }

        //NEXT ASK THE USER FOR THE INITIAL ROW
        System.out.println("\nNext is the target position for the row. Please type a number (1...8)");

        //LOOP THE USER UNTIL THEY WRITE CORRECTLY A ROW NUMBER
        rowCheck = false;
        int targetRow;
        while(!rowCheck){
          targetRow = scanner.nextInt();
          scanner.nextLine(); //flush empty line
          if(targetRow >= 1 && targetRow <= 8){
            rowCheck = true;
          }else{  
            System.out.println("Invalid row number. Please try again. (1...8)");
          }
        }

        
      }
    }
}