import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	 	final int MENU = 0;
	    final int GAME = 1;
	    final int END = 2;
	    int currentState = MENU;
	    Font titleFont;
	    Font titleFont2;
public GamePanel() {
	titleFont = new Font("Arial", Font.PLAIN, 48);
	titleFont2 = new Font("Times New Roman", Font.PLAIN, 32);
	    }
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}}
	
public void	 updateMenuState() { 
	
}
public void	 updateGameState() {  
	
}
public void	 updateEndState()  {  
	
}
public void drawMenuState(Graphics g) {  
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("League Invaders", 70, 100);
	g.setFont(titleFont2);
	g.drawString("Press ENTER to start", 100, 350);
	g.setFont(titleFont2);
	g.drawString("Press SPACE for instructions", 60, 550);
}
public void drawGameState(Graphics g) { 
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
}
public void drawEndState(Graphics g)  { 
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	
}
}
