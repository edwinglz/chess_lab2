import java.util.Scanner;

public class lab2{

    //gets a char and returns an int limited to A-H to 1-8 ///
    public static int turnCharToInt(char x){
        int xcoord;

        if(x=='a'||x=='A'){
            xcoord = 1;
        }
        else if(x=='b'||x=='B'){
            xcoord = 2;
        }
        else if(x=='c'||x=='C'){
            xcoord = 3;
        }
        else if(x=='d'||x=='D'){
            xcoord = 4;
        }
        else if(x=='e'||x=='E'){
            xcoord = 5;
        }
        else if(x=='f'||x=='F'){
            xcoord = 6;
        }
        else if(x=='g'||x=='G'){
            xcoord = 7;
        }
        else if(x=='h'||x=='H'){
            xcoord = 8;
        }
        else{
            System.err.println("Invalid x-coordinate. Exiting program.");
            xcoord = -1;
            System.exit(0);
        }
        return xcoord;
    }
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