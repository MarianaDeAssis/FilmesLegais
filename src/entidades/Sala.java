package entidades;

public class Sala {
	private int id;
	private String descri��o;
	private String cidade;
	private Filial filial;

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
}
