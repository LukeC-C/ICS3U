package Chess.game;

public class King extends Peice {
    public King (String color, int x, int y, Peice[][] pA) {
        super("King", color, x, y, pA);
    }

    @Override
    public void skroinkPeices(Peice[][] pA) {
        peiceArr = pA;
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("Wow, you moved a king!");
        int deltaX = Math.abs(dX - cX);
        int deltaY = Math.abs(dY - cY);
        if ((deltaX == 1 || deltaY == 1) && (deltaX < 2 && deltaY < 2)) {
            super.xPos = dX;
            return true;
        } else {
            System.out.println("invalid king move!");
            return false;
        }
    }
}
