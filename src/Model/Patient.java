package Model;

public class Patient extends Person{

	private final String illness;

	public Patient(String name, String surname, String age, String illness) {
		super(name, surname, age);
		this.illness =illness;
		
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Patient patient = (Patient) o;

		return illness.equals(patient.illness);
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + illness.hashCode();
		return result;
	}
}
