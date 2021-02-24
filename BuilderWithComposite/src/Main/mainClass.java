package Main;

import Builder.AppUserBuilder;
import ConcreateClasses.AppUser;
import ConcreateClasses.ContactInfo;
import ConcreateClasses.UserInfo;

public class mainClass {
	    public static void main(String args[]){
	        AppUser appUser1 = new AppUserBuilder("Ravindra").build(); // Mandatory parameters
	        UserInfo info = new UserInfo("sunrise","25-May-1975","M");
	        
	        // Build User name + Optional Basic Info 
	        AppUser appUser2 = new AppUserBuilder("Ravindra").
	                                                setUserBasicInfo(info).build();
	        
	        // Build User name + Optional Basic Info + Optional Contact Info
	        ContactInfo cInfo = new ContactInfo("xxx@xyz.com","1111111111");
	        AppUser appUser3 = new AppUserBuilder("Ravindra").
	                                                setUserBasicInfo(info).
	                                                setContactInfo(cInfo).build();
	        
	        System.out.println("Facebook user 1:"+appUser1);
	        System.out.println("Facebook user 2:"+appUser2);
	        System.out.println("Facebook user 3:"+appUser3);
	    }
	}
