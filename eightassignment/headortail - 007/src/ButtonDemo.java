import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;

public class ButtonDemo implements ActionListener {
	
	JLabel jlab;
	String first;
	String reset;
	String firstMsg;
	String secondMsg;
	
	
	public void setButtons(JPanel frm, String f, String r, String fMsg, String sMsg) {
		first = f;
		reset = r;
		firstMsg = fMsg;
		secondMsg = sMsg;
		
		JButton jbtnUp = new JButton(first);
		JButton jbtnDown = new JButton(reset);
		// Add action listeners.
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);
		// Add the buttons to the content pane.
		frm.add(jbtnUp);
		frm.add(jbtnDown);
		// Create a label.
		jlab = new JLabel("Waiting...");
		// Add the label to the frame.
		frm.add(jlab);
	}
	
	// Handle button events.
	public void actionPerformed(ActionEvent ae) {
		
		int coin;
		coin = (int) (Math.random() * 2); 
			if (coin == 1){
				firstMsg = "Heads";
				}else{
				firstMsg = "Tails";
				}

		
		
		if(ae.getActionCommand().equals(first)) {
			
			jlab.setText(firstMsg);
		} 
		else {
		jlab.setText(secondMsg);
	}
	}
}
