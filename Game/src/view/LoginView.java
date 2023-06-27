package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import controller.LoginController;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class LoginView {

	private JFrame frame;
	private JTextField textField_NickName;
	private JTextField textField_Password;
	private final LoginController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JTextField getTextField_NickName() {
		return textField_NickName;
	}


	public void setTextField_NickName(JTextField textField_NickName) {
		this.textField_NickName = textField_NickName;
	}


	public JTextField getTextField_Password() {
		return textField_Password;
	}


	public void setTextField_Password(JTextField textField_Password) {
		this.textField_Password = textField_Password;
	}


	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
		controller = new LoginController(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 461);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(SystemColor.inactiveCaption);
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSignUp.setBounds(159, 319, 118, 38);
		panel.add(btnSignUp);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBackground(SystemColor.inactiveCaption);
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSignIn.setBounds(159, 259, 118, 38);
		panel.add(btnSignIn);
		
		textField_Password = new JTextField();
		textField_Password.setColumns(10);
		textField_Password.setBounds(159, 202, 118, 26);
		panel.add(textField_Password);
		
		textField_NickName = new JTextField();
		textField_NickName.setBounds(159, 138, 118, 26);
		panel.add(textField_NickName);
		textField_NickName.setColumns(10);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setForeground(Color.WHITE);
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPass.setBounds(159, 175, 103, 26);
		panel.add(lblPass);
		
		JLabel lblNickName = new JLabel("Nickname");
		lblNickName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNickName.setForeground(Color.WHITE);
		lblNickName.setBounds(159, 109, 103, 26);
		panel.add(lblNickName);
		
		JLabel lblBG = new JLabel("");
		lblBG.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBG.setIcon(new ImageIcon("C:\\Users\\RuanT\\Documents\\Simon Game\\Game\\src\\Data\\Images\\painel-login.png"));
		lblBG.setBounds(-23, 0, 434, 461);
		panel.add(lblBG);
		
		
		
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				AcessView.main(null);	
			}
		});
		
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.validation();
			}
		});
	}
}
