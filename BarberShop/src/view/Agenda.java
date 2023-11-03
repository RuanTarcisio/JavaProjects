package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Agenda {

	private JFrame frame;
	private JTextField textField_Id;
	private JTextField textField_Horario;
	private JTextField textField_Data;
	private JTextField textField_Valor;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda window = new Agenda();
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
	public Agenda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1335, 974);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Agendar");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		table = new JTable();
		table.setFont(new Font("Dialog", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "CLIENTE", "SERVICO", "VALOR", "DATA", "HORARIO", "OBS."},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Id", "Cliente", "Servico", "Valor", "Data", "Horario", "Obs."
			}
		));
		table.getColumnModel().getColumn(6).setPreferredWidth(185);
		table.setBounds(331, 540, 872, 198);
		frame.getContentPane().add(table);
		btnNewButton.setBounds(713, 439, 490, 42);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(713, 240, 490, 198);
		frame.getContentPane().add(textArea);
		
		JComboBox comboBox_Servico = new JComboBox();
		comboBox_Servico.setBounds(331, 325, 180, 27);
		frame.getContentPane().add(comboBox_Servico);
		
		JComboBox comboBox_Cliente = new JComboBox();
		comboBox_Cliente.setBounds(331, 282, 180, 27);
		comboBox_Cliente.setModel(new DefaultComboBoxModel(new String[] {"Ruan", "Pedro", "Tina", "Jessica"}));
		comboBox_Cliente.setToolTipText("\n");
		frame.getContentPane().add(comboBox_Cliente);
		
		textField_Valor = new JTextField();
		textField_Valor.setBounds(331, 371, 180, 24);
		textField_Valor.setColumns(10);
		frame.getContentPane().add(textField_Valor);
		
		textField_Data = new JTextField();
		textField_Data.setBounds(331, 414, 180, 24);
		textField_Data.setColumns(10);
		frame.getContentPane().add(textField_Data);
		
		textField_Horario = new JTextField();
		textField_Horario.setBounds(331, 457, 180, 24);
		textField_Horario.setColumns(10);
		frame.getContentPane().add(textField_Horario);
		
		textField_Id = new JTextField();
		textField_Id.setBounds(331, 240, 180, 24);
		frame.getContentPane().add(textField_Id);
		textField_Id.setColumns(10);
		
		JLabel lbl_Servico = new JLabel("Serviço");
		lbl_Servico.setBounds(251, 321, 115, 31);
		lbl_Servico.setFont(new Font("Dialog", Font.BOLD, 16));
		lbl_Servico.setForeground(Color.WHITE);
		frame.getContentPane().add(lbl_Servico);
		
		JLabel lbl_Horario = new JLabel("Horario");
		lbl_Horario.setBounds(251, 450, 115, 31);
		lbl_Horario.setFont(new Font("Dialog", Font.BOLD, 16));
		lbl_Horario.setForeground(Color.WHITE);
		frame.getContentPane().add(lbl_Horario);
		
		JLabel lbl_Data = new JLabel("Data");
		lbl_Data.setBounds(251, 407, 115, 31);
		lbl_Data.setFont(new Font("Dialog", Font.BOLD, 16));
		lbl_Data.setForeground(Color.WHITE);
		frame.getContentPane().add(lbl_Data);
		
		JLabel lbl_Cliente = new JLabel("Cliente");
		lbl_Cliente.setBounds(251, 278, 115, 31);
		lbl_Cliente.setFont(new Font("Dialog", Font.BOLD, 16));
		lbl_Cliente.setForeground(Color.WHITE);
		frame.getContentPane().add(lbl_Cliente);
		
		JLabel lbl_Valor = new JLabel("Valor");
		lbl_Valor.setBounds(251, 364, 115, 31);
		lbl_Valor.setFont(new Font("Dialog", Font.BOLD, 16));
		lbl_Valor.setForeground(Color.WHITE);
		frame.getContentPane().add(lbl_Valor);
		
		JLabel lbl_id = new JLabel("Id");
		lbl_id.setBounds(251, 235, 115, 31);
		lbl_id.setFont(new Font("Dialog", Font.BOLD, 16));
		lbl_id.setForeground(Color.WHITE);
		frame.getContentPane().add(lbl_id);
		
		JLabel lblAgenda = new JLabel("AGENDA");
		lblAgenda.setBounds(634, 106, 121, 50);
		lblAgenda.setForeground(Color.WHITE);
		lblAgenda.setFont(new Font("Dialog", Font.BOLD, 28));
		frame.getContentPane().add(lblAgenda);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(147, 58, 1266, 819);
		label_1.setIcon(new ImageIcon(Agenda.class.getResource("/view/imagens/Agenda-PainelFundo.png")));
		frame.getContentPane().add(label_1);
		
		JLabel label = new JLabel("");
		label.setBounds(12, 0, 1311, 934);
		label.setIcon(new ImageIcon(Agenda.class.getResource("/view/imagens/AgendaFundo.png")));
		frame.getContentPane().add(label);
	}
}
