package play; 
import java.awt.Graphics; 
public interface Game { // Game want to this methods 
	public void move(); 
	public void checkHit(); // Game End method 
	public void addFood(); // apply the food randomly
	public void checkFood(); 
	public void playGame(); //operations performance here ,Time and food set here 
	public void draw(Graphics graphics); 
	public void gameOver(Graphics graphics); //color and font size }
}