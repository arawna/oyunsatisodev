package Concrete;

import java.util.List;

import Abstract.GameService;
import Abstract.LoggerService;
import Entities.Game;
import Entities.User;

public class GameManager implements GameService {
	private LoggerService logger;

	public GameManager(LoggerService logger) {
		this.logger = logger;
	}

	@Override
	public void buy(User user, Game game) {
		if (user.getWallet() >= game.getPrice()) {
			logger.decraseMoney(user, game.getPrice());
			List<Game> liblary=user.getLibrary();
			liblary.add(game);
			System.out.println("Say�n "+user.getFirstName()+" " + game.getName()+" Oyununu sat�n ald�n�z.");
		}
		else {
			System.out.println(user.getFirstName()+" C�zdan�n�zda yeterli para yok.");
		}

	}

	@Override
	public void showGame(Game game) {
		System.out.println("Oyun ad�: "+game.getName()+" Fiyati: "+game.getPrice()+"TL");
		
	}

	@Override
	public void rebase(User user, Game game) {
		List<Game> liblary=user.getLibrary();
		if(liblary.contains(game)) {
			liblary.remove(liblary.indexOf(game));
			logger.addMoney(user, game.getPrice()-5);
			System.out.println(user.getFirstName()+" "+game.getName()+" Oyununu 5TL kesinti ile iade ettiniz hesabiniza "+(game.getPrice()-5)+"TL eklendi");
		}
		else {
			System.out.println(user.getFirstName()+" "+game.getName()+" Oyununa sahip de�ilsiniz");
		}
	}

}
