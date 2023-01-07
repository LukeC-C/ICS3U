package Chess.game;

public class Empty extends Peice {
    public Empty (int x, int y, Peice[][] pA) {
        super("Empty", "E", x, y, pA);
    }

    @Override
    public void skroinkPeices(Peice[][] pA) {
        peiceArr = pA;
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("this is an empty square!");
        return false;
    }
}
