package Chess.game;

public class Pawn extends Peice {
    String color;
    public Pawn (String c, int x, int y) {
        super("Pawn", c, x, y);
        color = c;
    }

    boolean hasntMoved = true;

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        if (color.equals("B")) {
            if (dY - cY == -1 && dX == cX) {
                if (hasntMoved) hasntMoved = false;
                return true;
            } else if (dY - cY == -2 && dX == cX && hasntMoved) { 
                if (hasntMoved) hasntMoved = false;
                return true;
            } else {
                return false;
            }
        } else if (color.equals("W")) {
            if (dY - cY == 1 && dX == cX) {
                if (hasntMoved) hasntMoved = false;
                return true;
            } else if (dY - cY == 2 && dX == cX && hasntMoved) { 
                if (hasntMoved) hasntMoved = false;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
