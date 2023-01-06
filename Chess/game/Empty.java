package Chess.game;

public class Empty extends Peice {
    public Empty (int x, int y) {
        super("Empty", "E", x, y);
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("this is an empty square!");
        return false;
    }
}
