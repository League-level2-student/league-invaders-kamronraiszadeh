import javax.swing.JFrame;

public class LeagueInvaders {
	public static final int WIDTH=500;
	public static final int HEIGHT = 800;
	
	JFrame frame ;
    GamePanel gp;
LeagueInvaders(){
	frame=new JFrame();
	gp=new GamePanel();
}
public static void main(String[] args) {
	LeagueInvaders vader = new LeagueInvaders();
	vader.setup();
}
void setup() {
	frame.add(gp);
	frame.setSize(WIDTH,HEIGHT);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
