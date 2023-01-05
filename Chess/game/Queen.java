package Chess.game;

public class Queen extends Peice {
    public Queen (String color, int x, int y) {
        super("Queen", color, x, y);
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        return false;
    }
}
