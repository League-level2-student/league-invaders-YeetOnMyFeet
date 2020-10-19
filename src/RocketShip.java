import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject{
boolean right, left, up, down;
	public RocketShip(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		speed = 10;
	}
public void draw(Graphics g) {
	 g.setColor(Color.BLUE);
     g.fillRect(x, y, width, height);
}
	
public void right() {
	if (checkMove(x+speed, y)) {
		x+=speed;
	}
}
public void left() {
	if (checkMove(x-speed, y)) {
		x-=speed;
	}
}
public void up() {
	if (checkMove(x, y-speed)) {
		y-=speed;
	}
}
public void down() {
	if (checkMove(x, y+speed)) {
		y+=speed;
	}
}

public boolean checkMove(int x, int y) {
	if (x >= LeagueInvaders.WIDTH - width || y >= LeagueInvaders.HEIGHT - height|| x<= 0 || y<= 0 ) {
		return false;
	}
	else {
		return true;
	}
}
public void update() {
	if (right) {
		right();
	}
	if (left) {
		left();
	}
	if (up) {
		up();
	}
	if (down) {
		down();
	}
}
}
