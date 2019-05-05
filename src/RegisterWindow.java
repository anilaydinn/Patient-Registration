import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 	This window is register window.
 */

public class RegisterWindow extends JFrame {

	private JLabel patientNameLabel;
	private JLabel patientSurnameLabel;
	private JLabel diseaseNameLabel;
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
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 300;
	
	public RegisterWindow() {
		
		setTitle("Patient Registration Screen");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(8, 2));
		
		patientNameLabel = new JLabel("Name: ");
		patientNameTextField = new JTextField();
		patientSurnameLabel = new JLabel("Surname: ");
		patientSurnameTextField = new JTextField();
		diseaseNameLabel = new JLabel("Disease Name: ");
		diseaseNameTextField = new JTextField();
		patientAgeLabel = new JLabel("Patient Age: ");
		patientAgeTextField = new JTextField();
		patientAllergiesLabel = new JLabel("Allergies of the Patient");
		patientAllergiesTextField = new JTextField();
		companionNameLabel = new JLabel("Companion Name: ");
		companionNameTextField = new JTextField();
		tcIdLabel = new JLabel("TC: ");
		tcIdTextField = new JTextField();
		clearButton = new JButton("Clear");
		registerButton = new JButton("Save");
		
		registerButton.addActionListener(new RegisterButtonListener());
		clearButton.addActionListener(new ClearButtonListener());
		
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
		add(clearButton);
		add(registerButton);
		
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
	
	private class RegisterButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
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
	
}
