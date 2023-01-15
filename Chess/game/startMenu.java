package Chess.game;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

public class startMenu extends JFrame implements ActionListener{
    JLabel startMenuBackground = new JLabel();
    JButton startSavedGameButton = new JButton();
    JButton startNewGameButton = new JButton();
    String gameType = null;
    final int WIDTH = 800;
    final int HEIGHT = 800;

    public startMenu() {
        setBounds(0, 0, WIDTH + 13, HEIGHT + 37);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        startMenuBackground.setBounds(0, 0, WIDTH, HEIGHT);
        try { 
            ImageIcon im = new ImageIcon("Chess/assets/startMenuBackground.png");
            startMenuBackground.setIcon(im);
        } catch (Exception e) {
            System.err.println(e);
        }
        this.add(startMenuBackground);

        startNewGameButton.setBounds(WIDTH / 4, HEIGHT / 3 * 2, WIDTH / 2, HEIGHT / 6);
        try { 
            ImageIcon im = new ImageIcon("Chess/assets/startNewButton.png");
            startNewGameButton.setIcon(im);
        } catch (Exception e) {
            System.err.println(e);
        }
        this.add(startNewGameButton);
        startNewGameButton.addActionListener(this);

        startSavedGameButton.setBounds(WIDTH / 4, HEIGHT / 3, WIDTH / 2, HEIGHT / 6);
        try { 
            ImageIcon im = new ImageIcon("Chess/assets/startSaveButton.png");
            startSavedGameButton.setIcon(im);
        } catch (Exception e) {
            System.err.println(e);
        }
        this.add(startSavedGameButton);
        startSavedGameButton.addActionListener(this);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startNewGameButton){
            new Chessboard("new");
        }
        
        if (e.getSource() == startSavedGameButton){
            new Chessboard("save");
        }
    }

    public static void main(String[] args) {
        new startMenu();
    }
}
