package game;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		System.out.println("Kullanıcı doğrulandı : " + gamer.firstName);
		return true;
	}

}
