package dia06.model.exceptions;

public class DomainException extends RuntimeException{
    private  static final long serialVersionUND = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
