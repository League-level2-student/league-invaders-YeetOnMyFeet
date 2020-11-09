import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{
	RocketShip rocket;
	 ArrayList<Projectile>  projectiles;
	 ArrayList<Alien> aliens;
	 Random random = new Random();
	 int score = 0;
	 
public ObjectManager(RocketShip rocket) {
		// TODO Auto-generated constructor stub
		this.rocket = rocket;
		 projectiles = new  ArrayList<Projectile>();
		 aliens = new  ArrayList<Alien>();
	}

public void addProjectile(Projectile projectile) {
	  projectiles.add(projectile);
	  
}
public void addAlien() {
	aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
}
public void update() {
	for (int i = 0; i < aliens.size(); i++) {
		 Alien currentAlien = aliens.get(i);
		 currentAlien.update();
		 if (currentAlien.y > 800 ) {
			currentAlien.setIsActive(false);
		}
	
}
	for (int i = 0; i < projectiles.size(); i++) {
		 Projectile currentProjectile = projectiles.get(i);
		 currentProjectile.update();
		 if (currentProjectile.y > 800 ) {
			currentProjectile.setIsActive(false);
		}}
	checkCollision();
	purgeObjects();
}
public void draw(Graphics g) {
	rocket.draw(g);
	for (int i = 0; i < aliens.size(); i++) {
		 Alien currentAlien = aliens.get(i);
		 currentAlien.draw(g);
}
	for (int i = 0; i < projectiles.size(); i++) {
		Projectile currentProjectile = projectiles.get(i);
		 currentProjectile.draw(g);
}
}
public void purgeObjects() {
	for (int i = 0; i < aliens.size(); i++) {
		Alien currentAlien = aliens.get(i);
		if (currentAlien.isActive == false) {
			aliens.remove(i);
		}
	}
	for (int i = 0; i < projectiles.size(); i++) {
		Projectile currentProjectile = projectiles.get(i);
		if (currentProjectile.isActive == false) {
			projectiles.remove(i);
		}
	}

}
public void checkCollision() {
	for (int i = 0; i < aliens.size(); i++) {
		if (rocket.collisionBox.intersects(aliens.get(i).collisionBox)) {
			aliens.get(i).setIsActive(false);
			rocket.setIsActive(false);
			System.out.println("Alien collision");
		}
		for (int j = 0; j < projectiles.size(); j++) {
			if (aliens.get(i).collisionBox.intersects(projectiles.get(j).collisionBox)) {
				projectiles.get(j).setIsActive(false);
				aliens.get(i).setIsActive(false);
				score += 1;
				System.out.println(score);
				System.out.println("Projectile collision");
			}
		}
	}
}
public int getScore() {
	return score;
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	addAlien();
}
}
