package Model;

public class Medication {

    private String name;
    private String amount;
    private String comment;

    public Medication(String name, String amount, String comment) {
        this.name = name;
        this.amount = amount;
        this.comment = comment;
    }

    public String toString() {
        return "Name: " + name + ", Amount: " + amount + ", Additional Info: " + comment;
    }

    public String getName() {
        return name;
    }
}
