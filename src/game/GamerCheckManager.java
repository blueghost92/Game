package game;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		System.out.println("Kullanýcý doðrulandý : " + gamer.firstName);
		return true;
	}

}
