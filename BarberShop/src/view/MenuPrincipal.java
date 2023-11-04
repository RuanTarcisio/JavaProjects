package view;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.MenuPrincipalController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final MenuPrincipalController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
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
	public MenuPrincipal() {
		initialize();
		controller = new MenuPrincipalController(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1290, 1036);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 1280, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastro");
		buttonGroup.add(mnNewMenu);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmTeste = new JMenuItem("Cliente");
		mnNewMenu.add(mntmTeste);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Servico");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Operacoes");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAgenda = new JMenuItem("Agenda");
		mntmAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.navegarParaAgenda();
			}
		});
		mntmAgenda.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/view/icons/agenda-icon.png")));
		mnNewMenu_1.add(mntmAgenda);
		
		JMenu mnNewMenu_1_1 = new JMenu("Relatorios");
		menuBar.add(mnNewMenu_1_1);
		
		JLabel lbl_fundo = new JLabel("");
		lbl_fundo.setBounds(10, 0, 1290, 996);
		lbl_fundo.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/view/imagens/fundo-MenuPrincipal.jpg")));
		frame.getContentPane().add(lbl_fundo);
	}
}
