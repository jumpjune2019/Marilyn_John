// A simple Swing Program
import java.awt.*;
import javax.swing.*;
public class Main {
	
	static String coinFace;
	
	public static void centerAndSizeJFrameOnScreen(JFrame frm, int width, int height) {
		// set the size of the frame to half in width and height
		frm.setSize(width/2, height/2);
		// here's the part where the JFrame gets actually centered
		frm.setLocationRelativeTo(null);
	}

	public static JFrame setFrameStuff(JFrame frm, int onExit, int width, int height) {
		// this will center and size the JFrame on screen
		// it will have a height and width of half the screen
		centerAndSizeJFrameOnScreen(frm, width, height);
		frm.setDefaultCloseOperation(onExit);
		
		JPanel panel1 = new JPanel();
		
		panel1.setLayout(new FlowLayout());
		
		ButtonDemo bd = new ButtonDemo();
		bd.setButtons(panel1, "Click to Flip!", "Reset", coinFace, "Waiting...");
		frm.add(panel1);
		return frm;
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			SwingDemo demo;
			JFrame frm;
			
			public void run() {
				demo = new SwingDemo("Heads or Tails");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, JFrame.EXIT_ON_CLOSE, 400, 380);
				frm.setVisible(true);
			}
		});
	}
}