package Chess.game;

import java.lang.Math;

public class Knight extends Peice {
    public Knight (String color, int x, int y) {
        super("Knight", color, x, y);
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("Wow, you moved a bishop!");
        if (Math.abs(cX - dX) == 1 && Math.abs(cY - dY) == 2) {
            return true;
        } else if (Math.abs(cX - dX) == 2 && Math.abs(cY - dY) == 1) {
            return true;
        } else if (Math.abs(cX + dX) == 1 && Math.abs(cY + dY) == 2) {
            return true;
        } else if (Math.abs(cX + dX) == 2 && Math.abs(cY + dY) == 1) {
            return true;
        } else {
            System.out.println("invalid knight move!");
            return false;
        }
    }
}
