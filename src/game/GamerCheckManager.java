package game;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		System.out.println("Kullan�c� do�ruland� : " + gamer.firstName);
		return true;
	}

}
