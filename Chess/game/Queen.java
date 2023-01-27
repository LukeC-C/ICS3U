package Chess.game;

public class Queen extends Peice {
    public Queen (String color, int n, int x, int y, Peice[][] pA) {
        super("Queen", color, n, x, y, pA);
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

    // combo of rook and bishop code, as that's essentially all the queen is
    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("Wow, you moved a queen!");
        int deltaX = Math.abs(dX - cX);
        int deltaY = Math.abs(dY - cY);
        if (dX == cX) {
            super.xPos = dX;
            super.yPos = dY;
            return true;
        } else if (dY == cY) { 
            super.xPos = dX;
            super.yPos = dY;
            return true;
        } else if (deltaX == deltaY) {
            super.xPos = dX;
            super.yPos = dY;
            return true;
        } else {
            System.out.println("invalid queen move!");
            return false;
        }
    }
}
