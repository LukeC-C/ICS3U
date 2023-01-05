package Chess.game;

public class Knight extends Peice {
    public Knight (String color, int x, int y) {
        super("Knight", color, x, y);
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        return false;
    }
}
