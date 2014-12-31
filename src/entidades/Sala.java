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
	
	private String Descri��o;
	
	@ManyToOne
	private Sala sala;
}
