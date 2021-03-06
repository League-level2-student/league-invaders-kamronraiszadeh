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
Rocketship r = new Rocketship(250,700,50,50);
ObjectManager on = new ObjectManager(r);

GamePanel(){
titleFont = new Font("Arial", Font.PLAIN, 48);
somethingFont = new Font("Arial", Font.PLAIN, 30);
frameDraw = new Timer(1000/60,this);
frameDraw.start();


}

void updateMenuState() {  
	
}
void updateGameState() {  
	on.update();
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
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	r.draw(g);
	
	
}
void drawEndState(Graphics g)  {
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("GAME OVER", 25, 100);
	g.setFont(somethingFont);
	g.setColor(Color.YELLOW);
	g.drawString("You Killed Enemies", 50, 400);
	g.setColor(Color.YELLOW);
	g.drawString("Press Enter to Restart", 50, 600);
	
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
	        if (r.y>0) {
	        	r.up();
	        	System.out.println("up");
			}
	         
    }  
	}
	if (currentState==GAME) {
    	
		
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		        System.out.println("DOWN");
		        if(r.y+50<LeagueInvaders.HEIGHT) {
		        r.down();
	    }  
		}
	if (currentState==GAME) {
    	
		
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		        System.out.println("RIGHT");
		        if (r.x+50<LeagueInvaders.WIDTH) {
		        	r.right();
					
				}
		       
	    }  
		}
	if (currentState==GAME) {
    	
		
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		        System.out.println("LEFT");
		        if(r.x>0) {
		        r.left();
		        System.out.println("left");
	    }  
		}
		
	}}}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}
