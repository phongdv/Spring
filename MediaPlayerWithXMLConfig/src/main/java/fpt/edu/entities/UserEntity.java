package fpt.edu.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserEntity")
public class UserEntity {

	@Id
	private String UserName;
	private String Password;
	
	
	
	public UserEntity(String userName, String password) {
		super();
		UserName = userName;
		Password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	 @Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("User{");
	        sb.append("UserName =").append(UserName);
	        sb.append(", Password = '").append(Password).append('\'');
	        sb.append('}');
	        return sb.toString();
	    }
	
}
