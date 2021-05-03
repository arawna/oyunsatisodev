package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
	void startCampaign(Campaign campaign, Game game);

	void stopCampaign(Campaign campaign, Game game);

	void updateCampaign(Campaign campaign, int discount, Game game);
}
