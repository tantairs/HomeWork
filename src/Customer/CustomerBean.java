package Customer;

import java.sql.Date;

import oracle.sql.CLOB;

public class CustomerBean {
	
	private int c_id;
	private String first_name;
	private String last_name;
	private String country;
	private String city;
	private String street;
	private int telephone;
	private String e_mail;
	private Date birthday;
	private String profile_Password;
	private String username;
	private CLOB photo;
	public boolean valid;
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getProfile_Password() {
		return profile_Password;
	}
	public void setProfile_Password(String profile_Password) {
		this.profile_Password = profile_Password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public CLOB getPhoto() {
		return photo;
	}
	public void setPhoto(CLOB photo) {
		this.photo = photo;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	


}
