package silvio.vuk.vestigo.services;

import java.util.List;

import silvio.vuk.vestigo.pojos.Podaci;

public interface PodaciServices {

	public List<Podaci> dohvatiListuPodataka();
	
	public int dohvatiBrojPodataka();
}
