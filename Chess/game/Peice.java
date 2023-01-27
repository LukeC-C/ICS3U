package Chess.game;

public abstract class Peice {
    final int WIDTH = 48;
    final int HEIGHT = 96;
    Peice[][] peiceArr;
    protected String peice;
    protected String color;
    protected int xPos;
    protected int yPos;
    protected boolean shouldRender = true;
    protected int peiceNumber;
    
    public Peice (String p, String c, int n, int x, int y, Peice[][] pA) {
        peice = p;
        color = c;
        peiceNumber = n;
        xPos = x;
        yPos = y;
        peiceArr = pA;
    }

    public String getPeice() {
        return peice;
    }

    public String getColor() {
        return color;
    }

    public String getPeiceAndColor() {
        return peice.substring(0, 2) + "_" + color.substring(0, 1);
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }
    
    public int getPeiceNumber() {
        return peiceNumber;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public String toString() {
        return peice.substring(0, 2) + "_" + color.substring(0, 1) + "_" + peiceNumber;
    }
    
    public static Peice toPeice(String str, int x, int y) {
        if (str.substring(0,2).equals("Pa")) {
            if (str.substring(3, 4).equals("W")) {
                return new Pawn("W", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            } else {
                return new Pawn("B", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            }
        } else if (str.substring(0,2).equals("Ro")) {
            if (str.substring(3, 4).equals("W")) {
                return new Rook("W", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            } else {
                return new Rook("B", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            }
        } else if (str.substring(0,2).equals("Kn")) {
            if (str.substring(3, 4).equals("W")) {
                return new Knight("W", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            } else {
                return new Knight("B", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            }
        } else if (str.substring(0,2).equals("Bi")) {
            if (str.substring(3, 4).equals("W")) {
                return new Bishop("W", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            } else {
                return new Bishop("B", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            }
        } else if (str.substring(0,2).equals("Qu")) {
            if (str.substring(3, 4).equals("W")) {
                return new Queen("W", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            } else {
                return new Queen("B", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            }
        } else if (str.substring(0,2).equals("Ki")) {
            if (str.substring(3, 4).equals("W")) {
                return new King("W", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            } else {
                return new King("B", Integer.parseInt(str.substring(str.length() - 1, str.length())), x, y, null);
            }
        } else {
            return new Empty(x, y, null);
        }
    }
    
    // public static ImageIcon chooseImage() {

    // }

    public abstract void skroinkPeices(Peice[][] pA);

    public abstract boolean movePeice(int dX, int dY, int cX, int cY);

    public abstract void checkShouldRender(int dX, int dY);

    public abstract boolean getShouldRender();

}
