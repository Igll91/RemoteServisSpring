package silvio.vuk.vestigo.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VESTIGO.MJESTO")
public class Mjesto implements Serializable {

	private static final long serialVersionUID = -8559984336910202859L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int ID;
	
	@Column(name = "NAZIV")
	private String naziv;
	
	public Mjesto(String naziv)
	{
		this.naziv = naziv;
	}
	
	public Mjesto(){}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	

}
