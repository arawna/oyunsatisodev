package Abstract;

import Entities.User;

public interface LoggerService {
	void addUser(User user);
	void deleteUser(User user);
	void updateEmail(User user,String newEmail);
	void addMoney(User user,int amount);
	int showMoney(User user);
	void decraseMoney(User user,int amount);
}
