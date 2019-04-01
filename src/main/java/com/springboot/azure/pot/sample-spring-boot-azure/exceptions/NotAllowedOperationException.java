package com.springboot.azure.pot.sample-spring-boot-azure.exceptions;

/**
 * This exception should be thrown in all cases when a resource cannot be found
 *
 * @author romih
 */
public class NotAllowedOperationException extends RuntimeException {

    /**
     *
     * @param message the message
     */
    public NotAllowedOperationException(final String message) {
        super(message);
    }
}
