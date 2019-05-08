import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class ShowAllPatientWindow extends JFrame{

	private JList patientList;
	private JButton patientBackButton;
	private JButton patientShowButton;
	private JLabel patientLabel;
	private File file = new File("//home//anil//workspace//PatientRegistration//Patients.txt");
	private final int WINDOW_WIDTH = 1280;
	private final int WINDOW_HEIGTH = 720;
	private ArrayList<String> patientArrayList = new ArrayList<String>();
	
	
	public ShowAllPatientWindow() {
		
		setTitle("Show Screen");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		
		
		
		patientLabel = new JLabel("Patient List");
		patientList = new JList(patientArrayList.toArray());
		patientShowButton = new JButton("Show");
		patientBackButton = new JButton("Back");
		
		
		add(patientLabel, BorderLayout.NORTH);
		add(patientShowButton, BorderLayout.EAST);
		add(patientList, BorderLayout.CENTER);
		add(patientBackButton, BorderLayout.SOUTH);
		
	
	
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
			
			DefaultListModel DLM = new DefaultListModel();
			String str;
			int counter = 0;
			
			try {
				Scanner scanFile = new Scanner(file);
				
				while(scanFile.hasNext()) {
					
					str = scanFile.nextLine();
					patientArrayList.add(str);
					DLM.addElement(patientArrayList.get(counter));
					counter++;
				}
				
				patientList.setModel(DLM);
				
				scanFile.close();
				
			} catch (IOException e2) {
				
			}
			
			
			
			
		
		}
	}
	
	
}
