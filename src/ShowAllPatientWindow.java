import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;



public class ShowAllPatientWindow extends JFrame{

	private JList patientList;
	private JButton patientBackButton;
	private JButton patientShowButton;
	private JLabel patientLabel;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private File file = new File("//home//anil//workspace//PatientRegistration//Patients.txt");
	private final int WINDOW_WIDTH = 800;
	private final int WINDOW_HEIGTH = 600;
	
	String[] patients = {};
	
	public ShowAllPatientWindow() {
		
		setTitle("Show Screen");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		
		patientLabel = new JLabel("Patient List");
		patientList = new JList(patients);
		patientShowButton = new JButton("Show");
		patientBackButton = new JButton("Back");
		
		panel1.add(patientLabel);
		panel2.add(patientBackButton);
		panel3.add(patientShowButton);
		panel5.add(patientList);
		
		add(panel1, BorderLayout.NORTH);
		add(panel5, BorderLayout.CENTER);
		add(panel3, BorderLayout.EAST);
		add(panel2, BorderLayout.SOUTH);
	
	
		patientBackButton.addActionListener(new BackButtonListener());
		patientShowButton.addActionListener(new ShowButtonListener());
		
		setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
	
	private class BackButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			MainWindow mainWindow = new MainWindow();
			mainWindow.setVisible(true);
			setVisible(false);

		}
	}
	
	private class ShowButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			String str = "";
			int counter = 0;
			try {
				
				Scanner scanFile = new Scanner(file);
			
				while(scanFile.hasNext()) {
					
					str = scanFile.nextLine();
					patients[counter] = str;
					counter++;
				}
				scanFile.close();
			}
			catch(IOException e1) {
				
				System.out.println(e1);
			}
			
			
		
		}
	}
	
	
}
