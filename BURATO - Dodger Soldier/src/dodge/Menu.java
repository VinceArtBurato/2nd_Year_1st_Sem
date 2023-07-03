package dodge;

import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.Color;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import java.io.*;
import java.util.Scanner;

import java.awt.event.*;

public class Menu extends MouseAdapter {

    private int buttonPX = 20, buttonPY = GameWindow.HEIGHT - 80;
    private int buttonSX = GameWindow.WIDTH/2 - 75, buttonSY = GameWindow.HEIGHT - 200;
    private int bL = 130, bH = 40;

    private static DiffSetting currDiffSetting;

    public Menu() {
        currDiffSetting = new DiffSetting(DiffSetting.DIFFICULTY.EASY);
    }

    private void drawPlayButton(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(buttonPX, buttonPY, bL - 25, bH);
        g.fillRect(buttonPX + 130, buttonPY, bL + 55, bH);
        g.fillRect(buttonPX + 340, buttonPY, bL - 25, bH);

        g.setColor(Color.black);
        g.setFont(g.getFont().deriveFont(20f));
        g.drawString("Play", buttonPX + 30, buttonPY + 25);
        g.drawString("Game Mechanics", buttonPX + 145, buttonPY + 25);
        g.drawString("Exit", buttonPX + 375, buttonPY + 25);

        g.drawImage(GameWindow.gameUtil.setting, 410, 30, 32, 32, null);
        g.drawImage(GameWindow.gameUtil.question, 40, 30, 32, 32, null);
        g.drawImage(GameWindow.gameUtil.title, 25, 0, 438, 570, null);

        g.setFont(g.getFont().deriveFont(15f));
        g.drawString("How to Play", 20, 80);
        if(currDiffSetting.getDiff() == DiffSetting.DIFFICULTY.EASY) {
            g.drawString("Difficulty : Easy", 370, 80);
        }
        else if(currDiffSetting.getDiff() == DiffSetting.DIFFICULTY.MEDIUM) {
            g.drawString("Difficulty : Medium", 360, 80);
        }
        else if(currDiffSetting.getDiff() == DiffSetting.DIFFICULTY.HARD) {
            g.drawString("Difficulty : Hard", 370, 80);
        }
    }

    private void drawSettingButton(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(buttonSX, buttonSY - 200, bL, bH);
        g.fillRect(buttonSX, buttonSY - 150 , bL, bH);
        g.fillRect(buttonSX, buttonSY - 100, bL, bH);

        g.setColor(Color.black);
        g.setFont(g.getFont().deriveFont(20f));
        g.drawString("Easy", buttonSX + 40, buttonSY - 175);
        g.drawString("Medium", buttonSX + 25, buttonSY - 125);
        g.drawString("Hard", buttonSX + 40, buttonSY - 75);
        g.drawImage(GameWindow.gameUtil.close, GameWindow.WIDTH - 40, 15, 16, 16, null);
        g.drawImage(GameWindow.gameUtil.dt, 115, 70, 270, 49, null);
    }
    
    private void drawQuestionButton(Graphics g) {
    	g.drawImage(GameWindow.gameUtil.htp, 30, 200, 425, 115, null);
    	g.drawImage(GameWindow.gameUtil.htpTitle, 50, 70, 390, 53, null);
    	g.drawImage(GameWindow.gameUtil.close, GameWindow.WIDTH - 40, 15, 16, 16, null);
    	
    	 g.setColor(Color.gray);
    	 g.fillRect(buttonSX, buttonSY - 100, bL, bH);
    	 g.setColor(Color.black);
    	 g.setFont(g.getFont().deriveFont(20f));
    	 g.drawString("Okay", buttonSX + 40, buttonSY - 75);
    }
    
    private void drawMechanicsButton(Graphics g) {
    	g.drawImage(GameWindow.gameUtil.gmechanics, 85, 25, 307, 34, null);
    	g.drawImage(GameWindow.gameUtil.gm, 25, 35, 438, 570, null);
    	g.drawImage(GameWindow.gameUtil.close, GameWindow.WIDTH - 40, 15, 16, 16, null);
    	
    	g.setColor(Color.gray);
    	g.fillRect(buttonPX + 155, buttonPY, bL, bH);
    	g.setColor(Color.black);
        g.setFont(g.getFont().deriveFont(20f));
    	g.drawString("Okay", buttonPX + 195, buttonPY + 25);
    }

    public boolean mouseOver(int mx, int my, int x, int y, int w, int h) {
        if(mx >= x && mx <= x + w) {
            if(my >= y && my <= y + h) {
                return true;
            }
        }
        return false;
    }

