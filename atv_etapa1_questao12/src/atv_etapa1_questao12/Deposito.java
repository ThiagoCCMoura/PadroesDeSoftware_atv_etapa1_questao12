package atv_etapa1_questao12;

public class Deposito extends Movimentacao {
	private String numeroEnvelope;

	public double getEncargos() {
		throw new RuntimeException("Depositos não sofrem encargos");
	}
// getters e setters

	public String getNumeroEnvelope() {
		return numeroEnvelope;
	}

	public void setNumeroEnvelope(String numeroEnvelope) {
		this.numeroEnvelope = numeroEnvelope;
	}
}
