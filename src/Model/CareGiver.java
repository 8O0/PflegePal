package Model;

public class CareGiver extends Person{
	
	private String title;
	
	public CareGiver(String name, String surname, String age, String gender, String address, String title) {
		super(surname, surname, age, surname, surname);
		
		this.title = title;
		
	}

}
