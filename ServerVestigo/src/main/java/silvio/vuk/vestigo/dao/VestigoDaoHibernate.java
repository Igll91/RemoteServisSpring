package silvio.vuk.vestigo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import silvio.vuk.vestigo.pojos.Podaci;

@Repository
@Transactional
public class VestigoDaoHibernate implements VestigoDao {

	private SessionFactory factory;
	
	public VestigoDaoHibernate(SessionFactory factory)
	{
		this.factory = factory;
	}
	
	public VestigoDaoHibernate(){}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Podaci> dohvatiListuPodataka() {
		return (List<Podaci>)factory.getCurrentSession().
				createQuery("from Podaci").list();
	}

	@Override
	public int dohvatiBrojPodataka() {
		Query query = factory.getCurrentSession().createQuery("SELECT COUNT(ID) FROM Podaci");
		return (Integer) query.uniqueResult();
	}

}
