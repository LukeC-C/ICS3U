package Chess.game;

public class Rook extends Peice {
    public Rook (String color, int x, int y, Peice[][] pA) {
        super("Rook", color, x, y, pA);
    }

    @Override
    public void skroinkPeices(Peice[][] pA) {
        peiceArr = pA;
    }

    // TODO make peices be able to block movement of others
    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("Wow, you moved a rook!");

        // I realize how terrible this code is, but I don't feel like fixing it right now
        for (int i = 0; i < peiceArr.length; i++) {
            for (int j = 0; j < peiceArr.length; j++) {
                if (dX == cX) {
                    // System.out.println("got to first step");
                    if (dX < cX) {
                        if (j == dY && i > dX && i < cX) {
                            if (!(peiceArr[i][j] instanceof Empty)) {
                                System.out.println("nopers");
                                return false;
                            }
                        } else {
                            return true;
                        }
                    } else {

                        // TODO Here V V V
                        // System.out.println("got to second step");
                        // System.out.println("j: " + j + " dY: " + dY + " i: " + i + " cX: " + cX + " dX " + dX);
                        if (j == dY && i > cX && i < dX) {
                            // System.out.println("got to third step");
                            if (!(peiceArr[i][j] instanceof Empty)) {
                                // System.out.println("got to fourth step");
                                System.out.println("nopers");
                                return false;
                            }
                        }
                        // this one ^^^^^

                    }
                } else if (dY == cY) { 
                    if (dY < cY) {
                        if (i == dY && i > dY && i < cY) {
                            if (!(peiceArr[i][j] instanceof Empty)) {
                                System.out.println("nopers");
                                return false;
                            }
                        } else {
                            System.out.println();
                            return true;
                        }
                    } else {
                        if (i == dY && i > cY && i < dY) {
                            if (!(peiceArr[i][j] instanceof Empty)) {
                                System.out.println("nopers");
                                return false;
                            }
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}