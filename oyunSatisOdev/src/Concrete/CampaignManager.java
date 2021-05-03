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
					campaign.getName() + " Kampanyasý ile " + game.getName() + " " + game.getPrice() + "TL ye düþtü");

		} else {
			System.out.println(game.getName() + " " + campaign.getName() + " Kampanayasýndan yararlanamadý");
		}

	}

	@Override
	public void stopCampaign(Campaign campaign, Game game) {
		game.setPrice(game.getPrice()+campaign.getDiscount());
		System.out.println(campaign.getName()+" Kamapanyasý sonlandý "+game.getName()+" "+game.getPrice()+"TL ye yükseldi" );

	}

	@Override
	public void updateCampaign(Campaign campaign, int discount, Game game) {
		game.setPrice(game.getPrice()+campaign.getDiscount());
		if(game.getPrice()>=discount) {
			game.setPrice(game.getPrice()-discount);
			System.out.println(campaign.getName() + " Kampanyasý ile " + game.getName() + " " + game.getPrice() + "TL ye düþtü");
		
		}
		else {
			System.out.println(game.getName() + " " + campaign.getName() + " Kampanayasýndan yararlanamadý");
		}
		campaign.setDiscount(discount);

	}

}
