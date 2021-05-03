package Concrete;

import Abstract.LoggerService;
import Entities.User;

public class DatabaseLogger implements LoggerService {

	@Override
	public void addUser(User user) {
		//databese kay�t kodlar�
		
	}

	@Override
	public void deleteUser(User user) {
		//database silme kodlar�
		
	}

	@Override
	public void updateEmail(User user,String newEmail) {
		//database update kodlar�
		user.setEmail(newEmail);
		
	}

	@Override
	public void addMoney(User user, int amount) {
		//database eri�im kodlar�
		user.setWallet(user.getWallet()+amount);
		
	}

	@Override
	public int showMoney(User user) {
		//database kodlari
		return user.getWallet();
	}

	@Override
	public void decraseMoney(User user, int amount) {
		//database kodlari
		user.setWallet(user.getWallet()-amount);
		
	}

}
