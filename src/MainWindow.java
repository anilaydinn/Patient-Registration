import javax.swing.*;		//Needed for Swing classes
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;			

/*
 	This class show the main window.
 */

public class MainWindow extends JFrame {
	
	JLabel messageLabel;
	JButton buttonRegister;
	JButton buttonDelete;
	JButton buttonAppend;
	JPanel panel;
	private final int WINDOW_WIDTH = 300;			//Window width
	private final int WINDOW_HEIGHT = 125;			//Window height
	
	/*
	 	Constructor
	 */
	
	public MainWindow() {
		
		//Title bar
		setTitle("Patient Registration Program 1.0");
		
		//Window size
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		//Specify an action for close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create a label.
		messageLabel = new JLabel("Click a button to a select operation.");
		
		//Create three buttons.
		buttonRegister = new JButton("Patient Register");
		buttonAppend = new JButton("Patient Append");
		buttonDelete = new JButton("Patient Delete");
		
		//Register an event listener with all 3 buttons.
		buttonRegister.addActionListener(new ButtonRegisterListener());
		buttonAppend.addActionListener(new ButtonAppendListener());
		buttonDelete.addActionListener(new ButtonDeleteListener());
		
		//Create a panel.
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(buttonRegister);
		panel.add(buttonAppend);
		panel.add(buttonDelete);
		
		add(panel);
		
		//Start window center of the screen.
		setLocationRelativeTo(null);
		
		//Display the window
		setVisible(true);
		
	}
	
	//Click event for register button.
	
	private class ButtonRegisterListener implements ActionListener  {
		
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
	
	//Click event for append button.
	
	private class ButtonAppendListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
	
	//Click event for delete button.
	
	private class ButtonDeleteListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
	
	
	
	/*
	//main method
	public static void main(String[] args) {
		
		new MainWindow();
	}
	*/
}
