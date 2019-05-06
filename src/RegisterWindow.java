import javax.swing.*;
import java.awt.*;
import java.awt.desktop.PrintFilesEvent;
import java.awt.event.*;
import java.io.*;

/*
 	This window is register window.
 */

public class RegisterWindow extends JFrame {

	private JLabel patientNameLabel;
	private JLabel patientSurnameLabel;
	private JLabel diseaseNameLabel;
	private JRadioButton patientGenderRadioM;
	private JRadioButton patientGenderRadioF;
	private ButtonGroup bg;
	private JLabel patientAgeLabel;
	private JLabel patientAllergiesLabel;
	private JLabel companionNameLabel;
	private JLabel tcIdLabel;
	private JTextField patientNameTextField;
	private JTextField patientSurnameTextField;
	private JTextField diseaseNameTextField;
	private JTextField patientAgeTextField;
	private JTextField patientAllergiesTextField;
	private JTextField companionNameTextField;
	private JTextField tcIdTextField;
	private JButton clearButton;
	private JButton registerButton;
	private JButton backButton;
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 300;
	
	public RegisterWindow() {
		
		setTitle("Patient Registration Screen");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(10, 2));
		
		patientNameLabel = new JLabel("Name: ");
		patientNameTextField = new JTextField();
		patientSurnameLabel = new JLabel("Surname: ");
		patientSurnameTextField = new JTextField();
		diseaseNameLabel = new JLabel("Disease Name: ");
		diseaseNameTextField = new JTextField();
		patientAgeLabel = new JLabel("Patient Age: ");
		patientAgeTextField = new JTextField();
		patientGenderRadioM = new JRadioButton("Male");
		patientGenderRadioF = new JRadioButton("Female");
		bg = new ButtonGroup();
		patientAllergiesLabel = new JLabel("Allergies of the Patient");
		patientAllergiesTextField = new JTextField();
		companionNameLabel = new JLabel("Companion Name: ");
		companionNameTextField = new JTextField();
		tcIdLabel = new JLabel("TC: ");
		tcIdTextField = new JTextField();
		clearButton = new JButton("Clear");
		registerButton = new JButton("Save");
		backButton = new JButton("Back");
		
		registerButton.addActionListener(new RegisterButtonListener());
		clearButton.addActionListener(new ClearButtonListener());
		backButton.addActionListener(new BackButtonListener());
		
		
		bg.add(patientGenderRadioM);
		bg.add(patientGenderRadioF);
		
		add(patientNameLabel);
		add(patientNameTextField);
		add(patientSurnameLabel);
		add(patientSurnameTextField);
		add(diseaseNameLabel);
		add(diseaseNameTextField);
		add(patientAgeLabel);
		add(patientAgeTextField);
		add(patientAllergiesLabel);
		add(patientAllergiesTextField);
		add(companionNameLabel);
		add(companionNameTextField);
		add(tcIdLabel);
		add(tcIdTextField);
		add(patientGenderRadioM);
		add(patientGenderRadioF);
		add(clearButton);
		add(registerButton);
		add(backButton);
		
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
	
	private class RegisterButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e){
			
			Patient patient = new Patient();
			
			
			patient.setPatientName(patientNameTextField.getText());
			patient.setPatientSurname(patientSurnameTextField.getText());
			patient.setDiseaseName(diseaseNameTextField.getText());
			patient.setPatientAge(Integer.parseInt(patientAgeTextField.getText()));
			patient.setPatientAllergies(patientAllergiesTextField.getText());
			patient.setCompanionName(companionNameTextField.getText());
			patient.setTcId(tcIdTextField.getText());
			
			if(patientGenderRadioF.isSelected()) {
				
				patient.setPatientGender("Female");
			
			}
			else if(patientGenderRadioM.isSelected()) {
				
				patient.setPatientGender("Male");
			}
			
			try {
				write(patient);
			} catch (IOException e1) {
					
				System.out.println(e1);
			}
			
		}
	}
	
	private class ClearButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			patientNameTextField.setText("");
			patientSurnameTextField.setText("");
			diseaseNameTextField.setText("");
			patientAgeTextField.setText("");
			patientAllergiesTextField.setText("");
			companionNameTextField.setText("");
			tcIdTextField.setText("");
			
		}
	}
	
	private class BackButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			MainWindow main1 = new MainWindow();
			main1.setVisible(true);
			setVisible(false);
		}
	}
	
	public void write(Patient p1) throws IOException {
		
		
		PrintWriter out = new PrintWriter(new FileWriter("Patients.txt", true));
		out.append("Name: " + p1.getPatientName() + " Surname: " + p1.getPatientSurname() + " Disease Name: " + p1.getDiseaseName() + " Patient Age: " + p1.getPatientAge() + " Patient Allergies : " + p1.getPatientAllergies() + " Companion Name: " + p1.getCompanionName() + " TC: " + p1.getTcId() + " Gender: " + p1.getPatientGender() + "\n");
		out.close();
		
	}
}
