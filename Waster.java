import java.util.*;
// TODO: Auto-generated Javadoc

/**
 * The Class Waster.
 */
public class Waster {
	
	/** The name. */
	private String name;
	
	/** The amount. */
	private float amount;
	
	/** The date. */
	private String date;
	
	/**
	 * Instantiates a new waster.
	 *
	 * @param name the name
	 * @param amount the amount
	 */
	public Waster(String name, float amount) {
		this.name = name;
		this.amount = amount;
		this.date = new Date().toString();
	}
	
	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	/**
	 * Update waster.
	 *
	 * @param name the name
	 * @param amount the amount
	 * @return the waster
	 */
	public Waster updateWaster(String name, float amount){
		Waster Student = new Waster(name, amount);
		return Student;
	}
}
