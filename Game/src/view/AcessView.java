package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import controller.AcessController;
import dao.Connec;
import dao.UserDAO;
import model.UserGame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class AcessView {

	private JFrame frame;
	private JTextField textField_User;
	private JTextField textField_NickName;
	private JTextField textField_Pass;
	private final AcessController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcessView window = new AcessView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public JTextField getTextField_User() {
		return textField_User;
	}

	public void setTextField_User(JTextField textField_User) {
		this.textField_User = textField_User;
	}

	public JTextField getTextField_NickName() {
		return textField_NickName;
	}

	public void setTextField_NickName(JTextField textField_NickName) {
		this.textField_NickName = textField_NickName;
	}

	public JTextField getTextField_Pass() {
		return textField_Pass;
	}

	public void setTextField_Pass(JTextField textField_Pass) {
		this.textField_Pass = textField_Pass;
	}
	
	
	/**
	 * Create the application.
	 */
	public AcessView() {
		initialize();
		controller = new AcessController(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 451);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 412);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(SystemColor.textHighlight);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSave.setBounds(101, 293, 161, 68);
		panel.add(btnSave);
		
		textField_Pass = new JTextField();
		textField_Pass.setColumns(10);
		textField_Pass.setBounds(101, 236, 135, 27);
		panel.add(textField_Pass);
		
		textField_User = new JTextField();
		textField_User.setBounds(101, 105, 135, 27);
		panel.add(textField_User);
		textField_User.setColumns(10);
		
		textField_NickName = new JTextField();
		textField_NickName.setColumns(10);
		textField_NickName.setBounds(101, 169, 135, 27);
		panel.add(textField_NickName);
		
		JLabel lblNickName = new JLabel("Nickname:");
		lblNickName.setForeground(Color.BLACK);
		lblNickName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNickName.setBounds(101, 143, 116, 30);
		panel.add(lblNickName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(101, 208, 116, 30);
		panel.add(lblPassword);
		
		JLabel lblUserName = new JLabel("User name:");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUserName.setForeground(SystemColor.desktop);
		lblUserName.setBounds(101, 78, 116, 30);
		panel.add(lblUserName);
		
		JLabel lbl_BG = new JLabel("");
		lbl_BG.setIcon(new ImageIcon("C:\\Users\\RuanT\\Documents\\Simon Game\\Game\\src\\Data\\Images\\logo.png"));
		lbl_BG.setBounds(10, 11, 414, 390);
		panel.add(lbl_BG);
		
		
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.saveUser();
				
				frame.dispose();
			}
		});
		
	}

}
