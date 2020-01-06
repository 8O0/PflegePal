package Model;

public class Medication {

    private String name;
    private String amount;
    private String comment;

    /**
     * Default Constructor
     * @param name Name
     * @param amount Medication ammount
     * @param comment Medication Info
     */
    public Medication(String name, String amount, String comment) {
        this.name = name;
        this.amount = amount;
        this.comment = comment;
    }

    /**
     * toString method for Medication
     * @return String of Medicationy
     * s
     */
    public String toString() {
        return "Name: " + name + ", Amount: " + amount + ", Additional Info: " + comment;
    }

    /**
     * Medication Name
     * @return medication name
     */
    public String getName() {
        return name;
    }
}
