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
class Lab2Enum{
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
        String chosenPiece = scanner.nextLine();

        System.out.println("\nNext, please type the colour of your piece: (In all capitals)" +
                                "1. WHITE" +
                                "2. BLACK");
        String chosenColor = scanner.nextLine();
    }
}