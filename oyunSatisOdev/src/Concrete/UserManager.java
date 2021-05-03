package Concrete;

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
	public void register(User user) {
		if(validationManager.validateUser(user)) {
			System.out.println(user.getFirstName()+" Kayýt baþarý ile yapýldý");
			logger.addUser(user);
		}
		else {
			System.out.println("Kullanýcý bilgileri hatalý");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" Kaydýnýz silindi.");
		logger.deleteUser(user);
	}

	@Override
	public void updateEmail(User user, String newEmail, String password) {
		if(user.getPassword()==password) {
			logger.updateEmail(user, newEmail);
			System.out.println(user.getFirstName()+" Emailiniz deðiþtirildi");
		}
		else {
			System.out.println("Þifre hatalý");
		}
		
	}

	@Override
	public void addMoney(User user, int amount) {
		logger.addMoney(user, amount);
		System.out.println(user.getFirstName()+" Cüzdanýnýza "+amount+"TL eklendi");
		
	}

	@Override
	public void showMoney(User user) {
		System.out.println(user.getFirstName()+" Cüzdanýnýzda "+logger.showMoney(user)+"TL bulunuyor");
		
	}

	@Override
	public void showLiblary(User user) {
		List<Game> liblary=user.getLibrary();
		
		System.out.println("-----------");
		System.out.println(user.getFirstName()+" Kütüphanende "+liblary.size()+" Oyun var");
		
		for(Game game:liblary) {
			System.out.println(game.getName()+" Kütüphanenizde");
		}
		
	}




}
