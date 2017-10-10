package Asignment3.Part3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginCheck extends JFrame {
	private JTextField userNameField;
	private JTextField PassField;
	private String test = "Hello World";
	JLabel lblLoginFailed;
	private String[] userName = {"Dylan", "Hamish", "Charlie", "Candy mountain"};
	private String[] password = {"Pass123", "Secret","password", "Birthday"};
	public LoginCheck() {
		getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(31, 34, 53, 14);
		getContentPane().add(lblUserName);
		
		userNameField = new JTextField();
		userNameField.setBounds(94, 31, 171, 20);
		getContentPane().add(userNameField);
		userNameField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(31, 60, 57, 14);
		getContentPane().add(lblPassword);
		
		PassField = new JTextField();
		PassField.setBounds(94, 57, 171, 20);
		getContentPane().add(PassField);
		PassField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = userNameField.getText().toString();
				String pass = PassField.getText().toString();
				if(checkLogin(checkUserName(name), checkUserPassword(pass))) {
					lblLoginFailed.setText("Login Success!");
				} else {
					lblLoginFailed.setText("Login Failed!");
				}
			}
		});
		btnLogin.setBounds(31, 83, 57, 23);
		getContentPane().add(btnLogin);
		
		lblLoginFailed = new JLabel("Login Failed");
		lblLoginFailed.setBounds(80, 146, 91, 14);
		getContentPane().add(lblLoginFailed);
	}

	public boolean checkUserName(String name) {
		for(String temp: userName) {
			if(temp.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkUserPassword(String pass) {
		for(String temp: password) {
			if(temp.equals(pass)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkLogin(boolean name, boolean pass) {
		if(name && pass) {
			return true;
		} else {
			return false;
		}
	}
}
