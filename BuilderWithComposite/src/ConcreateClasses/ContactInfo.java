package ConcreateClasses;

public class ContactInfo {
	 String email;
	 String mobileNo;
	    
	 public ContactInfo(String email, String mobileNo){
		 this.email = email;
	     this.mobileNo = mobileNo;
	 }    
	    
	 public String toString(){
		 StringBuilder sb = new StringBuilder();
	     sb.append("email:mobile:").append(email).append(":").append(mobileNo);
	     return sb.toString();
	 }
}
