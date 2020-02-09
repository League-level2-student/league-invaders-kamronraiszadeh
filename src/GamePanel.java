import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel 
     implements ActionListener,KeyListener{
JPanel p = new JPanel();
final int MENU = 0;
final int GAME = 1;
final int END = 2;
int currentState = MENU;
Font titleFont;
Font somethingFont;
Timer frameDraw;

GamePanel(){
titleFont = new Font("Arial", Font.PLAIN, 48);
somethingFont = new Font("Arial", Font.PLAIN, 30);
frameDraw = new Timer(1000/60,this);
frameDraw.start();


}

void updateMenuState() {  
	
}
void updateGameState() {  
	
}
void updateEndState()  { 
	
}

void drawMenuState(Graphics g) {  
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("LEAGUE INVADERS", 25, 100);
	g.setFont(somethingFont);
	g.setColor(Color.YELLOW);
	g.drawString("Press Enter to Start", 100, 400);
	g.setFont(somethingFont);
	g.setColor(Color.YELLOW);
	g.drawString("Press Space to See Instructions", 50, 600);
}
void drawGameState(Graphics g) {  
	
}
void drawEndState(Graphics g)  {
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("GAME OVER", 200, 100);
	g.setColor(Color.YELLOW);
	g.drawString("You Killed Enemies", 200, 100);
	g.setColor(Color.YELLOW);
	g.drawString("Press Enter to Restart", 200, 100);
	
}

@Override
public void paintComponent(Graphics g){
	if(currentState == MENU){
	    drawMenuState(g);
	}else if(currentState == GAME){
	    drawGameState(g);
	}else if(currentState == END){
	    drawEndState(g);
	}
	

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(currentState == MENU){
	    updateMenuState();
	}else if(currentState == GAME){
	    updateGameState();
	}else if(currentState == END){
	    updateEndState();
	}
	System.out.println("action");
	repaint();
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	    if (currentState == END) {
	        currentState = MENU;
	    } else {
	        currentState++;
	    }
	}
	if (currentState==GAME) {
	    	
	
	if (e.getKeyCode()==KeyEvent.VK_UP) {
	        System.out.println("UP");
    }  
	}
	if (currentState==GAME) {
    	
		
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		        System.out.println("DOWN");
	    }  
		}
	if (currentState==GAME) {
    	
		
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		        System.out.println("RIGHT");
	    }  
		}
	if (currentState==GAME) {
    	
		
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		        System.out.println("LEFT");
	    }  
		}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}
