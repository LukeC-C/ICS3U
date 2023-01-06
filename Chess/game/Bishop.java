package Chess.game;

import java.lang.Math;

public class Bishop extends Peice {
    public Bishop (String color, int x, int y) {
        super("Bishop", color, x, y);
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("Wow, you moved a bishop!");
        int deltaX = Math.abs(dX - cX);
        int deltaY = Math.abs(dY - cY);
        if (deltaX == deltaY) {
            super.xPos = dX; // <--- maybe can be cut out future me
            return true;
        } else {
            System.out.println("invalid bishop move!");
            return false;
        }
    }
}
