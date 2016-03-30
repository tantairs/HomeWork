package Beneficiary;

public class BeneficiaryBean {
	
	private int b_id;
	private String a_number;
	private String a_number_beneficiary;
	private String b_bank_name;
	private String name;
	private float max_amount;
	public boolean valid;
	
	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMax_amount() {
		return max_amount;
	}

	public void setMax_amount(float max_amount) {
		this.max_amount = max_amount;
	}

	public int getB_id() {
		return b_id;
	}
	
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	
	public String getA_number() {
		return a_number;
	}
	
	public void setA_number(String a_number) {
		this.a_number = a_number;
	}
	
	public String getA_number_beneficiary() {
		return a_number_beneficiary;
	}
	
	public void setA_number_beneficiary(String a_number_beneficiary) {
		this.a_number_beneficiary = a_number_beneficiary;
	}
	
	public String getB_bank_name() {
		return b_bank_name;
	}
	
	public void setB_bank_name(String b_bank_name) {
		this.b_bank_name = b_bank_name;
	}
	
	
}