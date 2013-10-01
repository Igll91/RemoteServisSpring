package silvio.vuk.vestigo.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="VESTIGO.PODACI")
public class Podaci implements Serializable {

	private static final long serialVersionUID = -2782264649764179511L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int ID;
	
	@Column(name = "IME")
	private String ime;
	
	@Column(name = "PREZIME")
	private String prezime;
	
	@Column(name = "TEL")
	private String tel;
	
	@ManyToOne
    @JoinColumn(name="MJESTO")
	private Mjesto mjesto;
	
	public Podaci(String ime, String prezime, String tel, Mjesto mjesto)
	{
		this.ime = ime;
		this.ime = prezime;
		this.ime = tel;
		this.mjesto = mjesto;
	}
	
	public Podaci(){}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public Mjesto getMjesto() {
		return mjesto;
	}

	public void setMjesto(Mjesto mjesto) {
		this.mjesto = mjesto;
	}

	
}
