package cs520.hw4;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Legos1 extends JFrame
{
	int startX, startY, legoHeight, legoWidth, baseLength;
	
	/* GUI Constructor
	 * ------------------*/
	public Legos1()
	{
		super("Morales Mendizabal Application");
		
		// initialize variables 20,
		//300, 50, 20, and 10, respectively.
		startX = 20;
		startY = 300;
		legoWidth = 50;
		legoHeight = 20;
		baseLength = 10;
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		// use nested loops to generate legos
		
		
	}
	

	public static void main(String[] args) 
	{
		
		// Instantiate GUI object and set properties
		Legos1 gui = new Legos1();
		gui.setSize(550,325);
		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
