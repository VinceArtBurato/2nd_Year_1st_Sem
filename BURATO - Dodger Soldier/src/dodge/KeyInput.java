package dodge;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class KeyInput extends KeyAdapter {

	static JFrame gameFrame;
	
    public KeyInput() {
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        //System.out.println("Key Pressed : " + key);

        if(key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
            Player obj = Game.player;
            obj.setImage(GameUtil.playerFL);
            if(obj.getX() - obj.getSpeedX() > 0) {
                obj.setX(obj.getX() - obj.getSpeedX());
            }
        }
        else if(key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
            Player obj = Game.player;
            obj.setImage(GameUtil.playerFR);
            if(obj.getX() + obj.getSpeedX() < GameWindow.WIDTH - obj.getSizeX()) {
                obj.setX(obj.getX() + obj.getSpeedX());
            }
        }
        
        //Paused the game
        if(key == KeyEvent.VK_SPACE) {
            Game.isPaused = true;
            JOptionPane.showMessageDialog(gameFrame, "GAME IS PAUSED \n Press Enter to resume");
        }
        if (key == KeyEvent.VK_ENTER) {
            Game.isPaused = false;
        }
    }

    public void keyReleased(KeyEvent e) {

    }
}

