package co.renato.freitas.exception;

public class AccountAlreadyExistException extends RuntimeException {
    public AccountAlreadyExistException(String errorMessage) {
        super(errorMessage);
    }
}
