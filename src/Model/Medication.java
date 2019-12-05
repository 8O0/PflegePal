package Model;

import java.time.LocalDate;

public class Medication {
	
	private String name;
	private String illnes;
	private int ammount;
	//private LocalDate expirationDate;
	
	
	public Medication(String name, String illnes, int ammount) {
		this.name = name;
		this.illnes = illnes;
		this.ammount = ammount;
	}

}
