package Chess.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 *
 * @author lukecc
 */

// note: I am the king of spegetti! 

public class Chessboard extends JFrame implements ActionListener {
    Peice[][] peiceArr = new Peice[8][8];

        // code not made by me
        JFrame testingIcons = new JFrame();
        ImageIcon iconImg = new ImageIcon("Chess/assets/AppIcon.png");
    
    boolean wKingAlive = false;
    boolean bKingAlive = false;

    String playerTurn = "White";
    
    // intantciating (I hope I spelled that right) all the peices 
    Rook wRook1 = new Rook("W", 1, 0, 0, peiceArr);
    Knight wKnight1 = new Knight("W", 1, 1, 0, peiceArr);
    Bishop wBishop1 = new Bishop("W", 1, 2, 0, peiceArr);
    Queen wQueen = new Queen("W", 1, 3, 0, peiceArr);
    King wKing = new King("W", 1, 4, 0, peiceArr);
    Bishop wBishop2 = new Bishop("W", 2, 5, 0, peiceArr);
    Knight wKnight2 = new Knight("W", 2, 6, 0, peiceArr);
    Rook wRook2 = new Rook("W", 2, 7, 0, peiceArr);

    Pawn wPawn1 = new Pawn("W", 1, 0, 1, peiceArr);
    Pawn wPawn2 = new Pawn("W", 2, 1, 1, peiceArr);
    Pawn wPawn3 = new Pawn("W", 3, 2, 1, peiceArr);
    Pawn wPawn4 = new Pawn("W", 4, 3, 1, peiceArr);
    Pawn wPawn5 = new Pawn("W", 5, 4, 1, peiceArr);
    Pawn wPawn6 = new Pawn("W", 6, 5, 1, peiceArr);
    Pawn wPawn7 = new Pawn("W", 7, 6, 1, peiceArr);
    Pawn wPawn8 = new Pawn("W", 8, 7, 1, peiceArr);

    Rook bRook1 = new Rook("B", 1, 0, 7, peiceArr);
    Knight bKnight1 = new Knight("B", 1, 1, 7, peiceArr);
    Bishop bBishop1 = new Bishop("B", 1, 2, 7, peiceArr);
    Queen bQueen = new Queen("B", 1, 3, 7, peiceArr);
    King bKing = new King("B", 1, 4, 7, peiceArr);
    Bishop bBishop2 = new Bishop("B", 2, 5, 7, peiceArr);
    Knight bKnight2 = new Knight("B", 2, 6, 7, peiceArr);
    Rook bRook2 = new Rook("B", 2, 7, 7, peiceArr);

    Pawn bPawn1 = new Pawn("B", 1, 0, 6, peiceArr);
    Pawn bPawn2 = new Pawn("B", 2, 1, 6, peiceArr);
    Pawn bPawn3 = new Pawn("B", 3, 2, 6, peiceArr);
    Pawn bPawn4 = new Pawn("B", 4, 3, 6, peiceArr);
    Pawn bPawn5 = new Pawn("B", 5, 4, 6, peiceArr);
    Pawn bPawn6 = new Pawn("B", 6, 5, 6, peiceArr);
    Pawn bPawn7 = new Pawn("B", 7, 6, 6, peiceArr);
    Pawn bPawn8 = new Pawn("B", 8, 7, 6, peiceArr);

    // array of buttons used to see what square is clicked
    JButton[][] arr = new JButton[8][8];

    // labels for the images
    JLabel wRook1Image = new JLabel();
    JLabel wKnight1Image = new JLabel();
    JLabel wBishop1Image = new JLabel();
    JLabel wQueenImage = new JLabel();
    JLabel wKingImage = new JLabel();
    JLabel wBishop2Image = new JLabel();
    JLabel wKnight2Image = new JLabel();
    JLabel wRook2Image = new JLabel();

    JLabel wPawn1Image = new JLabel();
    JLabel wPawn2Image = new JLabel();
    JLabel wPawn3Image = new JLabel();
    JLabel wPawn4Image = new JLabel();
    JLabel wPawn5Image = new JLabel();
    JLabel wPawn6Image = new JLabel();
    JLabel wPawn7Image = new JLabel();
    JLabel wPawn8Image = new JLabel();

    JLabel bRook1Image = new JLabel();
    JLabel bKnight1Image = new JLabel();
    JLabel bBishop1Image = new JLabel();
    JLabel bQueenImage = new JLabel();
    JLabel bKingImage = new JLabel();
    JLabel bBishop2Image = new JLabel();
    JLabel bKnight2Image = new JLabel();
    JLabel bRook2Image = new JLabel();

    JLabel bPawn1Image = new JLabel();
    JLabel bPawn2Image = new JLabel();
    JLabel bPawn3Image = new JLabel();
    JLabel bPawn4Image = new JLabel();
    JLabel bPawn5Image = new JLabel();
    JLabel bPawn6Image = new JLabel();
    JLabel bPawn7Image = new JLabel();
    JLabel bPawn8Image = new JLabel();

    JLabel emptyImage = new JLabel();

    // I don't know where why or even if I used these but I have to go to robotics and don't have time to check
    int peiceSelectedXPos = -1;
    int peiceSelectedYPos = -1;

