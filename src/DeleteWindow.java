import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 	Delete Window.
 */

public class DeleteWindow extends JFrame {

	private JLabel messageLabel;
	private JButton deleteAllButton;
	private JButton backButton;
	private File file = new File("//home//anil//workspace//PatientRegistration//Patients.txt");
	private ArrayList<String> patientArrayList = new ArrayList<String>();
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 125;
	
	public DeleteWindow() {
		
		setTitle("Patient Delete Screen");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(3, 1));
		
		messageLabel = new JLabel("Choose an operations.");
		deleteAllButton = new JButton("Delete All.");
		backButton = new JButton("Back");
		
		deleteAllButton.addActionListener(new DeleteAllButtonListener());
		backButton.addActionListener(new BackButtonListener());
		
		add(messageLabel);
		add(deleteAllButton);
		add(backButton);
		
		setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
	
	private class DeleteAllButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			file.delete();
		}
	}
	
	
	private class BackButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			MainWindow main = new MainWindow();
			main.setVisible(true);
			setVisible(false);
		}
	}
	
	public void write(ArrayList<String> arr) throws IOException {
		
		int counter = 0;
		
		PrintWriter out = new PrintWriter(new FileWriter("Patients.txt", true));
		out.append(arr.get(counter));
		out.close();
		counter++;
		
	}
	
}
