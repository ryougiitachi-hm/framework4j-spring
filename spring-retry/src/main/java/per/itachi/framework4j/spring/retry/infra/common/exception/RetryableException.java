package per.itachi.framework4j.spring.retry.infra.common.exception;

/**
 * Used for retryable.
 * */
public class RetryableException extends RuntimeException{

    public RetryableException() {
        super();
    }

    public RetryableException(String message) {
        super(message);
    }

    public RetryableException(String message, Throwable cause) {
        super(message, cause);
    }
}
