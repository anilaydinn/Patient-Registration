import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 	This window for login.
 */

public class LoginWindow extends JFrame {
	
	private JLabel pwLabel;
	private JLabel usernameLabel;
	private JTextField userID;
	private JPasswordField userPW;
	private JButton loginButton;
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 125;
	
	public LoginWindow() {
		
		setTitle("Login");			
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(3,2));
		
		usernameLabel = new JLabel("Username: ");
		userID = new JTextField();
		pwLabel = new JLabel("Password");
		userPW = new JPasswordField();
		loginButton = new JButton("Login");
		
		add(usernameLabel);
		add(userID);
		add(pwLabel);
		add(userPW);
		add(loginButton);
		
		loginButton.addActionListener(new LoginButtonListener());
		
		setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
	
	/*
	 	When the user click login button this method will be run.
	 */
	
	private class LoginButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			String username;
			String pw;
			username = userID.getText();
			pw = userPW.getText();
			
			if(username.equals("admin") && pw.equals("admin")) {
			
				MainWindow main1 = new MainWindow();
				main1.setVisible(true);
				setVisible(false);
			}
			else {
				
				JOptionPane.showMessageDialog(null, "Incorrect username or password.");
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		new LoginWindow();
	}
}
