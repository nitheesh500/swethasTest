package railways;

public class NoSeatsAvailableException extends Exception {

	 public NoSeatsAvailableException() {
	        super();
	    }

	    public NoSeatsAvailableException(String message) {
	        super(message);
	    }
}
