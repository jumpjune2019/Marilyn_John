package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
class ConsoleReadingDemo
{
	public static int randomRow;
	   public static int randomCol;
	   
		public static void Random() {
			
			randomRow = (int) (Math.random() * 5.9); 
			randomCol = (int) (Math.random() * 5.9); 
			if (randomRow == 0) {
				randomRow+=2;
			}
			if (randomCol == 0) {
				randomCol+=2;
			}
			if (randomRow == 1) {
				randomRow++;
			}
			if (randomCol == 1) {
				randomCol++;
			}
		}
	
  public void buildGUI()
  {
	  
	Random();
	System.out.println(randomRow + " " + randomCol);  
    JPanel p = new JPanel(new GridLayout(randomRow,randomCol));
    int product = randomRow * randomCol;
    JLabel[] labels = new JLabel[product];
    int k=0;
   int m;
   int v=0;
    for(int x = 0, y = labels.length; x < y; x++)
    {
     //for labeling purposes
    	char z='A';
        v++;
      z+=k;
      m=x;
      m++;
      
      String s=Character.toString(z);
      String w=Integer.toString(m);
      String s3=s.concat(w);
      
      JButton insideButton = new JButton(s3);
      
      labels[x] = new JLabel();
      labels[x].setOpaque(true);
      labels[x].setBackground(Color.PINK);
      labels[x].setBorder(BorderFactory.createLineBorder(Color.BLACK));
      labels[x].setHorizontalAlignment(JLabel.CENTER);
      labels[x].setVerticalAlignment(JLabel.CENTER);

      labels[x].setText(labels[x].getText()+z+" "+m);
      
      labels[x].setLayout(new FlowLayout(FlowLayout.CENTER));
      labels[x].add(insideButton);
      p.add(labels[x]);
  
      //for labeling purposes
    if(v==randomCol) {     
 	   k++;
    }
  	if (v==(randomCol*2)) {
  		k++;
  	}
  	if (v==(randomCol*3)) {
  		k++;
  	}
  	if (v==(randomCol*4)) {
  		k++;
  	}
  	if (v==(randomCol*5)) {
  		k++;
  	}
  	if (v==(randomCol*6)) {
  		k++;
  	}
  	
    }
    JFrame f = new JFrame();
    f.getContentPane().add(p);
    f.setSize(500,500);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    
    Container container = f.getContentPane();
    container.add(new JLabel("Basic Matrix Demo"), BorderLayout.PAGE_START);
    container.add(new JLabel("No Seat Selected"), BorderLayout.PAGE_END);

  }
  public static void main(String[] args){new ConsoleReadingDemo().buildGUI();}
}
