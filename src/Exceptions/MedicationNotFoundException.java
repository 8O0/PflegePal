package Exceptions;

public class MedicationNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -11;

    public MedicationNotFoundException(){}

    public MedicationNotFoundException(String message){
        super(message);
    }
}
