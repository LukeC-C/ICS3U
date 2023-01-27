package Chess.game;

// placeholder class for filling up the empty spaces in the peiceArray while still giving me control of whats happening + easier debugging
public class Empty extends Peice {
    public Empty (int x, int y, Peice[][] pA) {
        super("Empty", "E", -1, x, y, pA);
    }

    @Override
    public void skroinkPeices(Peice[][] pA) {
        peiceArr = pA;
    }

    public void checkShouldRender(int x, int y) {
        if (!(peiceArr[yPos][xPos].getColor().equals(color))) {
            shouldRender = false;
        }
    }

    public boolean getShouldRender() {
        return false;
    }

    @Override
    public boolean movePeice(int dX, int dY, int cX, int cY) {
        System.out.println("this is an empty square!");
        return false;
    }
}
