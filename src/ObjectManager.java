import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship r;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	Random ra = new Random();

	ObjectManager(Rocketship r) {
		this.r = r;

	}

	void addProjectile(Projectile p) {
		projectiles.add(p);
	}

	void addAlien() {
		aliens.add(new Alien(ra.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

	}

	void update() {
		for (Alien a : aliens) {
			a.update();
			if (a.y > LeagueInvaders.HEIGHT) {
				a.isActive = false;
			}
		}
	}

	void draw(Graphics g) {
		r.draw(g);
		for (Alien a : aliens) {
			a.draw(g);
			if (a.y > LeagueInvaders.HEIGHT)
				;
			a.isActive = false;
		}
		for (Projectile a : projectiles) {
			a.draw(g);
			if (a.y > LeagueInvaders.HEIGHT)
				;
			a.isActive = false;

		}
	}

	void purgeObjects() {
		for (Alien a : aliens) {
      if(a.isActive==false){
    	  aliens.remove(a);
      }
		}
		for (Projectile a : projectiles) {
			if(a.isActive==false) {
				projectiles.remove(a);
			}
		}

	}
}
