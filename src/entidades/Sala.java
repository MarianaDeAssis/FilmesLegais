package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sala {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String descri��o;
	private String cidade;
	
	@ManyToOne
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
	
	
}
