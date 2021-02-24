package ConcreateClasses;

public class UserInfo {
	String name;
	String birthDate;
	String gender;
	    
	public UserInfo(String name,String date,String gender){
		this.name = name;
	    this.birthDate = date;
	    this.gender = gender;        
	}
	    
	public String toString(){
		StringBuilder sb = new StringBuilder();
	    sb.append("Name:DOB:Gender:").append(name).append(":").append(birthDate).append(":").append(gender);
	    return sb.toString();
	}
}
