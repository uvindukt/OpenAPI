/**
 * @author uvindusanjana
 */
package com.nagarro.training.openapi.exception;

/**
 * A custom exception to be thrown by service classes
 */
public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

}
