package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void startCampaign(Campaign campaign, Game game) {
		if (game.getPrice() >= campaign.getDiscount()) {
			game.setPrice(game.getPrice() - campaign.getDiscount());
			System.out.println(
					campaign.getName() + " Kampanyas� ile " + game.getName() + " " + game.getPrice() + "TL ye d��t�");

		} else {
			System.out.println(game.getName() + " " + campaign.getName() + " Kampanayas�ndan yararlanamad�");
		}

	}

	@Override
	public void stopCampaign(Campaign campaign, Game game) {
		game.setPrice(game.getPrice()+campaign.getDiscount());
		System.out.println(campaign.getName()+" Kamapanyas� sonland� "+game.getName()+" "+game.getPrice()+"TL ye y�kseldi" );

	}

	@Override
	public void updateCampaign(Campaign campaign, int discount, Game game) {
		game.setPrice(game.getPrice()+campaign.getDiscount());
		if(game.getPrice()>=discount) {
			game.setPrice(game.getPrice()-discount);
			System.out.println(campaign.getName() + " Kampanyas� ile " + game.getName() + " " + game.getPrice() + "TL ye d��t�");
		
		}
		else {
			System.out.println(game.getName() + " " + campaign.getName() + " Kampanayas�ndan yararlanamad�");
		}
		campaign.setDiscount(discount);

	}

}
