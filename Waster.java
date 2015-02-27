import java.util.*;
public class Waster {
	private String name;
	private int amount;
	private Date date;
	
	public Waster(String name, int amount, Date date) {
		this.name = name;
		this.amount = amount;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
