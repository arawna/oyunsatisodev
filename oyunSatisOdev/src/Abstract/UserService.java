package Abstract;

import Entities.User;

public interface UserService {
	void register(User user);
	void delete(User user);
	void updateEmail(User user,String newEmail,String password);
	void addMoney(User user,int amount);
	void showMoney(User user);
	void showLiblary(User user);
	
}
