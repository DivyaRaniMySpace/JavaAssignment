package ConcreateClasses;

public class AppUser {
	String userName;
	UserInfo userInfo;
	ContactInfo contactInfo;
	    
	public AppUser(String userName2) {
		this.userName = userName2;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
	    sb.append("|User|").append(userName).append("|UserInfo|").append(userInfo).append("|ContactInfo|").append(contactInfo);
	    return sb.toString();
	}
	    
}
