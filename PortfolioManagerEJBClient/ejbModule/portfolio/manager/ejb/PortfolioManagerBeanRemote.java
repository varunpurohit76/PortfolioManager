package portfolio.manager.ejb;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import portfolio.manager.jpa.AggStock;
import portfolio.manager.jpa.Holding;
import portfolio.manager.jpa.Portfolio;
import portfolio.manager.jpa.ReturnPortfolioValues;
import portfolio.manager.jpa.User;

@Remote
public interface PortfolioManagerBeanRemote {
	public void addUser(String fname, String lname);
	public List<User> getAllUsers();
//	public void addUser2(String fname, String lname);
	public List<Portfolio> getPortfolio();
	public void addPortfolio(int userID, String portfolioName);
	public List<Portfolio> getPortfolioByID(int portfolioID);
	public List<Holding> getHoldingsByPortfolioID(int portfolioID);
	public boolean addHolding(int portfolioID, double buyPrice, int buyQuantity, String ticker, Date buyDate);
	public int removeHolding(int holdingID);
	boolean removePortfolio(int portfolioID);
	List<AggStock> getAggHoldingsByPortfolioID(int portfolioID);
	ReturnPortfolioValues getPortfolioMetrics(int portfolioID);
	ReturnPortfolioValues getPortfolioMetricsTotal(int portfolioID);
}
