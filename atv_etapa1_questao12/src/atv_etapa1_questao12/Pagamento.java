package atv_etapa1_questao12;

public class Pagamento extends Movimentacao {
	private String favorecido;
	private String formaDePagamento;

	
	// getters e setters
	
	public String getFavorecido() {
		return favorecido;
	}
	public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
}
