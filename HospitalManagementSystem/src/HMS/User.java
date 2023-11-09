package HMS;

import java.util.Objects;

public class User {
	protected String UserName;
	protected String UserAddress;
	protected String UserPhoneNum;
	protected String UserPassword;
	protected String UserAccessType;
	public User(String userName, String userAddress, String userPhoneNum, String userPassword, String userAccessType) {
		UserName = userName;
		UserAddress = userAddress;
		UserPhoneNum = userPhoneNum;
		UserPassword = userPassword;
		UserAccessType = userAccessType;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserAddress() {
		return UserAddress;
	}
	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}
	public String getUserPhoneNum() {
		return UserPhoneNum;
	}
	public void setUserPhoneNum(String userPhoneNum) {
		UserPhoneNum = userPhoneNum;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserAccessType() {
		return UserAccessType;
	}
	public void setUserAccessType(String userAccessType) {
		UserAccessType = userAccessType;
	}
	@Override
	public int hashCode() {
		return Objects.hash(UserName, UserPassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(UserName, other.UserName) && Objects.equals(UserPassword, other.UserPassword);
	}
	
	

}
