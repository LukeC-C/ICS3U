package Chess.game;

import java.lang.Math;

public class Bishop extends Peice {
    public Bishop (String color, int n, int x, int y, Peice[][] pA) {
        super("Bishop", color, n, x, y, pA);
    }

    @Override
    public void skroinkPeices(Peice[][] pA) {
        peiceArr = pA;
    }

    public void checkShouldRender(int x, int y) {
        if (!(peiceArr[yPos][xPos].getColor().equals(color))) {
            shouldRender = false;
        }
    }

    public boolean getShouldRender() {
        return shouldRender;
    }

    // does some equation stuff to find if the selected square is on the same diagonal as the bishop is (I wrote this over a month ago ok)
    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("Wow, you moved a bishop!");
        int deltaX = Math.abs(dX - cX);
        int deltaY = Math.abs(dY - cY);
        if (deltaX == deltaY) {
            super.xPos = dX;
            super.yPos = dY;
            return true;
        } else {
            System.out.println("invalid bishop move!");
            return false;
        }
    }
}
