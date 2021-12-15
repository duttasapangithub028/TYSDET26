package SDET26githubTest;

import org.testng.annotations.Test;

public class ReadDataFromCmd {

	@Test
	public void read() {
			String Url = System.getProperty("url");
			String Browser = System.getProperty("browser");
			String Username = System.getProperty("username");
			String Password = System.getProperty("password");
			System.out.println(Url);
			System.out.println(Browser);
			System.out.println(Username);
			System.out.println(Password);
			
	}
}
