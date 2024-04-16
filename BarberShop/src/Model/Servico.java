package Model;

public class Servico {
	private int id;
	private String descricao;
	private float valor;
	
	public Servico (int id, String descricao, float valor) {
		this.id = id;
		this.setDescricao(descricao);
		this.setValor(valor);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
