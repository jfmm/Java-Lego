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
		
		for(int row = 1; row <= baseLength; row++)	
		{
			
		
			// reset x position on each iteration after first row
			switch(row)
			{
			case 2: 
				startX = 45;
				break;
			case 3:
				startX = 65;
				break;
			case 4:
				startX = 85;
				break;	
			case 5:
				startX = 115;
				break;
			case 6:
				startX = 135;
				break;
			case 7:
				startX = 165;
				break;
			case 8:
				startX = 185;
				break;
				
			case 9:
				startX = 205;
				break;
			case 10:
				startX = 228;
				break;
			}
			

			for(int blocks = 11-row; blocks <= baseLength && !(blocks == 0); blocks--)
			{
				
				// alternate color
				if(blocks % 2 == 0) 
				{
				
					g.setColor(Color.blue);
					
				}
					
				else
				{
					
					g.setColor(Color.red);
				}
					
				
				g.fillRoundRect(startX, startY, legoWidth, legoHeight, 2, 2);
				
				
				startX += 50; // move block to the right of the previous block on each row by 50px
				
			}// end inner for
			
			
			//move top row upward by 20px
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
