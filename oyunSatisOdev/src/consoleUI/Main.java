package consoleUI;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Concrete.CampaignManager;
import Concrete.DatabaseLogger;
import Concrete.GameManager;
import Concrete.UserManager;
import Concrete.ValidationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		ValidationManager mernis=new ValidationManager();
		DatabaseLogger logger=new DatabaseLogger();
		UserManager userManager=new UserManager(mernis,logger);
		GameManager gameManager=new GameManager(logger);
		CampaignManager campaignManager=new CampaignManager();
		User user1=new User(1,"Ali","Hocaoðlu","alihocaoglu@gmail.com","123456","23654328712",new Date(1995,04,23));
		Game game1=new Game(1,"CS:GO",50,"1.png","Fps oyunu 8 GB ram gerekli");
		Game game2=new Game(2,"BF 5",130,"2.png","Savaþ oyunu 4 GB ram gerekli");
		Campaign baharKampanyasi=new Campaign(1,"Bahar",20);
		
		
		
		userManager.register(user1);
		userManager.updateEmail(user1, "alihocaoglu@hotmail.com", "123456");
		userManager.delete(user1);
		userManager.showMoney(user1);
		userManager.addMoney(user1, 10);
		userManager.addMoney(user1, 5);
		userManager.showMoney(user1);
		
		gameManager.showGame(game1);
		gameManager.showGame(game2);
		gameManager.buy(user1, game1);
		userManager.addMoney(user1, 400);
		userManager.showMoney(user1);
		gameManager.buy(user1, game1);
		userManager.showMoney(user1);
		
		campaignManager.startCampaign(baharKampanyasi, game1);
		campaignManager.startCampaign(baharKampanyasi, game2);
		campaignManager.updateCampaign(baharKampanyasi, 10, game1);
		campaignManager.stopCampaign(baharKampanyasi, game1);
		
		userManager.showLiblary(user1);
		gameManager.buy(user1, game2);
		userManager.showLiblary(user1);
		
		

	}

}
