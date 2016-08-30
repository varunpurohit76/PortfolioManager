package portfolio.manager.jpa;

public class AggStock {
	public java.math.BigDecimal quantity;
	public double totalprice;
	public String ticker;
	public AggStock(java.math.BigDecimal o, double totalprice, String ticker) {
		super();
		this.quantity = o;
		this.totalprice = totalprice;
		this.ticker = ticker;
	}
}