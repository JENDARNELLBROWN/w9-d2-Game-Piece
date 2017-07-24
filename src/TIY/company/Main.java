package TIY.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GamePiece newGamePiece = new GamePiece();

     //Verify that if the game piece is not frozen then the call to freeze sets the frozen variable to true.
        System.out.println("Before freezing is frozen equals " + newGamePiece.isFrozen());
        newGamePiece.freeze();
        System.out.println("After freezing is frozen equals " + newGamePiece.isFrozen());
        newGamePiece.unfreeze();
        System.out.println("After unfreezing is frozen equals " + newGamePiece.isFrozen());
        newGamePiece.move(5,7);
        System.out.println("New position is " + newGamePiece.getPositionX() + ", " + newGamePiece.getPositionY());
        newGamePiece.freeze();
        newGamePiece.move(11,0);
        System.out.println("New position is " + newGamePiece.getPositionX() + ", " + newGamePiece.getPositionY());


    }
}
