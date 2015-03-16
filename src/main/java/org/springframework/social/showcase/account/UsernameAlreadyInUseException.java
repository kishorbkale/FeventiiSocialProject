/*
 * Author Kishor
 */
package org.springframework.social.showcase.account;

public class UsernameAlreadyInUseException extends Exception {
	public UsernameAlreadyInUseException(String username) {
		super("The username '" + username + "' is already in use.");
	}
}
