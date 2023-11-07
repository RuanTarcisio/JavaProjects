package controller;

import java.util.ArrayList;

import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.dao.AgendamentoDAO;
import model.dao.ClienteDAO;
import model.dao.ServicoDAO;
import service.AgendaService;
import view.Agenda;

public class AgendaController {

	private final Agenda view;
	private final AgendaService agendaHelper; 
	
	public AgendaController(Agenda view) {
		this.view = view;
		this.agendaHelper = new AgendaService(view);
	}
	
	public void atualizaTabela() {
		
		AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
		ArrayList<Agendamento> listAgendamentos = agendamentoDAO.selectAll();
		
		agendaHelper.preencherTabela(listAgendamentos);
		
		
	}

	public void atualizaCliente() {
		ClienteDAO clienteDAO = new ClienteDAO();
		ArrayList<Cliente> listClientes = clienteDAO.selectAll();	
		
		agendaHelper.preencherClientes(listClientes);
		
	}

	public void atualizaServico() {
		
		ServicoDAO servicoDAO = new ServicoDAO();
		ArrayList<Servico> listServico = servicoDAO.selectAll();
		
		agendaHelper.preencherServico(listServico);
		
	}
	
public void atualizaValor() {
		
		Servico servico = agendaHelper.obterServico();
		agendaHelper.setarValor(servico.getValor());
		
	}
}
