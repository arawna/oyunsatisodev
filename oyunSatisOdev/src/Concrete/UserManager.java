package Concrete;

import java.rmi.RemoteException;
import java.util.List;

import Abstract.LoggerService;
import Abstract.UserService;
import Abstract.ValidationService;
import Entities.Game;
import Entities.User;

public class UserManager implements UserService {
	
	ValidationService validationManager;
	LoggerService logger;
	
	public UserManager(ValidationService validationManager,LoggerService logger) {
		this.validationManager=validationManager;
		this.logger=logger;
	}

	@Override
	public void register(User user) throws RemoteException {
		if(validationManager.validateUser(user)) {
			System.out.println(user.getFirstName()+" Kay�t ba�ar� ile yap�ld�");
			logger.addUser(user);
		}
		else {
			System.out.println("Kullan�c� bilgileri hatal�");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" Kayd�n�z silindi.");
		logger.deleteUser(user);
	}

	@Override
	public void updateEmail(User user, String newEmail, String password) {
		if(user.getPassword()==password) {
			logger.updateEmail(user, newEmail);
			System.out.println(user.getFirstName()+" Emailiniz de�i�tirildi");
		}
		else {
			System.out.println("�ifre hatal�");
		}
		
	}

	@Override
	public void addMoney(User user, int amount) {
		logger.addMoney(user, amount);
		System.out.println(user.getFirstName()+" C�zdan�n�za "+amount+"TL eklendi");
		
	}

	@Override
	public void showMoney(User user) {
		System.out.println(user.getFirstName()+" C�zdan�n�zda "+logger.showMoney(user)+"TL bulunuyor");
		
	}

	@Override
	public void showLiblary(User user) {
		List<Game> liblary=user.getLibrary();
		
		System.out.println("-----------");
		System.out.println(user.getFirstName()+" K�t�phanende "+liblary.size()+" Oyun var");
		
		for(Game game:liblary) {
			System.out.println(game.getName()+" K�t�phanenizde");
		}
		
	}




}
