package TIY.company;

/**
 * Created by jenniferbrown on 7/18/17.
 */
public class GamePiece { //defining a new class named gamepiece
    int positionX; //setting instance variable
    int positionY; //setting instance variable
    boolean isFrozen;  //setting instance variable
    String color;
    String name;


    //creates public gamepiece
    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.isFrozen = false;
        this.color = "black";
        this.name = "Fairy";
    }


    //sets public instance variable x, gets & returns position
    public int getPositionX() {

        return positionX;
    }

    //sets public instance variable x, gets & returns position
    public int getPositionY() {
        return positionY;
    }

    //notates & returns that boolean = frozen
    public boolean isFrozen() {
        return isFrozen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(int newPositionX, int newPositionY) {
        if (!isFrozen) {
            this.positionX = newPositionX;
            this.positionY = newPositionY;
        }
    }

    public void freeze() {
        isFrozen = true;
    }

    public void unfreeze() {
        isFrozen = false;
    }

    public void addVector(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
    }
}

