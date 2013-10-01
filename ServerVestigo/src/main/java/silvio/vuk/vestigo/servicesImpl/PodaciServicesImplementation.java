package silvio.vuk.vestigo.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import silvio.vuk.vestigo.dao.VestigoDao;
import silvio.vuk.vestigo.pojos.Podaci;
import silvio.vuk.vestigo.services.PodaciServices;

@Service
public class PodaciServicesImplementation implements PodaciServices {

	@Autowired
	private VestigoDao vestigoDao;
	
	@Override
	public List<Podaci> dohvatiListuPodataka() {
		return vestigoDao.dohvatiListuPodataka();
	}

	@Override
	public int dohvatiBrojPodataka() {
		return vestigoDao.dohvatiBrojPodataka();
	}

}
