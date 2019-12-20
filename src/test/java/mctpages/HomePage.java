package mctpages;

public class HomePage extends MasterPages {

	////*[@id="dLabellogin"]
	
	public void login() {
		
	
	String loginButton="dLabellogin";
	String userfield ="username";
	String passWordField="psssword";
	String clickLogin = "//*[@id='jqLogin']";
	
	
   clickOnElement(loginButton);
   typeOnElement(userfield, "user");
   typeOnElement(passWordField, "pass");
   clickOnElement(clickLogin);
}
	
	public void takeMetoRegistration() {

		String loginButton = "dLabellogin";
		String clickSignUpButtonString = "//*[@id=\"jqSignup\"]";
		clickOnElement(loginButton);
		clickOnElement(clickSignUpButtonString);

		}

		public void logOut() {
		String userNameLabel = "dLabel";
		String clickLogout = "//*[@id=\"drp_div\"]/ul/li/div/div[3]/a";
		clickOnElement(userNameLabel);
		clickOnElement(clickLogout);

		}

	}
	

