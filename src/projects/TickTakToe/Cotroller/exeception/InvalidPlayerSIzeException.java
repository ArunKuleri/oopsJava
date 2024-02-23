package projects.TickTakToe.Cotroller.exeception;

public class InvalidPlayerSIzeException extends RuntimeException{
    public InvalidPlayerSIzeException() {
    }

    public InvalidPlayerSIzeException(String message) {
        super(message);
    }

    public InvalidPlayerSIzeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPlayerSIzeException(Throwable cause) {
        super(cause);
    }

    public InvalidPlayerSIzeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
