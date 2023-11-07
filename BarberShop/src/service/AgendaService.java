package service;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeCellEditor.DefaultTextField;

import model.Agendamento;
import model.Cliente;
import model.Servico;
import view.Agenda;

public class AgendaService {

	private final Agenda view;
	public AgendaService(Agenda view) {
		this.view = view;
	}

	public void preencherTabela(ArrayList<Agendamento> listAgendamentos) {
	
		DefaultTableModel tableModel = (DefaultTableModel) view.getAgendaTable().getModel();
		tableModel.setNumRows(0);
		
		for (Agendamento agendamento : listAgendamentos) {
			tableModel.addRow(new Object[] {
					agendamento.getId(),
					agendamento.getCliente().getNome(),
					agendamento.getServico().getDescricao(),
					agendamento.getValor(),
					agendamento.getDataFormatada(),
					agendamento.getHoraFormatada(),
					agendamento.getObservacao()
			});
		}
	}

	public void preencherClientes(ArrayList<Cliente> listClientes) {
		
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBox_Cliente().getModel();
		
		
		for (Cliente cliente : listClientes) {
			comboBoxModel.addElement(cliente);
		}
	}

	public void preencherServico(ArrayList<Servico> listServico) {
		
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBox_Servico().getModel();
		
		for (Servico servico : listServico) {
			comboBoxModel.addElement(servico);
		}
	}
	
	public void setarValor(float valor) {
		view.getTextField_Valor().setText(valor+"");
	}

	public Servico obterServico() {
		return (Servico) view.getComboBox_Servico().getSelectedItem();
		
	}

}
