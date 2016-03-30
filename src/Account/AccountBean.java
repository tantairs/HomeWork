package Account;

import java.sql.Date;

public class AccountBean {
	
	private String a_number;
	private int c_id;
	private float amount;
	private Date opening_date;
	private Date closing_date;
	public boolean valid;
	public String getA_number() {
		return a_number;
	}
	public void setA_number(String a_number) {
		this.a_number = a_number;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Date getOpening_date() {
		return opening_date;
	}
	public void setOpening_date(Date opening_date) {
		this.opening_date = opening_date;
	}
	public Date getClosing_date() {
		return closing_date;
	}
	public void setClosing_date(Date closing_date) {
		this.closing_date = closing_date;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	
	

}