    int rookSelectedXPos = -1;
    int rookSelectedYPos = -1;
    
    int knightSelectedXPos = -1;
    int knightSelectedYPos = -1;

    int bishopSelectedXPos = -1;
    int bishopSelectedYPos = -1;

    int kingSelectedXPos = -1;
    int kingSelectedYPos = -1;

    int queenSelectedXPos = -1;
    int queenSelectedYPos = -1;

    // adding images for the peices
    ImageIcon wRook1ImageIcon = new ImageIcon("Chess/assets/W_Rook.png");
    ImageIcon wKnight1ImageIcon = new ImageIcon("Chess/assets/W_Knight.png");
    ImageIcon wBishop1ImageIcon = new ImageIcon("Chess/assets/W_Bishop.png");
    ImageIcon wKingImageIcon = new ImageIcon("Chess/assets/W_King.png");
    ImageIcon wQueenImageIcon = new ImageIcon("Chess/assets/W_Queen.png");
    ImageIcon wBishop2ImageIcon = new ImageIcon("Chess/assets/W_Bishop.png");
    ImageIcon wKnight2ImageIcon = new ImageIcon("Chess/assets/W_Knight.png");
    ImageIcon wRook2ImageIcon = new ImageIcon("Chess/assets/W_Rook.png");
    ImageIcon wPawn1ImageIcon = new ImageIcon("Chess/assets/W_Pawn.png");
    ImageIcon wPawn2ImageIcon = new ImageIcon("Chess/assets/W_Pawn.png");
    ImageIcon wPawn3ImageIcon = new ImageIcon("Chess/assets/W_Pawn.png");
    ImageIcon wPawn4ImageIcon = new ImageIcon("Chess/assets/W_Pawn.png");
    ImageIcon wPawn5ImageIcon = new ImageIcon("Chess/assets/W_Pawn.png");
    ImageIcon wPawn6ImageIcon = new ImageIcon("Chess/assets/W_Pawn.png");
    ImageIcon wPawn7ImageIcon = new ImageIcon("Chess/assets/W_Pawn.png");
    ImageIcon wPawn8ImageIcon = new ImageIcon("Chess/assets/W_Pawn.png");
    ImageIcon bRook1ImageIcon = new ImageIcon("Chess/assets/B_Rook.png");
    ImageIcon bKnight1ImageIcon = new ImageIcon("Chess/assets/B_Knight.png");
    ImageIcon bBishop1ImageIcon = new ImageIcon("Chess/assets/B_Bishop.png");
    ImageIcon bQueenImageIcon = new ImageIcon("Chess/assets/B_Queen.png");
    ImageIcon bKingImageIcon = new ImageIcon("Chess/assets/B_King.png");
    ImageIcon bBishop2ImageIcon = new ImageIcon("Chess/assets/B_Bishop.png");
    ImageIcon bKnight2ImageIcon = new ImageIcon("Chess/assets/B_Knight.png");
    ImageIcon bRook2ImageIcon = new ImageIcon("Chess/assets/B_Rook.png");
    ImageIcon bPawn1ImageIcon = new ImageIcon("Chess/assets/B_Pawn.png");
    ImageIcon bPawn2ImageIcon = new ImageIcon("Chess/assets/B_Pawn.png");
    ImageIcon bPawn3ImageIcon = new ImageIcon("Chess/assets/B_Pawn.png");
    ImageIcon bPawn4ImageIcon = new ImageIcon("Chess/assets/B_Pawn.png");
    ImageIcon bPawn5ImageIcon = new ImageIcon("Chess/assets/B_Pawn.png");
    ImageIcon bPawn6ImageIcon = new ImageIcon("Chess/assets/B_Pawn.png");
    ImageIcon bPawn7ImageIcon = new ImageIcon("Chess/assets/B_Pawn.png");
    ImageIcon bPawn8ImageIcon = new ImageIcon("Chess/assets/B_Pawn.png");
    ImageIcon emptyImageIcon = new ImageIcon("Chess/assets/Empty.png");


    // putting the images of the peices in an array (same thing for this as on line 106)
    JLabel[][] peiceImages = {
        {wRook1Image, wKnight1Image, wBishop1Image, wQueenImage, wKingImage, wBishop2Image, wKnight2Image, wRook2Image},
        {wPawn1Image, wPawn2Image, wPawn3Image, wPawn4Image, wPawn5Image, wPawn6Image, wPawn7Image, wPawn8Image},

        // they call me the best spegetti cooker
        {emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage},
        {emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage},
        {emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage},
        {emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage, emptyImage},

        {bPawn1Image, bPawn2Image, bPawn3Image, bPawn4Image, bPawn5Image, bPawn6Image, bPawn7Image, bPawn8Image},
        {bRook1Image, bKnight1Image, bBishop1Image, bQueenImage, bKingImage, bBishop2Image, bKnight2Image, bRook2Image}
    };
    

