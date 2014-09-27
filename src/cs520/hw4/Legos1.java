package cs520.hw4;
import java.awt.Color;
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
		
		
		// use nested loops to generate legos
		
		for(int rows = 1; rows <= baseLength; rows++)	
		{
			
			int blocks;
	
			System.out.println("row#" + rows);
			
			// reset x position on each iteration
			startX = 20;
			
			for(blocks = 11-rows; blocks >= 1; blocks--)
			{
				
				System.out.println(blocks);
				
				// alternate color
				if(blocks % 2 == 0) {
					System.out.println("red");
					g.setColor(Color.red);
					
				}
					
				else{
					System.out.println("blue");
					g.setColor(Color.blue);
				}
					
				
				g.fillRoundRect(startX, startY, legoWidth, legoHeight, 2, 2);
				
				// move block to left
				startX += 51;
				
			}// end inner for
			
			
			//move top row up
			startY-=20;
		}
		
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
