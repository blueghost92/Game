package game;

public class GamerSellManager implements GameSellService {

	@Override
	public void sell(Gamer gamer) {
		System.out.println("Oyun sat�ld� : " + gamer.firstName);
	}

	@Override
	public void sellWithCampaign(Gamer gamer, Campaign campaign) {
		System.out.println("Oyun sat�ld� : " + gamer.firstName + " ve kampanya uyguland� : " + campaign.campaignName);

	}

}
