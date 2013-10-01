package silvio.vuk.vestigo.dao;

import java.util.List;

import silvio.vuk.vestigo.pojos.Podaci;

public interface VestigoDao {
	
	public List<Podaci> dohvatiListuPodataka();
	
	public int dohvatiBrojPodataka();
}
