package mctpages;

import java.util.Random;

public class RegPage extends MasterPages{
	
	public void doRegistrationPage() {

		String emailField = "txtEmail";
		String userNameField = "txtUserName";
		String passwordField = "txtPassword";
		String confirmPasswordField = "txtCnfPassword";
		String firstNameField = "txtFirstName";
		String lastNameField = "txtLastName";
		String addressField = "custom_field_2";
		String clickBox = "check_news";
		String creantAccountButton = "btnRegister";

		Random random = new Random();
		int regNumber = random.nextInt(1000);

		typeOnElement(emailField,"abc"+regNumber+"gmail.com");
		typeOnElement(userNameField,"abc"+regNumber);
		typeOnElement(passwordField, "abc123");
		typeOnElement(confirmPasswordField, "abc123");
		typeOnElement(firstNameField, "abc");
		typeOnElement(lastNameField, "abc");
		typeOnElement(addressField, "abc, elmhurst,ny");
		clickOnElement(clickBox);
		clickOnElement(creantAccountButton);

		}

		public static void main (String[] args) {

		RegPage regis = new RegPage();
		regis.browserHandler();
		regis.OpenUrl("https://www.demo.iscripts.com/multicart/demo/index.php");

		HomePage home = new HomePage();
		home.takeMetoRegistration();
		regis.doRegistrationPage();


		}

		}


