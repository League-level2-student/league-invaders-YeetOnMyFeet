import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	RocketShip rocket;
	 ArrayList<Projectile>  projectiles;
	 ArrayList<Alien> aliens;
	 Random random = new Random();
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
}
