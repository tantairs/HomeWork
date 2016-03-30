package History;

import java.sql.Timestamp;

public class HistoryBean {
	
	private Timestamp currentLoginTime;
	private Timestamp lastLoginTime;
	private Timestamp lastPswChangeTime;
	private int wrong_login_attempt;
	private Timestamp lastLoginWrong;
	public boolean valid;
	
	public Timestamp getCurrentLoginTime() {
		return currentLoginTime;
	}
	public void setCurrentLoginTime(Timestamp currentLoginTime) {
		this.currentLoginTime = currentLoginTime;
	}
	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Timestamp getLastPswChangeTime() {
		return lastPswChangeTime;
	}
	public void setLastPswChangeTime(Timestamp lastPswChangeTime) {
		this.lastPswChangeTime = lastPswChangeTime;
	}
	public int getWrong_login_attempt() {
		return wrong_login_attempt;
	}
	public void setWrong_login_attempt(int wrong_login_attempt) {
		this.wrong_login_attempt = wrong_login_attempt;
	}
	public Timestamp getLastLoginWrong() {
		return lastLoginWrong;
	}
	public void setLastLoginWrong(Timestamp lastLoginWrong) {
		this.lastLoginWrong = lastLoginWrong;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
		

}
