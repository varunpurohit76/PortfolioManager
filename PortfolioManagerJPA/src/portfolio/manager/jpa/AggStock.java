package portfolio.manager.jpa;

public class AggStock {
	public String ticker;
	public java.math.BigDecimal quantity;
	public double totalPrice;
	public double totalValue;
	public double pAndl;
	public double ratio;
	public AggStock(String ticker, java.math.BigDecimal quantity, double totalPrice, double totalValue, double pAndl, double ratio) {
		super();
		this.ticker = ticker;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.totalValue = totalValue;
		this.pAndl = pAndl;
		this.ratio = ratio;
	}
}