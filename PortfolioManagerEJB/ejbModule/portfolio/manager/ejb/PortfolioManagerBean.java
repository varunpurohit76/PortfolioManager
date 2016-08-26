package portfolio.manager.ejb;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import portfolio.manager.jpa.User;

/**
 * Session Bean implementation class PortfolioManagerBean
 */
@Stateful

@Remote(PortfolioManagerBeanRemote.class)
@Local(PortfolioManagerBeanLocal.class)
public class PortfolioManagerBean implements PortfolioManagerBeanRemote, PortfolioManagerBeanLocal {

	@PersistenceContext(unitName = "PortfolioManagerJPA-PU")
	private EntityManager em;

	public PortfolioManagerBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addUser() {
		User u = new User();
		u.setFirstName("Mark1");
		u.setLastName("Twain2");
		em.persist(u);
	}

	@Override
	public List<User> getAllUsers() {
		TypedQuery<User> query = em.createQuery("SELECT u FROM User AS u", User.class);
		List<User> users = query.getResultList();
		return users;
	}

}
