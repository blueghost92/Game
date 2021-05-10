package game;

import java.time.LocalDate;

public class Gamer {
	int id;
	String firstName;
	String lastNameString;
	LocalDate dateOfBirthDate;
	String nationalityId;

	public Gamer() {
		// TODO Auto-generated constructor stub
	}

	public Gamer(int id, String firstName, String lastNameString, LocalDate dateOfBirthDate, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastNameString = lastNameString;
		this.dateOfBirthDate = dateOfBirthDate;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNameString() {
		return lastNameString;
	}

	public void setLastNameString(String lastNameString) {
		this.lastNameString = lastNameString;
	}

	public LocalDate getDateOfBirthDate() {
		return dateOfBirthDate;
	}

	public void setDateOfBirthDate(LocalDate dateOfBirthDate) {
		this.dateOfBirthDate = dateOfBirthDate;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
