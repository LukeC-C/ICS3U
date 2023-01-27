package Chess.game;

import java.lang.Math;

public class Knight extends Peice {
    public Knight (String color, int n, int x, int y, Peice[][] pA) {
        super("Knight", color, n, x, y, pA);
    }

    @Override
    public void skroinkPeices(Peice[][] pA) {
        peiceArr = pA;
    }

    
    public void checkShouldRender(int x, int y) {
        if (!(peiceArr[yPos][xPos].getColor().equals(color))) {
           // shouldRender = false;
        }
    }

    public boolean getShouldRender() {
        return shouldRender;
    }

    // checks if the selected square is one of the squares that the knight can move to (look up "Knight movement chess" if you want a visual)
    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        //System.out.println("Knight pos: " + dX + ", " + dY + " | Peice at " + (dX - 1) + ", " + dY + ": " + peiceArr[dY][dX - 1].getPeiceAndColor());
        // for (int i = 0; i < peiceArr.length; i++) {
        //     for (int j = 0; j < peiceArr.length; j++) {
        //         System.out.print(peiceArr[i][j].getPeiceAndColor() + " ");
        //     }
        //     System.out.println();
        // }
        if (Math.abs(cX - dX) == 1 && Math.abs(cY - dY) == 2) {
            super.xPos = dX;
            super.yPos = dY;
            return true;
        } else if (Math.abs(cX - dX) == 2 && Math.abs(cY - dY) == 1) {
            super.xPos = dX;
            super.yPos = dY;
            return true;
        } else if (Math.abs(cX + dX) == 1 && Math.abs(cY + dY) == 2) {
            super.xPos = dX;
            super.yPos = dY;
            return true;
        } else if (Math.abs(cX + dX) == 2 && Math.abs(cY + dY) == 1) {
            super.xPos = dX;
            super.yPos = dY;
            return true;
        } else {
            System.out.println("invalid knight move!");
            return false;
        }
    }
}
