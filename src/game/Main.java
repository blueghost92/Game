package game;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		Gamer gamer = new Gamer(1, "Umut", "�zt�rk", LocalDate.parse("1990-01-13"), "12215203460");
		gamerManager.save(gamer);

		CampaignManager campaingManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "�ok g�zel kampanya");
		campaingManager.save(campaign);

		GamerSellManager gamerSellManager = new GamerSellManager();
		gamerSellManager.sellWithCampaign(gamer, campaign);
	}

}
