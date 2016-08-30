package portfolio.manager.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the stock database table.
 * 
 */
@Entity
@NamedQuery(name="Stock.findAll", query="SELECT s FROM Stock s")
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int recordID;

	private double close;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	private double high;

	private double low;

	private double open;

	private String ticker;

	private double volume;

	//bi-directional many-to-one association to Holding
	@OneToMany(mappedBy="stock")
	@JsonBackReference
	private List<Holding> holdings;

	public Stock() {
	}

	public int getRecordID() {
		return this.recordID;
	}

	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}

	public double getClose() {
		return this.close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getHigh() {
		return this.high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return this.low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getOpen() {
		return this.open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public double getVolume() {
		return this.volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public List<Holding> getHoldings() {
		return this.holdings;
	}

	public void setHoldings(List<Holding> holdings) {
		this.holdings = holdings;
	}

	public Holding addHolding(Holding holding) {
		getHoldings().add(holding);
		holding.setStock(this);

		return holding;
	}

	public Holding removeHolding(Holding holding) {
		getHoldings().remove(holding);
		holding.setStock(null);

		return holding;
	}

}