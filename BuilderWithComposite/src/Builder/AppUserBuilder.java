package Builder;

import ConcreateClasses.AppUser;
import ConcreateClasses.ContactInfo;
import ConcreateClasses.UserInfo;

public class AppUserBuilder {
        AppUser user;
        public AppUserBuilder(String userName){
            this.user = new AppUser(userName);
        }
        public AppUserBuilder setUserBasicInfo(UserInfo info){
            user.setUserInfo(info);
            return this;
        }
        public AppUserBuilder setContactInfo(ContactInfo info){
            user.setContactInfo(info);
            return this;
        }
        public AppUser build(){
            return this.user;
        }
}
