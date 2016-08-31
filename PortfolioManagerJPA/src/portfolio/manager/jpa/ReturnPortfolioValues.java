package portfolio.manager.jpa;

public class ReturnPortfolioValues {
	public double investedValue;
	public double currentValue;
	public double profit;
	public double sharpe;
	public double alpha;
	public double beta;
	public double valueAtRisk;
//	public ReturnPortfolioValues(double investedValue, double currentValue, double profit, double sharpe, double alpha,
//			double beta, double valueAtRisk) {
//		super();
//		this.investedValue = investedValue;
//		this.currentValue = currentValue;
//		this.profit = profit;
//		this.sharpe = sharpe;
//		this.alpha = alpha;
//		this.beta = beta;
//		this.valueAtRisk = valueAtRisk;
//	}
	public ReturnPortfolioValues() {
		super();
		this.investedValue = 0;
		this.currentValue = 0;
		this.profit = 0;
		this.sharpe = 0;
		this.alpha = 0;
		this.beta = 0;
		this.valueAtRisk = 0;
	}
	public double getInvestedValue() {
		return investedValue;
	}
	public void setInvestedValue(double investedValue) {
		this.investedValue = investedValue;
	}
	public double getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	public double getSharpe() {
		return sharpe;
	}
	public void setSharpe(double sharpe) {
		this.sharpe = sharpe;
	}
	public double getAlpha() {
		return alpha;
	}
	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}
	public double getBeta() {
		return beta;
	}
	public void setBeta(double beta) {
		this.beta = beta;
	}
	public double getValueAtRisk() {
		return valueAtRisk;
	}
	public void setValueAtRisk(double valueAtRisk) {
		this.valueAtRisk = valueAtRisk;
	}
}
