import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 	Append Window
 */

public class AppendWindow extends JFrame {

	private JLabel appendPatientNameLabel;
	private JTextField appendPatientNameTextField;
	private JLabel appendPatientSurnameLabel;
	private JTextField appendPatientSurnameTextField;
	private JLabel appendDiseaseNameLabel;
	private JTextField appendDiseaseNameTextField;
	private JLabel appendPatientAgeLabel;
	private JTextField appendPatientAgeTextField;
	private JLabel appendPatientAllergiesLabel;
	private JTextField appendPatientAllergiesTextField;
	private JLabel appendCompanionNameLabel;
	private JTextField appendCompanionNameTextField;
	private JLabel appendTcIdLabel;
	private JTextField appendTCIdTextField;
	private JButton appendButton;
	private JButton clearButton;
	private JButton backButton;
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 300;
	
	public AppendWindow() {
		
		setTitle("Append Patient Screen");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(9, 2));
		
		appendPatientNameLabel = new JLabel("Name: ");
		appendPatientNameTextField = new JTextField();
		appendPatientSurnameLabel = new JLabel("Surname: ");
		appendPatientSurnameTextField = new JTextField();
		appendDiseaseNameLabel = new JLabel("Disease Name: ");
		appendDiseaseNameTextField = new JTextField();
		appendPatientAgeLabel = new JLabel("Patient Age: ");
		appendPatientAgeTextField = new JTextField();
		appendPatientAllergiesLabel = new JLabel("Allergies of the Patient: ");
		appendPatientAllergiesTextField = new JTextField();
		appendCompanionNameLabel = new JLabel("Companion Name: ");
		appendCompanionNameTextField = new JTextField();
		appendTcIdLabel = new JLabel("TC: ");
		appendTCIdTextField = new JTextField();
		appendButton = new JButton("Append");
		clearButton = new JButton("Clear");
		backButton = new JButton("Back");
		
		appendButton.addActionListener(new AppendButtonListener());
		clearButton.addActionListener(new ClearButtonListener());
		backButton.addActionListener(new BackButtonListener());
		
		add(appendPatientNameLabel);
		add(appendPatientNameTextField);
		add(appendPatientSurnameLabel);
		add(appendPatientSurnameTextField);
		add(appendDiseaseNameLabel);
		add(appendDiseaseNameTextField);
		add(appendPatientAgeLabel);
		add(appendPatientAgeTextField);
		add(appendPatientAllergiesLabel);
		add(appendPatientAllergiesTextField);
		add(appendCompanionNameLabel);
		add(appendCompanionNameTextField);
		add(appendTcIdLabel);
		add(appendTCIdTextField);
		add(clearButton);
		add(appendButton);
		add(backButton);
		
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
	
	private class AppendButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
	
	private class ClearButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			appendPatientNameTextField.setText("");
			appendPatientSurnameTextField.setText("");
			appendDiseaseNameTextField.setText("");
			appendPatientAgeTextField.setText("");
			appendPatientAgeTextField.setText("");
			appendPatientAllergiesTextField.setText("");
			appendCompanionNameTextField.setText("");
			appendTCIdTextField.setText("");
			
		}
	}
	
	private class BackButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			MainWindow mainWindow = new MainWindow();
			mainWindow.setVisible(true);
			setVisible(false);
		}
	}
	
}
