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
	private final AgendaService agendaService;

	public AgendaController(Agenda view) {
		this.view = view;
		this.agendaService = new AgendaService(view);
	}

	public void atualizaTabela() {

		AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
		ArrayList<Agendamento> listAgendamentos = agendamentoDAO.selectAll();

		agendaService.preencherTabela(listAgendamentos);

	}

	public void atualizaCliente() {
		ClienteDAO clienteDAO = new ClienteDAO();
		ArrayList<Cliente> listClientes = clienteDAO.selectAll();

		agendaService.preencherClientes(listClientes);

	}

	public void atualizaServico() {

		ServicoDAO servicoDAO = new ServicoDAO();
		ArrayList<Servico> listServico = servicoDAO.selectAll();

		agendaService.preencherServico(listServico);

	}

	public void atualizaValor() {

		Servico servico = agendaService.obterServico();
		agendaService.setarValor(servico.getValor());

	}

	public void agendar() {
		Agendamento agendamento = agendaService.obterModelo();
		
		new AgendamentoDAO().insert(agendamento);
		
		atualizaTabela();
		agendaService.limparTela();
	}
}
