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
			System.out.println("Kullan�c� kaydedildi : " + gamer.firstName);
		} else {
			System.out.println("Kullan�c� bilgileri yanl��.");
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullan�c� g�ncellendi : " + gamer.firstName);

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� silindi : " + gamer.firstName);

	}

}
