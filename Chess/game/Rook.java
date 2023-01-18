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
        Peice[] arraySlice = new Peice[8];

        if ((dX == cX && dY != cY)) {
            for (int i = peiceArr.length - 1; i > -1; i--) {
                arraySlice[i] = peiceArr[cX - i][cY];
            }
            // if (dY < cY) {
                
                for (int i = dY; i < cY; i++) {
                    System.out.println(arraySlice[i]);
                    if (!(arraySlice[i] instanceof Empty)) {
                        if (!(arraySlice[i] instanceof Rook)) {
                            System.out.println("nopers");
                            return false;
                        } else {
                            if (!(i == cX)) {
                                System.out.println(arraySlice[i] + " " + i + " " + cX);
                                return false;
                            } else {
                                System.out.println(arraySlice[i] + " " + i + " " + cX);
                            }
                        }
                    }
                }
                // WHAT I NEED TO DO:
                    // make it so that i detects one less than the 

            // } else {
            //     for (int i = cY; i < dY; i++) {
            //         if (!(arraySlice[i] instanceof Empty)) {
            //             System.out.println("nopers");
            //             return false;
            //         }
            //     }
            // }
            return true;
        } else if ((dY == cY && dX != cX)){

            return true; 
        } else {
            return false;
        }

    //     // I realize how terrible this code is, but I don't feel like fixing it right now
    //     for (int i = 0; i < peiceArr.length; i++) {
    //         for (int j = 0; j < peiceArr.length; j++) {
    //             if (dX == cX) {
    //                 // System.out.println("got to first step");
    //                 if (dX < cX) {
    //                     if (j == dY && i > dX && i < cX) {

    //                         if (!(peiceArr[i][j] instanceof Empty)) {
    //                             System.out.println("nopers");
    //                             return false;
    //                         }
    //                     } else {
    //                         return true;
    //                     }
    //                 } else {

    //                     // Here V V V
    //                     // System.out.println("got to second step");
    //                     // System.out.println("j: " + j + " dY: " + dY + " i: " + i + " cX: " + cX + " dX " + dX);
    //                     if (i == dY && (j > cX && j < dX) || (j < cX && j > dX)) {
    //                         System.out.println("got to third step");
    //                         if (!(peiceArr[j][i] instanceof Empty)) {
    //                             // System.out.println("got to fourth step");
    //                             System.out.println("nopers");
    //                             return false;
    //                         }
    //                     }
    //                     // this one ^^^^^

    //                 }
    //             } else if (dY == cY) { 
    //                 if (dY < cY) {
    //                     if (i == dY && i > dY && i < cY) {
    //                         if (!(peiceArr[i][j] instanceof Empty)) {
    //                             System.out.println("nopers");
    //                             return false;
    //                         }
    //                     } else {
    //                         System.out.println();
    //                         return true;
    //                     }
    //                 } else {
    //                     if (i == dY && i > cY && i < dY) {
    //                         if (!(peiceArr[i][j] instanceof Empty)) {
    //                             System.out.println("nopers");
    //                             return false;
    //                         }
    //                     }
    //                 }
    //             } else {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    }
}