    public void mousePressed(MouseEvent e) {
        if(GameWindow.currState == GameWindow.STATE.MENU) {
            if(mouseOver(e.getX(), e.getY(), buttonPX, buttonPY, bL, bH)) {
                if(GameWindow.game == null) {
                    GameWindow.game = new Game(currDiffSetting);
                    GameWindow.updateTime = currDiffSetting.getUpdateTime();
                    GameWindow.currState = GameWindow.STATE.GAME;
                }
                System.out.println("mousePressed() : Play Button Clicked");
            }
            else if(mouseOver(e.getX(), e.getY(), buttonPX + 145, buttonPY, bL, bH)) {
                GameWindow.currState = GameWindow.STATE.MECHANICS;
                System.out.println("mousePressed() : Game Mechanics Button Clicked");
            }
            else if(mouseOver(e.getX(), e.getY(), buttonPX + 340, buttonPY, bL, bH)) {
                System.out.println("mousePressed() : Exit Button Clicked");
                System.exit(0);
            }
            else if(mouseOver(e.getX(), e.getY(), 425, 30, 32, 32)) {
                System.out.println("mousePressed() : Setting Button Clicked");
                GameWindow.currState = GameWindow.STATE.SETTING;
            }
            else if(mouseOver(e.getX(), e.getY(), 40, 30, 32, 32)) {
                System.out.println("mousePressed() : Question Button Clicked");
                GameWindow.currState = GameWindow.STATE.QUESTION;
            }
        }
        
        else if(GameWindow.currState == GameWindow.STATE.MECHANICS) {
        	if(mouseOver(e.getX(), e.getY(), GameWindow.WIDTH - 40, 15, 16, 16)) {
        	      GameWindow.currState = GameWindow.STATE.MENU;
                System.out.println("mousePressed() : Close Button Clicked");
            }
        	else if(mouseOver(e.getX(), e.getY(), buttonPX + 155, buttonPY, bL, bH)) {
      		  GameWindow.currState = GameWindow.STATE.MENU;
                System.out.println("mousePressed() : Okay Button Clicked");
      	  }
        	
        }
        
        else if(GameWindow.currState == GameWindow.STATE.QUESTION) {
        	  if(mouseOver(e.getX(), e.getY(), GameWindow.WIDTH - 40, 15, 16, 16)) {
          	      GameWindow.currState = GameWindow.STATE.MENU;
                  System.out.println("mousePressed() : Close Button Clicked");
              }
        	  else if(mouseOver(e.getX(), e.getY(), buttonSX, buttonSY - 100, bL, bH)) {
        		  GameWindow.currState = GameWindow.STATE.MENU;
                  System.out.println("mousePressed() : Okay Button Clicked");
        	  }
        	
        }
        
        else if(GameWindow.currState == GameWindow.STATE.SETTING) {
            if(mouseOver(e.getX(), e.getY(), buttonSX, buttonSY - 200, bL, bH)) {
                currDiffSetting.setDiff(DiffSetting.DIFFICULTY.EASY);
                GameWindow.currState = GameWindow.STATE.MENU;

                System.out.println("mousePressed() : Easy Button Clicked");
            }
            else if(mouseOver(e.getX(), e.getY(), buttonSX, buttonSY - 150, bL, bH)) {
                currDiffSetting.setDiff(DiffSetting.DIFFICULTY.MEDIUM);
                GameWindow.currState = GameWindow.STATE.MENU;

                System.out.println("mousePressed() : Medium Button Clicked");
            }
            else if(mouseOver(e.getX(), e.getY(), buttonSX, buttonSY - 100, bL, bH)) {
                currDiffSetting.setDiff(DiffSetting.DIFFICULTY.HARD);
                GameWindow.currState = GameWindow.STATE.MENU;

                System.out.println("mousePressed() : Hard Button Clicked");
            }
            else if(mouseOver(e.getX(), e.getY(), GameWindow.WIDTH - 40, 15, 16, 16)) {
            	    GameWindow.currState = GameWindow.STATE.MENU;
                    System.out.println("mousePressed() : Close Button Clicked");
                }
        }
        
        else if(GameWindow.currState == GameWindow.STATE.GAME) {
            if(mouseOver(e.getX(), e.getY(), GameWindow.WIDTH - 40, 15, 16, 16)) {
                closeGame();
                System.out.println("mousePressed() : Close Button Clicked");
            }
        }
    }

    public void closeGame() {
        String scorePath = new String("Data/");
        if(currDiffSetting.getDiff() == DiffSetting.DIFFICULTY.EASY) {
            scorePath += "EasyScore.txt";
        }
        else if(currDiffSetting.getDiff() == DiffSetting.DIFFICULTY.MEDIUM) {
            scorePath += "MediumScore.txt";
        }
        else if(currDiffSetting.getDiff() == DiffSetting.DIFFICULTY.HARD) {
            scorePath += "HardScore.txt";
        }

        try {
            File file = new File(scorePath);
            FileWriter fr = new FileWriter(file, true);
            fr.write("Level-" + Long.toString(GameWindow.game.currLevel()) + " " + Long.toString(GameWindow.game.getScore()) + "\n");
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        GameWindow.currState = GameWindow.STATE.MENU;
        GameWindow.game = null;
        GameWindow.levelTimer = 0;
    }

    public void tick() {
    	
    }

    public void render(Graphics g) {
        //g.clearRect(0, 0, GameWindow.WIDTH, GameWindow.HEIGHT);

        g.setColor(Color.orange);
        g.fillRect(0, 0, GameWindow.WIDTH, GameWindow.HEIGHT);

        if(GameWindow.currState == GameWindow.STATE.MENU) {
            g.setColor(Color.black);
            g.setFont(g.getFont().deriveFont(15f));
            int linePosY = 30;

            drawPlayButton(g);
        }
        else if(GameWindow.currState == GameWindow.STATE.SETTING) {

            drawSettingButton(g);
        }
        else if(GameWindow.currState == GameWindow.STATE.QUESTION) {

            drawQuestionButton(g);
        }
        else if(GameWindow.currState == GameWindow.STATE.MECHANICS) {

        	drawMechanicsButton(g);
        }
    }
}
