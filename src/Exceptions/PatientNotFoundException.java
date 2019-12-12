package Exceptions;

public class PatientNotFoundException  extends RuntimeException{

    private static final long serialVersionUID = -7;

    public PatientNotFoundException() {}

    public PatientNotFoundException(String message){
        super(message);
    }
}
