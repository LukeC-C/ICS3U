package Chess.game;

public class Pawn extends Peice {
    String color;
    public Pawn (String c, int n, int x, int y, Peice[][] pA) {
        super("Pawn", c, n, x, y, pA);
        color = c;
    }

    @Override
    public void skroinkPeices(Peice[][] pA) {
        peiceArr = pA;
    }

    public void checkShouldRender(int x, int y) {
        if (x < 0 || y < 0)
            return;

        if (!(peiceArr[x][y].getColor().equals(color))) {
           // shouldRender = false;
        }
    }

    public boolean getShouldRender() {
        return shouldRender;
    }

    boolean hasntMoved = true;

    // sees if a pawn hasn't moved, if it has it *can* move 2 squares in the direction of its color and otherwise only 1
    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        try {
            if (color.equals("B")) {
                if (dY - cY == -1 && dX == cX /*&& peiceArr[cY][cX - 1] instanceof Empty*/) {
                    if (hasntMoved) hasntMoved = false;
                    super.xPos = dX;
                    super.yPos = dY;
                    return true;
                } else if (dY - cY == -2 && dX == cX && hasntMoved /*&& (peiceArr[cY][cX - 1] instanceof Empty || peiceArr[cY][cX - 2] instanceof Empty)*/) { 
                    if (hasntMoved) hasntMoved = false;
                    super.xPos = dX;
                    super.yPos = dY;
                    return true;
                // } else if (!(peiceArr[cY + 1][cX - 1] instanceof Empty) || !(peiceArr[cY - 1][cX - 1] instanceof Empty)) { 
                //     if (hasntMoved) hasntMoved = false;
                //     super.xPos = dX;
                //     super.yPos = dY;
                //     System.out.println(peiceArr[cY][cX + 1].getPeiceAndColor() + " bru");
                //     return true;
                } else {
                    return false;
                }
                
            } else if (color.equals("W")) {
                if (dY - cY == 1 && dX == cX /*&& peiceArr[cX][cY + 1] instanceof Empty*/) {
                    if (hasntMoved) hasntMoved = false;
                    super.xPos = dX;
                    super.yPos = dY;
                    return true;
                } else if (dY - cY == 2 && dX == cX && hasntMoved /*&& (peiceArr[cX][cY + 1] instanceof Empty || peiceArr[cX][cY + 2] instanceof Empty)*/) { 
                    if (hasntMoved) hasntMoved = false;
                    super.xPos = dX;
                    super.yPos = dY;
                    return true;
                // } else if (!(peiceArr[cY+1][cX + 1] instanceof Empty) || !(peiceArr[cY+1][cX - 1] instanceof Empty)) {
                //     if (hasntMoved) hasntMoved = false;
                //     super.xPos = dX;
                //     super.yPos = dY;
                //     System.out.println(peiceArr[cY][cX + 1].getPeiceAndColor() + " bru");
                //     return true;
                } else {
                    return false;
                }

                // if (dY - cY == 1 && dX == cX) {
                //     if (hasntMoved) hasntMoved = false;
                //     return true;
                // } else if (dY - cY == 2 && dX == cX && hasntMoved) { 
                //     if (hasntMoved) hasntMoved = false;
                //     return true;
                // } else {
                //     return false;
                // }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