    public Chessboard(String gameType) {
        // making the chessboard
        final int WIDTH = 800;
        final int HEIGHT = 800;
        System.out.println("Chessboard opened");

            //code not made by me
            this.setIconImage(iconImg.getImage());

        final JLabel chessboard = new JLabel();

        // setting up the window
        setBounds(0, 0, WIDTH + 13, HEIGHT + 55 /* please don't ask me about the hardcoded numbers; swing is weird */);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // seeing what gametype was selected and wether or not to pull from the save file
        if (gameType.equals("new")) {
            for (int j = 0; j < peiceArr.length; j++) {
                for (int i = 0; i < peiceArr.length; i++) {
                    if (i == 0 && j == 0) {
                        peiceArr[j][i] = wRook1;
                    } else if (i == 1 && j == 0) {
                        peiceArr[j][i] = wKnight1;
                    } else if (i == 2 && j == 0) {
                        peiceArr[j][i] = wBishop1;
                    } else if (i == 3 && j == 0) {
                        peiceArr[j][i] = wQueen;
                    } else if (i == 4 && j == 0) {
                        peiceArr[j][i] = wKing;
                    } else if (i == 5 && j == 0) {
                        peiceArr[j][i] = wBishop2;
                    } else if (i == 6 && j == 0) {
                        peiceArr[j][i] = wKnight2;
                    } else if (i == 7 && j == 0) {
                        peiceArr[j][i] = wRook2;
                    } else if (i == 0 && j == 1) {
                        peiceArr[j][i] = wPawn1;
                    } else if (i == 1 && j == 1) {
                        peiceArr[j][i] = wPawn2;
                    } else if (i == 2 && j == 1) {
                        peiceArr[j][i] = wPawn3;
                    } else if (i == 3 && j == 1) {
                        peiceArr[j][i] = wPawn4;
                    } else if (i == 4 && j == 1) {
                        peiceArr[j][i] = wPawn5;
                    } else if (i == 5 && j == 1) {
                        peiceArr[j][i] = wPawn6;
                    } else if (i == 6 && j == 1) {
                        peiceArr[j][i] = wPawn7;
                    } else if (i == 7 && j == 1) {
                        peiceArr[j][i] = wPawn8;
                    }
                    
                    else if (i == 0 && j == 6) {
                        peiceArr[j][i] = bPawn1;
                    } else if (i == 1 && j == 6) {
                        peiceArr[j][i] = bPawn2;
                    } else if (i == 2 && j == 6) {
                        peiceArr[j][i] = bPawn3;
                    } else if (i == 3 && j == 6) {
                        peiceArr[j][i] = bPawn4;
                    } else if (i == 4 && j == 6) {
                        peiceArr[j][i] = bPawn5;
                    } else if (i == 5 && j == 6) {
                        peiceArr[j][i] = bPawn6;
                    } else if (i == 6 && j == 6) {
                        peiceArr[j][i] = bPawn7;
                    } else if (i == 7 && j == 6) {
                        peiceArr[j][i] = bPawn8;
                    } else if (i == 0 && j == 7) {
                        peiceArr[j][i] = bRook1;
                    } else if (i == 1 && j == 7) {
                        peiceArr[j][i] = bKnight1;
                    } else if (i == 2 && j == 7) {
                        peiceArr[j][i] = bBishop1;
                    } else if (i == 3 && j == 7) {
                        peiceArr[j][i] = bQueen;
                    } else if (i == 4 && j == 7) {
                        peiceArr[j][i] = bKing;
                    } else if (i == 5 && j == 7) {
                        peiceArr[j][i] = bBishop2;
                    } else if (i == 6 && j == 7) {
                        peiceArr[j][i] = bKnight2;
                    } else if (i == 7 && j == 7) {
                        peiceArr[j][i] = bRook2;
                    } else {
                        peiceArr[j][i] = new Empty(i, j, peiceArr);;
                    }
                }
            }
            try {
                FileWriter fw = new FileWriter("Chess/game/save.txt");
                PrintWriter pw = new PrintWriter(fw);
                pw.close();
            } catch (Exception e) {
                System.err.println(e);
            }
            saveMove(peiceArr);
        } else if (gameType.equals("save")) {
            FileReader fr;
            BufferedReader br;
            try {
                fr = new FileReader("Chess/game/save.txt");
                br = new BufferedReader(fr);

                for (int i = 0; i < peiceArr.length; i++) {
                    for (int j = 0; j < peiceArr.length; j++) {
                        if (i == 0 && j == 0) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);// TODO < < < here;
                        } else if (i == 1 && j == 0) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 2 && j == 0) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 3 && j == 0) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 4 && j == 0) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 5 && j == 0) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 6 && j == 0) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 7 && j == 0) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 0 && j == 1) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 1 && j == 1) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 2 && j == 1) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 3 && j == 1) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 4 && j == 1) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 5 && j == 1) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 6 && j == 1) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 7 && j == 1) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        }

                          else if (i == 0 && j == 2) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 1 && j == 2) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 2 && j == 2) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 3 && j == 2) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 4 && j == 2) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 5 && j == 2) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 6 && j == 2) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 7 && j == 2) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 0 && j == 3) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 1 && j == 3) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 2 && j == 3) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 3 && j == 3) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 4 && j == 3) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 5 && j == 3) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 6 && j == 3) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 7 && j == 3) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        }

                          else if (i == 0 && j == 4) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 1 && j == 4) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 2 && j == 4) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 3 && j == 4) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 4 && j == 4) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 5 && j == 4) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 6 && j == 4) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 7 && j == 4) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 0 && j == 5) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 1 && j == 5) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 2 && j == 5) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 3 && j == 5) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 4 && j == 5) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 5 && j == 5) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 6 && j == 5) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 7 && j == 5) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        }
                        
                          else if (i == 0 && j == 6) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 1 && j == 6) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 2 && j == 6) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 3 && j == 6) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 4 && j == 6) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 5 && j == 6) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 6 && j == 6) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 7 && j == 6) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 0 && j == 7) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 1 && j == 7) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 2 && j == 7) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 3 && j == 7) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 4 && j == 7) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 5 && j == 7) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 6 && j == 7) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        } else if (i == 7 && j == 7) {
                            peiceArr[j][i] = Peice.toPeice(br.readLine(), j, i);
                        }
                    }
                }
            } catch (Exception e) {
                System.err.println(e);
            }
            
                
        }

        for (int i = 0; i < peiceArr.length; i++) {
            for (int j = 0; j < peiceArr.length; j++) {
                peiceArr[i][j].skroinkPeices(peiceArr);
            }
        }

        // making the array of jbuttons for the chessboard work and look nice
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i % 2 == 0 && j % 2 == 0) {
                        arr[i][j] =  new JButton();
                        arr[i][j].setBounds(0 + (WIDTH / 8 * i), 0 + (HEIGHT / 8 * j), WIDTH / 8, HEIGHT / 8);
                        // arr[i][j].setBackground(Color.RED);
                        arr[i][j].addActionListener(this);
                        // thanks stackoverflow (@Jeff B)
                            arr[i][j].setOpaque(false);
                            arr[i][j].setContentAreaFilled(false);
                            // arr[i][j].setBorderPainted(false);
                        this.add(arr[i][j]);
                    } else if (i % 2 == 1 && j % 2 == 1) {
                        arr[i][j] = new JButton();
                        arr[i][j].setBounds(0 + (WIDTH / 8 * i), 0 + (HEIGHT / 8 * j), WIDTH / 8, HEIGHT / 8);
                        // arr[i][j].setBackground(Color.RED);
                        arr[i][j].addActionListener(this);
                        arr[i][j].setOpaque(false);
                        arr[i][j].setContentAreaFilled(false);
                        // arr[i][j].setBorderPainted(false);
                        this.add(arr[i][j]);
                    } else {
                        arr[i][j] = new JButton();
                        arr[i][j].setBounds(0 + (WIDTH / 8 * i), 0 + (HEIGHT / 8 * j), WIDTH / 8, HEIGHT / 8);
                        arr[i][j].addActionListener(this);
                        arr[i][j].setOpaque(false);
                        arr[i][j].setContentAreaFilled(false);
                        // arr[i][j].setBorderPainted(false);
                        this.add(arr[i][j]);
                    }
                }
                
            }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j].setText(peiceArr[j][i].getPeiceAndColor());
            }
        }

        // ImageIcon im = new ImageIcon("Chess/assets/Chessboard.png");
        // chessboard.setIcon(im);
        // chessboard.setBounds(0, 0, WIDTH, HEIGHT + 18);
        // this.add(chessboard);

        // using -2 here because -1 is another possibility of something that could get passed in
        renderImages(peiceArr, -1, -1);
        setVisible(true);
    } 

    public static void saveMove(Peice[][] pA) {
        try {
            FileWriter fw = new FileWriter("Chess/game/save.txt");
            PrintWriter pw = new PrintWriter(fw);

            for (int i = 0; i < pA.length; i++) {
                for (int j = 0; j < pA.length; j++) {
                    pw.println(pA[j][i].toString());
                }
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // image renderer
    public void renderImages(Peice[][] peiceArr, int x, int y) {     
        // variables used to see if a peice has already been rendered
        boolean wRook1Rendered = false;
        boolean wRook2Rendered = false;
        boolean wBishop1Rendered = false;
        boolean wBishop2Rendered = false;
        boolean wKnight1Rendered = false;
        boolean wKnight2Rendered = false;
        boolean wQueenRendered = false;
        boolean wKingRendered = false;

        boolean wPawn1Rendered = false;
        boolean wPawn2Rendered = false;
        boolean wPawn3Rendered = false;
        boolean wPawn4Rendered = false;
        boolean wPawn5Rendered = false;
        boolean wPawn6Rendered = false;
        boolean wPawn7Rendered = false;
        boolean wPawn8Rendered = false;

        boolean bRook1Rendered = false;
        boolean bRook2Rendered = false;
        boolean bBishop1Rendered = false;
        boolean bBishop2Rendered = false;
        boolean bKnight1Rendered = false;
        boolean bKnight2Rendered = false;
        boolean bQueenRendered = false;
        boolean bKingRendered = false;

        boolean bPawn1Rendered = false;
        boolean bPawn2Rendered = false;
        boolean bPawn3Rendered = false;
        boolean bPawn4Rendered = false;
        boolean bPawn5Rendered = false;
        boolean bPawn6Rendered = false;
        boolean bPawn7Rendered = false;
        boolean bPawn8Rendered = false;

        // refer to the README
        for (int j = 0; j < peiceArr.length; j++) {
            for (int i = 0; i < peiceArr.length; i++) {
                peiceArr[i][j].checkShouldRender(x, y);
            }
        }

        // same as line 541 for a lot of this
        for (int j = 0; j < peiceArr.length; j++) {
            for (int i = 0; i < peiceArr.length; i++) {
                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Rook && !wRook1Rendered) {
                        wRook1Image.setIcon(wRook1ImageIcon);
                        wRook1Image.setBounds(wRook1.getXPos() * 100 + 25, wRook1.getYPos() * 100, wRook1.getWIDTH(), wRook1.getHEIGHT());
                        this.add(wRook1Image);
                        wRook1Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Rook && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(wRook1Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Knight && !wKnight1Rendered) {
                        wKnight1Image.setIcon(wKnight1ImageIcon);
                        wKnight1Image.setBounds(wKnight1.getXPos() * 100 + 25, wKnight1.getYPos() * 100, wKnight1.getWIDTH(), wKnight1.getHEIGHT());
                        this.add(wKnight1Image);
                        wKnight1Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Knight && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(wKnight1Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Bishop && !wBishop1Rendered) {
                        wBishop1Image.setIcon(wBishop1ImageIcon);
                        wBishop1Image.setBounds(wBishop1.getXPos() * 100 + 25, wBishop1.getYPos() * 100, wBishop1.getWIDTH(), wBishop1.getHEIGHT());
                        this.add(wBishop1Image);
                        wBishop1Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Bishop && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(wBishop1Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof King && !wKingRendered) {
                        wKingImage.setIcon(wKingImageIcon);
                        wKingImage.setBounds(wKing.getXPos() * 100 + 25, wKing.getYPos() * 100, wKing.getWIDTH(), wKing.getHEIGHT());
                        this.add(wKingImage);
                        wKingRendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof King && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(wKingImage);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Queen && !wQueenRendered) {
                        wQueenImage.setIcon(wQueenImageIcon);
                        wQueenImage.setBounds(wQueen.getXPos() * 100 + 25, wQueen.getYPos() * 100, wQueen.getWIDTH(), wQueen.getHEIGHT());
                        this.add(wQueenImage);
                        wQueenRendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Queen && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(wQueenImage);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Bishop && !wBishop2Rendered) {
                        wBishop2Image.setIcon(wBishop2ImageIcon);
                        wBishop2Image.setBounds(wBishop2.getXPos() * 100 + 25, wBishop2.getYPos() * 100, wBishop2.getWIDTH(), wBishop2.getHEIGHT());
                        this.add(wBishop2Image);
                        wBishop2Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Bishop && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 2) {
                        this.remove(wBishop2Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Knight && !wKnight2Rendered) {    
                        wKnight2Image.setIcon(wKnight2ImageIcon);
                        wKnight2Image.setBounds(wKnight2.getXPos() * 100 + 25, wKnight2.getYPos() * 100, wKnight2.getWIDTH(), wKnight2.getHEIGHT());
                        this.add(wKnight2Image);
                        wKnight2Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Knight && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 2) {
                        this.remove(wKnight2Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Rook && !wRook2Rendered) {    
                        wRook2Image.setIcon(wRook2ImageIcon);
                        wRook2Image.setBounds(wRook2.getXPos() * 100 + 25, wRook2.getYPos() * 100, wRook2.getWIDTH(), wRook2.getHEIGHT());
                        this.add(wRook2Image);
                        wRook2Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Rook && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 2) {
                        this.remove(wRook2Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !wPawn1Rendered) {
                        wPawn1Image.setIcon(wPawn1ImageIcon);
                        wPawn1Image.setBounds(wPawn1.getXPos() * 100 + 25, wPawn1.getYPos() * 100, wPawn1.getWIDTH(), wPawn1.getHEIGHT());
                        this.add(wPawn1Image);
                        wPawn1Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(wPawn1Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !wPawn2Rendered) {    
                        wPawn2Image.setIcon(wPawn2ImageIcon);
                        wPawn2Image.setBounds(wPawn2.getXPos() * 100 + 25, wPawn2.getYPos() * 100, wPawn2.getWIDTH(), wPawn2.getHEIGHT());
                        this.add(wPawn2Image);
                        wPawn2Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 2) {
                        this.remove(wPawn2Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !wPawn3Rendered) {    
                        wPawn3Image.setIcon(wPawn3ImageIcon);
                        wPawn3Image.setBounds(wPawn3.getXPos() * 100 + 25, wPawn3.getYPos() * 100, wPawn3.getWIDTH(), wPawn3.getHEIGHT());
                        this.add(wPawn3Image);
                        wPawn3Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 3) {
                        this.remove(wPawn3Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !wPawn4Rendered) {   
                        wPawn4Image.setIcon(wPawn4ImageIcon);
                        wPawn4Image.setBounds(wPawn4.getXPos() * 100 + 25, wPawn4.getYPos() * 100, wPawn4.getWIDTH(), wPawn4.getHEIGHT());
                        this.add(wPawn4Image);
                        wPawn4Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 4) {
                        this.remove(wPawn4Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !wPawn5Rendered) {
                        wPawn5Image.setIcon(wPawn5ImageIcon);
                        wPawn5Image.setBounds(wPawn5.getXPos() * 100 + 25, wPawn5.getYPos() * 100, wPawn5.getWIDTH(), wPawn5.getHEIGHT());
                        this.add(wPawn5Image);
                        wPawn5Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 5) {
                        this.remove(wPawn5Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !wPawn6Rendered) {
                        wPawn6Image.setIcon(wPawn6ImageIcon);
                        wPawn6Image.setBounds(wPawn6.getXPos() * 100 + 25, wPawn6.getYPos() * 100, wPawn6.getWIDTH(), wPawn6.getHEIGHT());
                        this.add(wPawn6Image);
                        wPawn6Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 6) {
                        this.remove(wPawn6Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !wPawn7Rendered) {
                        wPawn7Image.setIcon(wPawn7ImageIcon);
                        wPawn7Image.setBounds(wPawn7.getXPos() * 100 + 25, wPawn7.getYPos() * 100, wPawn7.getWIDTH(), wPawn7.getHEIGHT());
                        this.add(wPawn7Image);
                        wPawn7Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 7) {
                        this.remove(wPawn7Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !wPawn8Rendered) {    
                        wPawn8Image.setIcon(wPawn8ImageIcon);
                        wPawn8Image.setBounds(wPawn8.getXPos() * 100 + 25, wPawn8.getYPos() * 100, wPawn8.getWIDTH(), wPawn8.getHEIGHT());
                        this.add(wPawn8Image);
                        wPawn8Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("W") && peiceArr[i][j].getPeiceNumber() == 8) {
                        this.remove(wPawn8Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Rook && !bRook1Rendered) {    
                        bRook1Image.setIcon(bRook1ImageIcon);
                        bRook1Image.setBounds(bRook1.getXPos() * 100 + 25, bRook1.getYPos() * 100, bRook1.getWIDTH(), bRook1.getHEIGHT());
                        this.add(bRook1Image);
                        bRook1Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Rook && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(bRook1Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Knight && !bKnight1Rendered) {    
                        bKnight1Image.setIcon(bKnight1ImageIcon);
                        bKnight1Image.setBounds(bKnight1.getXPos() * 100 + 25, bKnight1.getYPos() * 100, bKnight1.getWIDTH(), bKnight1.getHEIGHT());
                        this.add(bKnight1Image);
                        bKnight1Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Knight && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(bKnight1Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Bishop && !bBishop1Rendered) {    
                        bBishop1Image.setIcon(bBishop1ImageIcon);
                        bBishop1Image.setBounds(bBishop1.getXPos() * 100 + 25, bBishop1.getYPos() * 100, bBishop1.getWIDTH(), bBishop1.getHEIGHT());
                        this.add(bBishop1Image);
                        bBishop1Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Bishop && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(bBishop1Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Queen && !bQueenRendered) {    
                        bQueenImage.setIcon(bQueenImageIcon);
                        bQueenImage.setBounds(bQueen.getXPos() * 100 + 25, bQueen.getYPos() * 100, bQueen.getWIDTH(), bQueen.getHEIGHT());
                        this.add(bQueenImage);
                        bQueenRendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Queen && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(bQueenImage);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof King && !bKingRendered) {    
                        bKingImage.setIcon(bKingImageIcon);
                        bKingImage.setBounds(bKing.getXPos() * 100 + 25, bKing.getYPos() * 100, bKing.getWIDTH(), bKing.getHEIGHT());
                        this.add(bKingImage);
                        bKingRendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof King && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(bKingImage);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Bishop && !bBishop2Rendered) {    
                        bBishop2Image.setIcon(bBishop2ImageIcon);
                        bBishop2Image.setBounds(bBishop2.getXPos() * 100 + 25, bBishop2.getYPos() * 100, bBishop2.getWIDTH(), bBishop2.getHEIGHT());
                        this.add(bBishop2Image);
                        bBishop2Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Bishop && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 2) {
                        this.remove(bBishop2Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Knight && !bKnight2Rendered) {    
                        bKnight2Image.setIcon(bKnight2ImageIcon);
                        bKnight2Image.setBounds(bKnight2.getXPos() * 100 + 25, bKnight2.getYPos() * 100, bKnight2.getWIDTH(), bKnight2.getHEIGHT());
                        this.add(bKnight2Image);
                        bKnight2Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Knight && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 2) {
                        this.remove(bKnight2Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Rook && !bRook2Rendered) {    
                        bRook2Image.setIcon(bRook2ImageIcon);
                        bRook2Image.setBounds(bRook2.getXPos() * 100 + 25, bRook2.getYPos() * 100, bRook2.getWIDTH(), bRook2.getHEIGHT());
                        this.add(bRook2Image);
                        bRook2Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Rook && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 2) {
                        this.remove(bRook2Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !bPawn1Rendered) {    
                        bPawn1Image.setIcon(bPawn1ImageIcon);
                        bPawn1Image.setBounds(bPawn1.getXPos() * 100 + 25, bPawn1.getYPos() * 100, bPawn1.getWIDTH(), bPawn1.getHEIGHT());
                        this.add(bPawn1Image);
                        bPawn1Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender()  && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 1) {
                        this.remove(bPawn1Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !bPawn2Rendered) {    
                        bPawn2Image.setIcon(bPawn2ImageIcon);
                        bPawn2Image.setBounds(bPawn2.getXPos() * 100 + 25, bPawn2.getYPos() * 100, bPawn2.getWIDTH(), bPawn2.getHEIGHT());
                        this.add(bPawn2Image);
                        bPawn2Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 2) {
                        this.remove(bPawn2Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !bPawn3Rendered) {    
                        bPawn3Image.setIcon(bPawn3ImageIcon);
                        bPawn3Image.setBounds(bPawn3.getXPos() * 100 + 25, bPawn3.getYPos() * 100, bPawn3.getWIDTH(), bPawn3.getHEIGHT());
                        this.add(bPawn3Image);
                        bPawn3Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 3) {
                        this.remove(bPawn3Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !bPawn4Rendered) {    
                        bPawn4Image.setIcon(bPawn4ImageIcon);
                        bPawn4Image.setBounds(bPawn4.getXPos() * 100 + 25, bPawn4.getYPos() * 100, bPawn4.getWIDTH(), bPawn4.getHEIGHT());
                        this.add(bPawn4Image);
                        bPawn4Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 4) {
                        this.remove(bPawn4Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !bPawn5Rendered) {
                        bPawn5Image.setIcon(bPawn5ImageIcon);
                        bPawn5Image.setBounds(bPawn5.getXPos() * 100 + 25, bPawn5.getYPos() * 100, bPawn5.getWIDTH(), bPawn5.getHEIGHT());
                        this.add(bPawn5Image);
                        bPawn5Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 5) {
                        this.remove(bPawn5Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !bPawn6Rendered) {
                        bPawn6Image.setIcon(bPawn6ImageIcon);
                        bPawn6Image.setBounds(bPawn6.getXPos() * 100 + 25, bPawn6.getYPos() * 100, bPawn6.getWIDTH(), bPawn6.getHEIGHT());
                        this.add(bPawn6Image);
                        bPawn6Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender()  && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 6) {
                        this.remove(bPawn6Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !bPawn7Rendered) {    
                        bPawn7Image.setIcon(bPawn7ImageIcon);
                        bPawn7Image.setBounds(bPawn7.getXPos() * 100 + 25, bPawn7.getYPos() * 100, bPawn7.getWIDTH(), bPawn7.getHEIGHT());
                        this.add(bPawn7Image);
                        bPawn7Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 7) {
                        this.remove(bPawn7Image);
                    }

                    if (peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && !bPawn8Rendered) {    
                        bPawn8Image.setIcon(bPawn8ImageIcon);
                        bPawn8Image.setBounds(bPawn8.getXPos() * 100 + 25, bPawn8.getYPos() * 100, bPawn8.getWIDTH(), bPawn8.getHEIGHT());
                        this.add(bPawn8Image);
                        bPawn8Rendered = true;
                    } else if (!peiceArr[i][j].getShouldRender() && peiceArr[i][j] instanceof Pawn && peiceArr[i][j].getColor().equals("B") && peiceArr[i][j].getPeiceNumber() == 8) {
                        this.remove(bPawn8Image);
                    }
                }
            }

            //        if (!wRook1Rendered) {
            //     wRook1Image.setIcon(emptyImageIcon);
            // } else if (!wKnight1Rendered) {
            //     wKnight1Image.setIcon(emptyImageIcon);
            // } else if (!wBishop1Rendered) {
            //     wBishop1Image.setIcon(emptyImageIcon);
            // } else if (!wQueenRendered) {
            //     wQueenImage.setIcon(emptyImageIcon);
            // } else if (!wKingRendered) {
            //     wKingImage.setIcon(emptyImageIcon);
            // } else if (!wBishop2Rendered) {
            //     wBishop2Image.setIcon(emptyImageIcon);
            // } else if (!wKnight2Rendered) {
            //     wKnight2Image.setIcon(emptyImageIcon);
            // } else if (!wRook2Rendered) {
            //     wRook2Image.setIcon(emptyImageIcon);
            // }

            //   else if (!wPawn1Rendered) {
            //     wPawn1Image.setIcon(emptyImageIcon);
            // } else if (!wPawn2Rendered) {
            //     wPawn2Image.setIcon(emptyImageIcon);
            // } else if (!wPawn3Rendered) {
            //     wPawn3Image.setIcon(emptyImageIcon);
            // } else if (!wPawn4Rendered) {
            //     wPawn4Image.setIcon(emptyImageIcon);
            // } else if (!wPawn5Rendered) {
            //     wPawn5Image.setIcon(emptyImageIcon);
            // } else if (!wPawn6Rendered) {
            //     wPawn6Image.setIcon(emptyImageIcon);
            // } else if (!wPawn7Rendered) {
            //     wPawn7Image.setIcon(emptyImageIcon);
            // } else if (!wPawn8Rendered) {
            //     wPawn8Image.setIcon(emptyImageIcon);
            // }

            //   else if (!bRook1Rendered) {
            //     bRook1Image.setIcon(emptyImageIcon);
            // } else if (!bKnight1Rendered) {
            //     bKnight1Image.setIcon(emptyImageIcon);
            // } else if (!bBishop1Rendered) {
            //     bBishop1Image.setIcon(emptyImageIcon);
            // } else if (!bQueenRendered) {
            //     bQueenImage.setIcon(emptyImageIcon);
            // } else if (!bKingRendered) {
            //     bKingImage.setIcon(emptyImageIcon);
            // } else if (!bBishop2Rendered) {
            //     bBishop2Image.setIcon(emptyImageIcon);
            // } else if (!bKnight2Rendered) {
            //     bKnight2Image.setIcon(emptyImageIcon);
            // } else if (!bRook2Rendered) {
            //     bRook2Image.setIcon(emptyImageIcon);
            // }

            //   else if (!bPawn1Rendered) {
            //     bPawn1Image.setIcon(emptyImageIcon);
            // } else if (!bPawn2Rendered) {
            //     bPawn2Image.setIcon(emptyImageIcon);
            // } else if (!bPawn3Rendered) {
            //     bPawn3Image.setIcon(emptyImageIcon);
            // } else if (!bPawn4Rendered) {
            //     bPawn4Image.setIcon(emptyImageIcon);
            // } else if (!bPawn5Rendered) {
            //     bPawn5Image.setIcon(emptyImageIcon);
            // } else if (!bPawn6Rendered) {
            //     bPawn6Image.setIcon(emptyImageIcon);
            // } else if (!bPawn7Rendered) {
            //     bPawn7Image.setIcon(emptyImageIcon);
            // } else if (!bPawn8Rendered) {
            //     bPawn8Image.setIcon(emptyImageIcon);
            // }

            repaint();
        }


        // the method where movement happens, peices are rendered and most of my errors originate
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (e.getSource() == arr[i][j]){
                        System.out.println(peiceArr[j][i].getPeiceAndColor());
                        
                        if (peiceSelectedXPos != -1) {
                            if (!(peiceArr[j][i].getColor().equals(peiceArr[peiceSelectedYPos][peiceSelectedXPos].getColor()))) {
                                if (peiceArr[peiceSelectedYPos][peiceSelectedXPos].movePeice(i, j, peiceSelectedXPos, peiceSelectedYPos)) {

                                    // if (!(peiceArr[i][j] instanceof Empty)) {
                                        renderImages(peiceArr, j, i);
                                    // }

                                    peiceArr[j][i] = peiceArr[peiceSelectedYPos][peiceSelectedXPos];
                                    peiceArr[peiceSelectedYPos][peiceSelectedXPos] = new Empty(peiceSelectedXPos, peiceSelectedYPos, peiceArr);
                                    peiceArr[peiceSelectedYPos][peiceSelectedXPos] = new Empty(peiceSelectedXPos, peiceSelectedYPos, peiceArr);
                                    

                                    for (int k = 0; k < peiceArr.length; k++) {
                                        for (int l = 0; l < peiceArr.length; l++) {
                                            peiceArr[k][l].skroinkPeices(peiceArr);
                                        }
                                    }

                                    saveMove(peiceArr);
                                } else {
                                    System.out.println("You cant move here!");
                                    System.out.println("Selected square: " + peiceArr[j][i].getPeiceAndColor() + " Peice to move: " + peiceArr[peiceSelectedYPos][peiceSelectedXPos].getPeiceAndColor());
                                }
                            } else {
                                if (playerTurn.substring(0).equals(peiceArr[i][j].getColor())) {
                                    System.out.println(playerTurn.substring(0) + " " + peiceArr[i][j].getColor());
                                    peiceSelectedXPos = i;
                                    peiceSelectedYPos = j;
                                } else {
                                    System.out.println("It's not your turn!");
                                }
                                
                            }
                            peiceSelectedXPos = -1;
                        } else {
                            System.out.println("setting coords");
                            if (playerTurn.substring(0, 1).equals(peiceArr[j][i].getColor())) {
                                peiceSelectedXPos = i;
                                peiceSelectedYPos = j;
                                if (playerTurn.equals("White")) {
                                    playerTurn = "Black";
                                } else {
                                    playerTurn = "White";
                                }
                            } else {
                                System.out.println(playerTurn.substring(0, 1) + " " + peiceArr[j][i].getColor());
                            }
                            System.out.println(peiceSelectedXPos + ", " + peiceSelectedYPos);
                        }
                        for (int k = 0; k < arr.length; k++) {
                            for (int l = 0; l < arr.length; l++) {
                                arr[k][l].setText(peiceArr[l][k].getPeiceAndColor());
                            }
                        }
                        renderImages(peiceArr, j, i);

                    for (int k = 0; k < arr.length; k++) {
                        for (int l = 0; l < arr.length; l++) {
                            if (peiceArr[k][l] instanceof King) {
                                if (peiceArr[k][l].getColor().equals("W")) {
                                    wKingAlive = true;
                                } else {
                                    bKingAlive = true;
                                }
                            }
                        }
                    }

                    if (!wKingAlive) {
                        for (int k = 0; k < arr.length; k++) {
                            for (int l = 0; l < arr.length; l++){
                                arr[k][l].setEnabled(false);
                                
                            }
                        }
                        System.out.println("\n\n\n------------------------\n|     Black Wins!      |\n------------------------\n");
                    } else if (!bKingAlive) {
                        for (int k = 0; k < arr.length; k++) {
                            for (int l = 0; l < arr.length; l++){
                                arr[k][l].setEnabled(false);
                                
                            }
                        }
                        System.out.println("\n\n\n------------------------\n|     White Wins!      |\n------------------------\n");
                    } else {
                        wKingAlive = false;
                        bKingAlive = false;
                    }
                    
                }
            }
        }
    }  
}