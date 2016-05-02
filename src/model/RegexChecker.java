package model;

import java.util.ArrayList;

public class RegexChecker 
{
	private ArrayList<String> firstNameList;
	private ArrayList<String> lastNameList;
	private ArrayList<String> phoneList;
	private ArrayList<String> emailList;

	private String userName;
	
	private String content;
	
	/**
	 * 
	 * Creates an instance of the Chatbot with the supplied username.
	 * 
	 * @param userName The username for the chatbot.
	 */
	public RegexChecker(String userName)
	{
		this.firstNameList = new ArrayList<String>();
		this.lastNameList = new ArrayList<String>();
		this.phoneList = new ArrayList<String>();
		this.emailList = new ArrayList<String>();
		
		this.userName = userName;
		this.content = "memes";
		
		buildFirstNameList();
		buildLastNameList();
		buildPhoneList();
		buildEmailList();

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
	//""
	private void buildPhoneList()
	{
		this.phoneList.add("~");
		this.phoneList.add("`");
		this.phoneList.add("!");
		this.phoneList.add("@");
		this.phoneList.add("#");
		this.phoneList.add("$");
		this.phoneList.add("%");
		this.phoneList.add("^");
		this.phoneList.add("&");
		this.phoneList.add("*");
		this.phoneList.add("(");
		this.phoneList.add(")");
		this.phoneList.add("_");
		this.phoneList.add("-");
		this.phoneList.add("+");
		this.phoneList.add("=");
		this.phoneList.add("{");
		this.phoneList.add("}");
		this.phoneList.add("[");
		this.phoneList.add("]");
		this.phoneList.add("|");
		this.phoneList.add(":");
		this.phoneList.add(";");
		this.phoneList.add(">");
		this.phoneList.add("<");
		this.phoneList.add(".");
		this.phoneList.add(",");
		this.phoneList.add("q");
		this.phoneList.add("w");
		this.phoneList.add("e");
		this.phoneList.add("r");
		this.phoneList.add("t");
		this.phoneList.add("y");
		this.phoneList.add("u");
		this.phoneList.add("i");
		this.phoneList.add("o");
		this.phoneList.add("p");
		this.phoneList.add("a");
		this.phoneList.add("s");
		this.phoneList.add("d");
		this.phoneList.add("f");
		this.phoneList.add("g");
		this.phoneList.add("h");
		this.phoneList.add("j");
		this.phoneList.add("k");
		this.phoneList.add("l");
		this.phoneList.add("z");
		this.phoneList.add("x");
		this.phoneList.add("c");
		this.phoneList.add("v");
		this.phoneList.add("b");
		this.phoneList.add("n");
		this.phoneList.add("m");
		this.phoneList.add("Q");
		this.phoneList.add("W");
		this.phoneList.add("E");
		this.phoneList.add("R");
		this.phoneList.add("T");
		this.phoneList.add("Y");
		this.phoneList.add("I");
		this.phoneList.add("O");
		this.phoneList.add("P");
		this.phoneList.add("S");
		this.phoneList.add("D");
		this.phoneList.add("F");
		this.phoneList.add("G");
		this.phoneList.add("H");
		this.phoneList.add("J");
		this.phoneList.add("K");
		this.phoneList.add("L");
		this.phoneList.add("Z");
		this.phoneList.add("X");
		this.phoneList.add("C");
		this.phoneList.add("V");
		this.phoneList.add("B");
		this.phoneList.add("N");
		this.phoneList.add("M");
		this.phoneList.add(" ");
	}
	
	private void buildEmailList()
	{
		this.emailList.add("");
		this.emailList.add("");
		this.emailList.add("");
		this.emailList.add("");
		this.emailList.add("");
		this.emailList.add("");
		this.emailList.add("");
		this.emailList.add("");
		this.emailList.add("");
		this.emailList.add("");
	}
	
	
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if(currentInput != null && currentInput.length() > 0)
		{
			hasLength = true;
		}
		
		return hasLength;
	}
	
	/**
	 * 
	 * 
	 * 
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		if(currentInput.toLowerCase().contains(content.toLowerCase()))
		{
			hasContent = true;
		}
		
		return hasContent;
	}
	//checks for keyboard mashing
	
	public boolean lastNameChecker(String currentInput)
	{
        boolean hasLastName = false;
		
		for(String lastName : lastNameList)
		{
			if(currentInput.toLowerCase().contains(lastName.toLowerCase()))
			{
				hasLastName = true;
			}
		}		
		
		return hasLastName;
	}
	
	public boolean phoneChecker(String currentInput)
	{
        boolean hasPhone = false;
		
		for(String phone : phoneList)
		{
			if(currentInput.toLowerCase().contains(phone.toLowerCase()))
			{
				hasPhone = true;
			}
		}		
		
		return hasPhone;
	}
	
	public boolean emailChecker(String currentInput)
	{
        boolean hasEmail = false;
		
		for(String email : emailList)
		{
			if(currentInput.toLowerCase().contains(email.toLowerCase()))
			{
				hasEmail = true;
			}
		}		
		
		return hasEmail;
	}
	
	
	public boolean firstNameChecker(String currentInput)
	{
		boolean hasFirstName = false;
		
		for(String firstName : firstNameList)
		{
			if(currentInput.toLowerCase().contains(firstName.toLowerCase()))
			{
				hasFirstName = true;
			}
		}		
		
		return hasFirstName;
	}
	
	
	public String getUserName()
	{
		return userName;
	}
	
	 
	public String getContent()
	{
		return content;
	}
	
	
	public ArrayList<String> getFirstNameList()
	{
		return firstNameList;
	}
	
	public ArrayList<String> getSecretList()
	{
		return emailList;
	}
	
	public ArrayList<String> getLastNameList()
	{
		return lastNameList;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
}
