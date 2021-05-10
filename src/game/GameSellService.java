package game;

public interface GameSellService {
	void sell(Gamer gamer);

	void sellWithCampaign(Gamer gamer, Campaign campaign);
}
