import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import portfolio.manager.ejb.PortfolioManagerBeanRemote;
import portfolio.manager.jpa.User;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.put(Context.INITIAL_CONTEXT_FACTORY, org.jboss.naming.remote.client.InitialContextFactory.class.getName()); 
		prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		prop.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		prop.put("jboss.naming.client.ejb.context", true);

		// Create the JNDI InitialContext.
		Context context = null;
		try {
			context = new InitialContext(prop);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PortfolioManagerBeanRemote bean = (PortfolioManagerBeanRemote) context.lookup("PortfolioManager/PortfolioManagerEJB/PortfolioManagerBean!portfolio.manager.ejb.PortfolioManagerBeanRemote");
			bean.addUser("hello","mark");;
			System.out.println("----------------------");
			List<User> usr = bean.getAllUsers();
			System.out.println(usr);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}