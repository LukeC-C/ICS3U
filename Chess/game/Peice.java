package Chess.game;

import java.io.PipedWriter;

//import javax.swing.*;

public abstract class Peice {
    // final JLabel peiceImg = new JLabel();
    final int WIDTH = 48;
    final int HEIGHT = 96;
    Peice[][] peiceArr;
    protected String peice;
    protected String color;
    protected int xPos;
    protected int yPos;
    
    public Peice (String p, String c, int x, int y, Peice[][] pA) {
        peice = p;
        color = c;
        xPos = x;
        yPos = y;
        peiceArr = pA;

        try {
            // if (p != "Empty") {
            //     ImageIcon im = new ImageIcon("C:\\Users\\User\\Desktop\\ICS3U\\Chess\\assets\\" + c + "_" + p);
            //     peiceImg.setIcon(im);
            //     peiceImg.setBounds(x, y, WIDTH, HEIGHT);
            //     this.add(peiceImg);
            // } else if (p == "Empty") {
            //     peiceImg.setBounds(x, y, WIDTH, HEIGHT);
            //     this.add(peiceImg);
            // } else {
            //     System.out.println("PANIC PANIC PANIC\nSOMETHING HAS GONE VERY, VERY WRONG");
            // }
        } catch (Exception e) {
            System.out.println("Couldn't find file location for " + p);
        }
        //setVisible(true);
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

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    // TODO pass in coords as params. get coords from arr.
        // before you waste your time on it future me, no you cant just do it in Chessboard
    public static Peice toPeice(String str, int x, int y) {
        if (str.substring(0,2).equals("Pa")) {
            if (str.substring(3).equals("W")) {
                return new Pawn("W", x, y, null);
            } else {
                return new Pawn("B", x, y, null);
            }
        } else if (str.substring(0,2).equals("Ro")) {
            if (str.substring(3).equals("W")) {
                return new Rook("W", x, y, null);
            } else {
                return new Rook("B", x, y, null);
            }
        } else if (str.substring(0,2).equals("Kn")) {
            if (str.substring(3).equals("W")) {
                return new Knight("W", x, y, null);
            } else {
                return new Knight("B", x, y, null);
            }
        } else if (str.substring(0,2).equals("Bi")) {
            if (str.substring(3).equals("W")) {
                return new Bishop("W", x, y, null);
            } else {
                return new Bishop("B", x, y, null);
            }
        } else if (str.substring(0,2).equals("Qu")) {
            if (str.substring(3).equals("W")) {
                return new Queen("W", x, y, null);
            } else {
                return new Queen("B", x, y, null);
            }
        } else if (str.substring(0,2).equals("Ki")) {
            if (str.substring(3).equals("W")) {
                return new King("W", x, y, null);
            } else {
                return new King("B", x, y, null);
            }
        } else {
            return new Empty(x, y, null);
        }
    }

    public abstract void skroinkPeices(Peice[][] pA);

    public abstract boolean movePeice(int dX, int dY, int cX, int cY);

}
