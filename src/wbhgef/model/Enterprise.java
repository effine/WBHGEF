/**
 * @author  arno
 * @version	 2013-6-14  ÉÏÎç09:35:19
 */

package wbhgef.model;

public class Enterprise extends Node {
	private String address;
	private int capital;

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public String getAddress() {
		return this.address;
	}

	public int getCapital() {
		return this.capital;
	}
}