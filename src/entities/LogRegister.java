package entities;

import java.util.Date;
import java.util.Objects;

public class LogRegister {

	private String userName;
	private Date dateRegister;

	public LogRegister(String userName, Date dateRegister) {
		this.userName = userName;
		this.dateRegister = dateRegister;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDateRegister() {
		return dateRegister;
	}

	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogRegister other = (LogRegister) obj;
		return Objects.equals(userName, other.userName);
	}

}
