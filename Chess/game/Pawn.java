package Chess.game;

public class Pawn extends Peice {
    String color;
    public Pawn (String c, int x, int y) {
        super("Pawn", c, x, y);
        color = c;
    }

    @Override
    public boolean movePeice(int x, int y) {
        if (x == super.getXPos()) {
            if (color == "B"){
                if (super.getYPos() - y == 1 || super.getYPos() - y == 2) {
                    super.yPos = y;
                    return true;
                } else {
                    return false;
                }
            } else if (color == "W") {
                if (y - super.getYPos() == 1 || y - super.getYPos() == 2) {
                    super.yPos = y;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
