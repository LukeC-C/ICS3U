package Chess.game;

public class Bishop extends Peice {
    public Bishop (String color, int x, int y) {
        super("Bishop", color, x, y);
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("Wow, you moved a bishop!");
        if (dX == cX) {
            super.xPos = dX;
            return true;
        } else if (dY == cY) { 
            super.yPos = dY;
            return true;
        } else {
            return false;
        }
    }
}
