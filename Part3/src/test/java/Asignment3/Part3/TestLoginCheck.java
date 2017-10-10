package Asignment3.Part3;

import junit.framework.TestCase;

public class TestLoginCheck extends TestCase {

	private LoginCheck obj;
	
	protected void setUp() throws Exception {
		obj = new LoginCheck();
	}

	protected void tearDown() throws Exception {
		obj = null;
	}
	
	public void testLoginCheckUserName(){
		String userName = "Dylan";
		boolean result = true;
		assertEquals(result, obj.checkUserName(userName));
	}
	
	public void testLoginCheckPassword(){
		String password = "Pass123";
		boolean result = true;
		assertEquals(result, obj.checkUserPassword(password));
	}
	
	public void testLogin() {
		boolean name = true;
		boolean pass = true;
		boolean result = true;
		assertEquals(result, obj.checkLogin(name, pass));
	}
}
