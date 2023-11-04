package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.LoginController;
import model.dao.Banco;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField_Usuario;
	private JTextField textField_Senha;
	private LoginController loginController;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		loginController = new LoginController(this);
		Banco.inicia();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 772, 934);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				loginController.entrarNoSistema();
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 26));
		btnNewButton.setBounds(318, 490, 169, 55);
		frame.getContentPane().add(btnNewButton);
		
		textField_Senha = new JTextField();
		textField_Senha.setColumns(10);
		textField_Senha.setBounds(318, 410, 169, 48);
		frame.getContentPane().add(textField_Senha);
		
		textField_Usuario = new JTextField();
		textField_Usuario.setBounds(318, 325, 169, 44);
		frame.getContentPane().add(textField_Usuario);
		textField_Usuario.setColumns(10);
		
		JLabel lbl_Senha = new JLabel("Senha:");
		lbl_Senha.setForeground(SystemColor.text);
		lbl_Senha.setFont(new Font("Dialog", Font.BOLD, 18));
		lbl_Senha.setBackground(Color.BLACK);
		lbl_Senha.setBounds(356, 363, 131, 55);
		frame.getContentPane().add(lbl_Senha);
		
		JLabel lbl_Usuario = new JLabel("Usuario:");
		lbl_Usuario.setForeground(SystemColor.text);
		lbl_Usuario.setFont(new Font("Dialog", Font.BOLD, 18));
		lbl_Usuario.setBackground(Color.BLACK);
		lbl_Usuario.setBounds(356, 271, 131, 55);
		frame.getContentPane().add(lbl_Usuario);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 32));
		lblNewLabel_1.setBounds(343, 190, 131, 55);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label_FundoLogin = new JLabel("");
		label_FundoLogin.setIcon(new ImageIcon(Login.class.getResource("/view/imagens/painel-login.png")));
		label_FundoLogin.setBounds(189, 151, 411, 449);
		frame.getContentPane().add(label_FundoLogin);
		
		JLabel lbl_Fundo = new JLabel("");
		lbl_Fundo.setBounds(0, 0, 760, 906);
		lbl_Fundo.setIcon(new ImageIcon(Login.class.getResource("/view/imagens/Logo.jpg")));
		frame.getContentPane().add(lbl_Fundo);
	}

	public void exibeMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public JTextField getTextField_Usuario() {
		return textField_Usuario;
	}

	public void setTextField_Usuario(JTextField textField_Usuario) {
		this.textField_Usuario = textField_Usuario;
	}

	public JTextField getTextField_Senha() {
		return textField_Senha;
	}

	public void setTextField_Senha(JTextField textField_Senha) {
		this.textField_Senha = textField_Senha;
	}
	
	public void fecharTela() {
		frame.dispose();
	}
	
}
