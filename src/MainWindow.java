import javax.swing.*;		//Needed for Swing classes
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;			

/*
 	This class show the main window.
 */

public class MainWindow extends JFrame {
	
	JButton buttonRegister;
	JButton buttonDelete;
	JButton buttonAppend;
	JButton showAllPatientButton;
	private final int WINDOW_WIDTH = 400;			//Window width
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
		
		setLayout(new GridLayout(2, 2));
		
		
		//Create three buttons.
		buttonRegister = new JButton("Patient Register");
		buttonAppend = new JButton("Patient Append");
		buttonDelete = new JButton("Patient Delete");
		showAllPatientButton = new JButton("Show All Patient");
		
		//Register an event listener with all 3 buttons.
		buttonRegister.addActionListener(new ButtonRegisterListener());
		buttonAppend.addActionListener(new ButtonAppendListener());
		buttonDelete.addActionListener(new ButtonDeleteListener());
		showAllPatientButton.addActionListener(new ShowAllPatientButtonListener());
		
		add(buttonRegister);
		add(buttonAppend);
		add(showAllPatientButton);
		add(buttonDelete);
		
		
		
		//Start window center of the screen.
		setLocationRelativeTo(null);
		
		//Display the window
		setVisible(true);
		
	}
	
	//Click event for register button.
	
	private class ButtonRegisterListener implements ActionListener  {
		
		public void actionPerformed(ActionEvent e) {
			
			RegisterWindow registerWindow = new RegisterWindow();
			registerWindow.setVisible(true);
			setVisible(false);
		}
	}
	
	//Click event for append button.
	
	private class ButtonAppendListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			AppendWindow appendWindow = new AppendWindow();
			appendWindow.setVisible(true);
			setVisible(false);
		}
	}
	
	//Click event for delete button.
	
	private class ButtonDeleteListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			DeleteWindow deleteWindow = new DeleteWindow();
			deleteWindow.setVisible(true);
			setVisible(false);
		}
	}
	
	private class ShowAllPatientButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			ShowAllPatientWindow showWindow = new ShowAllPatientWindow();
			showWindow.setVisible(true);
			setVisible(false);
		}
	}

}
