package Chess.game;

public class Rook extends Peice {
    public Rook (String color, int x, int y) {
        super("Rook", color, x, y);
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("Wow, you moved a rook!");
        if (dX == cX) {
            super.xPos = dX;
            return true;
        } else if (dY == cY) { 
            super.yPos = dY;
            return true;
        } else {
            System.out.println("invalid rook move!");
            return false;
        }
    }
}