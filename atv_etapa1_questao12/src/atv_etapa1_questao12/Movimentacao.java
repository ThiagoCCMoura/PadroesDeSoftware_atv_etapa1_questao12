package atv_etapa1_questao12;

import java.util.Calendar;

public class Movimentacao {
	private double valor;
	private Conta conta;
	private Calendar data;

	public double getEncargos() {
		return valor * 0.01;
	}

	// getters e setters

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
}
