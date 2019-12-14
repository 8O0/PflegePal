package Model;

public class Patient extends Person{

	private final String illness;

	public Patient(String name, String surname, String age, String illness) {
		super(name, surname, age);
		this.illness =illness;
		
	}

}
