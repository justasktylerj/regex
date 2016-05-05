package model;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RegexChecker 
{
	private ArrayList<String> firstNameList;
	private ArrayList<String> lastNameList;
	private Matcher emailMatcher;
	private Pattern emailPattern;
	private Matcher phoneMatcher;
	private Pattern phonePattern;
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String PHONE_PATTERN = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
	
	public RegexChecker()
	{
		this.firstNameList = new ArrayList<String>();
		this.lastNameList = new ArrayList<String>();
		
		emailPattern = Pattern.compile(EMAIL_PATTERN);
		phonePattern = Pattern.compile(PHONE_PATTERN);
		
		buildFirstNameList();
		buildLastNameList();

	}
	//key words for lists
	private void buildFirstNameList()
	{
		this.firstNameList.add("~");
		this.firstNameList.add("`");
		this.firstNameList.add("@");
		this.firstNameList.add("#");
		this.firstNameList.add("$");
		this.firstNameList.add("%");
		this.firstNameList.add("^");
		this.firstNameList.add("&");
		this.firstNameList.add("*");
		this.firstNameList.add("(");
		this.firstNameList.add(")");
		this.firstNameList.add("_");
		this.firstNameList.add("-");
		this.firstNameList.add("+");
		this.firstNameList.add("=");
		this.firstNameList.add("|");
		this.firstNameList.add(":");
		this.firstNameList.add(";");
		this.firstNameList.add("<");
		this.firstNameList.add(">");
		this.firstNameList.add("1");
		this.firstNameList.add("2");
		this.firstNameList.add("3");
		this.firstNameList.add("4");
		this.firstNameList.add("5");
		this.firstNameList.add("6");
		this.firstNameList.add("7");
		this.firstNameList.add("8");
		this.firstNameList.add("9");
		this.firstNameList.add("0");
		this.firstNameList.add(" ");
		this.firstNameList.add("{");
		this.firstNameList.add("}");
		this.firstNameList.add("[");
		this.firstNameList.add("]");
		this.firstNameList.add(".");
	}
	//""
	private void buildLastNameList()
	{
		this.lastNameList.add("~");
		this.lastNameList.add("`");
		this.lastNameList.add("!");
		this.lastNameList.add("@");
		this.lastNameList.add("#");
		this.lastNameList.add("$");
		this.lastNameList.add("%");
		this.lastNameList.add("^");
		this.lastNameList.add("&");
		this.lastNameList.add("*");
		this.lastNameList.add("(");
		this.lastNameList.add(")");
		this.lastNameList.add("_");
		this.lastNameList.add("-");
		this.lastNameList.add("+");
		this.lastNameList.add("=");
		this.lastNameList.add("{");
		this.lastNameList.add("}");
		this.lastNameList.add("[");
		this.lastNameList.add("]");
		this.lastNameList.add("|");
		this.lastNameList.add(":");
		this.lastNameList.add(";");
		this.lastNameList.add(">");
		this.lastNameList.add("<");
		this.lastNameList.add(".");
		this.lastNameList.add(",");
		this.lastNameList.add("1");
		this.lastNameList.add("2");
		this.lastNameList.add("3");
		this.lastNameList.add("4");
		this.lastNameList.add("5");
		this.lastNameList.add("6");
		this.lastNameList.add("7");
		this.lastNameList.add("8");
		this.lastNameList.add("9");
		this.lastNameList.add("0");
		this.lastNameList.add(" ");
	}
	
	public String firstNameChecker(String firstName)
	{
		String firstStatus = null;
		
		if (firstName.length() > 2 && firstName.length() < 30)
		{
			for (int currentSymbol = 0; currentSymbol < firstNameList.size(); currentSymbol++)
			{
				if (firstName.contains(firstNameList.get(currentSymbol)))
				{
					return firstStatus = "First Name: Status code 400: contains invalid character";
				}
				else
				{
					firstStatus = "First Name: All good";
				}
			}
		}
		else
		{
			firstStatus = "First Name: too long or too short";
		}
		return firstStatus;
	}
	
	public String lastNameChecker(String lastName)
	{
		String lastStatus = null;
		
		if (lastName.length() > 2 && lastName.length() < 40)
		{
			for (int currentSymbol = 0; currentSymbol < lastNameList.size(); currentSymbol++)
			{
				if (lastName.contains(lastNameList.get(currentSymbol)))
				{
					return lastStatus = "Last Name: Status code 400: contains invalid character";
				}
				else
				{
					lastStatus = "Last Name: All good";
				}
			}
		}
		else
		{
			lastStatus = "Last Name: too long or too short";
		}
		return lastStatus;
	}
	
	
	public String emailChecker(String email) 
	{
		String emailStatus = "";
		
		emailMatcher = emailPattern.matcher(email);
		
		if (emailMatcher.matches() == true)
		{
			emailStatus = "Email: all good";
		}
		else
		{
			emailStatus = "Email: invalid email";
		}
		return emailStatus;
		
	}
	
	public String phoneChecker(String phone)
	{
		String phoneStatus = "";
		
		phoneMatcher = phonePattern.matcher(phone);
		
		if (phone.length() == 10)
		{
			if (phoneMatcher.matches() == true)
			{
				phoneStatus = "Phone: all good";
			}
			else
			{
				phoneStatus = "Phone: invalid";
			}
		}
		else
		{
			phoneStatus = "Phone: I DEMAMND 10 DIGITS!";
		}
		return phoneStatus;
	}
	
}
