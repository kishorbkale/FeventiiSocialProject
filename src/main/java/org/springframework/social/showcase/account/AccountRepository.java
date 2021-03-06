/*
 * Author Kishor
 * 
 */
package org.springframework.social.showcase.account;

public interface AccountRepository {
	
	void createAccount(Account account) throws UsernameAlreadyInUseException;

	Account findAccountByUsername(String username);
	
}
