package Chess.game;

public class King extends Peice {
    public King (String color, int x, int y) {
        super("King", color, x, y);
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        return false;
    }
}
