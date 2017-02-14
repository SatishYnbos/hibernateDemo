/**
 * 
 */
package com.src.model;

/**
 * This model will store in Database
 * 
 * @author satish
 *
 */
public class Payment {
	private int id;
	private String type;
	private double amount;

	/**
	 * 
	 */
	public Payment() {
		super();
	}

	/**
	 * @param id
	 * @param type
	 * @param amount
	 */
	private Payment(int id, String type, double amount) {
		this.id = id;
		this.type = type;
		this.amount = amount;
	}

	/**
	 * This method will create the payment with the given values and return the
	 * payment object
	 * 
	 * @param id
	 * @param type
	 * @param amount
	 * @return
	 */
	public static Payment get(int id, String type, double amount) {
		Payment payment = new Payment(id, type, amount);
		return payment;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (id != other.id)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Payment [id=" + id + ", type=" + type + ", amount=" + amount + "]";
	}
}
