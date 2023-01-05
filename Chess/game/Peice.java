package Chess.game;

//import javax.swing.*;

public abstract class Peice /*extends JFrame*/ {
    // final JLabel peiceImg = new JLabel();
    final int WIDTH = 48;
    final int HEIGHT = 96;
    protected String peice;
    protected String color;
    protected int xPos;
    protected int yPos;
    
    public Peice (String p, String c, int x, int y) {
        peice = p;
        color = c;
        xPos = x;
        yPos = y;

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

    public abstract boolean movePeice(int dX, int dY, int cX, int cY);

}
