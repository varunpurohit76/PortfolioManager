package portfolio.manager.jpa;

public class FirstScreen {
	public int portfolioID;
	public String portfolioName;
	public double investedValue;
	public double totalValue;
	public double profit;
	public FirstScreen(int portfolioID, String portfolioName, double investedValue, double totalValue, double profit) {
		super();
		this.portfolioID = portfolioID;
		this.portfolioName = portfolioName;
		this.investedValue = investedValue;
		this.totalValue = totalValue;
		this.profit = profit;
	}
}
