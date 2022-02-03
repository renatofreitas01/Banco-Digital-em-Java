package co.renato.freitas.exception;

public class InvalidOperationException extends RuntimeException {
    public InvalidOperationException(String errorMessage) {
        super(errorMessage);
    }
}
