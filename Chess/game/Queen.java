package Chess.game;

public class Queen extends Peice {
    public Queen (String color, int x, int y) {
        super("Queen", color, x, y);
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("Wow, you moved a queen!");
        int deltaX = Math.abs(dX - cX);
        int deltaY = Math.abs(dY - cY);
        if (dX == cX) {
            super.xPos = dX;
            return true;
        } else if (dY == cY) { 
            super.yPos = dY;
            return true;
        } else if (deltaX == deltaY) {
            super.xPos = dX;
            return true;
        } else {
            System.out.println("invalid queen move!");
            return false;
        }
    }
}
