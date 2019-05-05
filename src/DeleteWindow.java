import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 	Delete Window.
 */

public class DeleteWindow extends JFrame {

	private JLabel messageLabel;
	private JButton deleteAllButton;
	private JButton deleteByTCButton;
	private JButton backButton;
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 125;
	
	public DeleteWindow() {
		
		setTitle("Patient Delete Screen");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(4, 1));
		
		messageLabel = new JLabel("Choose an operations.");
		deleteAllButton = new JButton("Delete All.");
		deleteByTCButton = new JButton("Delete by TC.");
		backButton = new JButton("Back");
		
		deleteAllButton.addActionListener(new DeleteAllButtonListener());
		deleteByTCButton.addActionListener(new DeleteByTcButtonListener());
		backButton.addActionListener(new BackButtonListener());
		
		add(messageLabel);
		add(deleteAllButton);
		add(deleteByTCButton);
		add(backButton);
		
		setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
	
	private class DeleteAllButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
	
	private class DeleteByTcButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
	
	private class BackButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			MainWindow main = new MainWindow();
			main.setVisible(true);
			setVisible(false);
		}
	}
}
