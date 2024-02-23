package projects.TickTakToe.Cotroller.exeception;

public class InvalidBotException extends RuntimeException{
    public InvalidBotException() {
    }

    public InvalidBotException(String message) {
        super(message);
    }

    public InvalidBotException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidBotException(Throwable cause) {
        super(cause);
    }

    public InvalidBotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
