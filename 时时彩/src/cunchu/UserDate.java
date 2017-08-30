package cunchu;
import java.util.Arrays;

import shuxing.User;
public class UserDate {
	private User[] user=new User[1000];
	public UserDate(){
		
	}
	public User[] getUser() {
		return user;
	}
	
	public void setUser(User[] u) {
		for (int i = 0; i < user.length; i++) {
			if(i<this.user.length){
				this.user = u;
			}else{
				user=Arrays.copyOf(user, user.length+10);
				continue;
			}
		}
	}
	
}
