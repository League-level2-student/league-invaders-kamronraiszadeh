import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {

	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed=10;
}
	void draw (Graphics g){
   	 g.setColor(Color.red);
   	 g.fillRect(x,y,width,height);
 }
	void update() {
		y-=speed;	
		}
}