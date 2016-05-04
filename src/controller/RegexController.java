package controller;

import model.RegexChecker;
import view.RegexFrame;
import view.RegexPanel;

public class RegexController 
{
	private RegexChecker myBot;
	private RegexFrame baseFrame;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	
	
	public RegexController()
	{
		myBot = new RegexChecker();
		baseFrame = new RegexFrame(this);
	}
	
	public void start()
	{
		
	} 
	
	public String processFirstName(String firstName)
	{
		String firstStatus = "null";
		firstStatus = myBot.firstNameChecker(firstName);
		return firstStatus;
	}
	
	public String processLastName(String lastName)
	{
		String lastStatus = "null";
		lastStatus = myBot.lastNameChecker(lastName);
		return lastStatus;
	}
	
	public String processPhone(String phone)
	{
		String phoneStatus = "null";
		phoneStatus = myBot.phoneChecker(phoneNum);
		return phoneStatus;
	}
	
	public String processEmail(String email)
	{
		String emailStatus = "null";
		emailStatus = myBot.emailChecker(email);
		return emailStatus;
	}
	
}
