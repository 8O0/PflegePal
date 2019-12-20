package Model;

public class Medication {

    private String name;

    private String amount;
    //private LocalDate expirationDate;


    public Medication(String name, String amount) {
        this.name = name;

        this.amount = amount;
    }

    public String toString() {
        return "Name: " + super.toString() + " Amount: " + amount;
    }
}
