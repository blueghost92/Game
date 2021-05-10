package game;

public class GamerManager implements GamerService {
	GamerCheckManager gamerCheckManager;

	public GamerManager(GamerCheckManager gamerCheckManager) {
		super();
		this.gamerCheckManager = gamerCheckManager;
	}

	@Override
	public void save(Gamer gamer) {
		if (gamerCheckManager.checkIfRealPerson(gamer)) {
			System.out.println("Kullanýcý kaydedildi : " + gamer.firstName);
		} else {
			System.out.println("Kullanýcý bilgileri yanlýþ.");
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanýcý güncellendi : " + gamer.firstName);

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanýcý silindi : " + gamer.firstName);

	}

}
