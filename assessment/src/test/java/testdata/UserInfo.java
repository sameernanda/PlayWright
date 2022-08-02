package testdata;

/**
 * 
 * @author samirananda
 * This class contains getter methods to access sensitive info about user and password as they are Private members.
 */
public class UserInfo {
	private final static String email = "xyz@abcd.com";
	private final static String password = "1234";
	
	public static String getEmail() {
		return email;
	}
	
	public static String getPassword() {
		return password;
	}

}
