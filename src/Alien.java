import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {
    boolean isActive=false;
	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed=1;
}
     void draw (Graphics g){
    	 g.setColor(Color.yellow);
    	 g.fillRect(x,y,width,height);
  }
	void update() {
	y+=speed;	
	}
}