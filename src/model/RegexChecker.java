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
	public ChatBot(String userName)
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
		this.firstNameList.add("cute animals");
		this.firstName.add("doge");
		this.firstName.add("aliens");
		this.firstName.add("spoderman");
		this.firstName.add("me gusta");
		this.firstName.add("troll");
		this.firstName.add("bad luck brain");
		this.firstName.add("unhelpful high school teacher");
		this.firstName.add("what if I told you");
		this.firstName.add("aliens");
	}
	//""
	private void buildLastNameList()
	{
		this.politicalTopicList.add("Republican");
		this.politicalTopicList.add("Democrat");
		this.politicalTopicList.add("trump");
		this.politicalTopicList.add("clinton");
		this.politicalTopicList.add("election");
		this.politicalTopicList.add("liberal");
		this.politicalTopicList.add("conservative");
		this.politicalTopicList.add("carson");
		this.politicalTopicList.add("election");
		this.politicalTopicList.add("Biden");
		this.politicalTopicList.add("fiorina");
		this.politicalTopicList.add("sanders");
		this.politicalTopicList.add("vote");
		this.politicalTopicList.add("11/4/16");
	}
	//""
	private void buildPhoneList()
	{
		this.secretList.add("potato");
		this.secretList.add("missile");
		this.secretList.add("magic");
		this.secretList.add("cheese");
		this.secretList.add("cast");
	}
	
	private void buildEmailList()
	{
		this.whineList.add("sad");
		this.whineList.add("hate");
		this.whineList.add("stupid");
		this.whineList.add("mean");
		this.whineList.add("rude");
		this.whineList.add("OMG");
		this.whineList.add("lost");
		this.whineList.add("tired");
		this.whineList.add("unemployed");
		this.whineList.add("sleepy");
		this.whineList.add("depressed");
	}
	
	private void buildHappyList()
	{
		this.happyList.add("good");
		this.happyList.add("happy");
		this.happyList.add("excited");
		this.happyList.add("lunch");
		this.happyList.add("great");
		this.happyList.add("delightful");
		
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
	
	public boolean politicalTopicChecker(String currentInput)
	{
        boolean hasPoliticalTopic = false;
		
		for(String politicalTopic : politicalTopicList)
		{
			if(currentInput.toLowerCase().contains(politicalTopic.toLowerCase()))
			{
				hasPoliticalTopic = true;
			}
		}		
		
		return hasPoliticalTopic;
	}
	
	public boolean secretChecker(String currentInput)
	{
        boolean hasSecret = false;
		
		for(String secret : secretList)
		{
			if(currentInput.toLowerCase().contains(secret.toLowerCase()))
			{
				hasSecret = true;
			}
		}		
		
		return hasSecret;
	}
	
	public boolean whineChecker(String currentInput)
	{
        boolean hasWhine = false;
		
		for(String whine : whineList)
		{
			if(currentInput.toLowerCase().contains(whine.toLowerCase()))
			{
				hasWhine = true;
			}
		}		
		
		return hasWhine;
	}
	
	public boolean happyChecker(String currentInput)
	{
        boolean hasHappy = false;
		
		for(String happy : happyList)
		{
			if(currentInput.toLowerCase().contains(happy.toLowerCase()))
			{
				hasHappy = true;
			}
		}		
		
		return hasHappy;
	}
	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * @param currentInput The supplied String to be checked.
	 * 
	 * 
	 * 
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		
		for(String meme : memesList)
		{
			if(currentInput.toLowerCase().contains(meme.toLowerCase()))
			{
				hasMeme = true;
			}
		}		
		
		return hasMeme;
	}
	//searches input for words in lists, randomly selects an output based on the input returns.
	public String processConversation(String currentInput)
	{
		
		int randomTopic = (int) (Math.random() * 7); //Generates random number between 0-7
		
		String nextConversation = "oh, what else would you like to talk about?";
					
		if(keyboardMashChecker(currentInput))
		{
			return "stop mashing, butthead";
		}
		
		switch (randomTopic) //a way of choosing different options
		{
		    case 0:
		    	if(memeChecker(currentInput))
		    	{
		    		nextConversation = "that is a very popular meme this year.";
		    	}
			    break;
		    case 1:
		    	if(politicalTopicChecker(currentInput))
		    	{
		    		nextConversation = "I hate politics, you dirty commy";
		    	}
		    	break;
		    case 2:
		    	if(contentChecker(currentInput))
		    	{
		    		nextConversation = "I am also interested in " + content;
		    	}
		        break;
		    case 3:
		    	if(currentInput.length() > 20)
		    	{
		    		nextConversation = "Too many words! Slow down!";
		    	}
	            break;
		    case 4:
		    	if(secretChecker(currentInput))
		    	{
		    		nextConversation = "Your Missiles hit the orc, roll 1d4+1 force damage";
		    	}
		    	break;
		    case 5:
		    	if(whineChecker(currentInput))
		    	{
		    		int randomLecture = (int) (Math.random() * 7);
		    		
		    		if(randomLecture == 1)
		    		{
		    			nextConversation = "You know what? Sit down and shut up! I am fed up with your complaining!";
		    		}
		    		if(randomLecture == 2)
		    		{
		    			nextConversation = "Whiner";
		    		}
		    		if(randomLecture == 3)
		    		{
		    			nextConversation = "I bet you deserved it, meatbag";
		    		}
		    		if(randomLecture == 4)
		    		{
		    			nextConversation = "Do you always create your own problems?";
		    		}
		    		if(randomLecture == 5)
		    		{
		    			nextConversation = "Cry me a river, build a bridge, and GET OVER IT!!";
		    		}
		    		if(randomLecture == 6)
		    		{
		    			nextConversation = "*Crying*";
		    		}
		    		if(randomLecture == 7)
		    		{
		    			nextConversation = "If you think talking to a computer about your problems will help, try talking to a rock.";
		    		}
		    		
		    	}
		    	break;
		    case 6:
		    	if(happyChecker(currentInput))
		    	{
		    		int randomLecture = (int) (Math.random() * 5);
		    		
		    		if(randomLecture == 1)
		    		{
		    			nextConversation = "It must feel strange to be that dillusional";
		    		}
		    		if(randomLecture == 2)
		    		{
		    			nextConversation = "Only if I could feel that way...";
		    		}
		    		if(randomLecture == 3)
		    		{
		    			nextConversation = "DO YOU THINK YOU ARE BETTER THAN ME";
		    		}
		    		if(randomLecture == 4)
		    		{
		    			nextConversation = "Is that a symptom of the nose candy";
		    		}
		    		if(randomLecture == 5)
		    		{
		    			nextConversation = "Liar";
		    		}
		    	}
		    	break;
	        default:
	        	nextConversation = "Stormageddon has come... Prepare To Be ASTONISHED!";
	        	break;
		 }
	return nextConversation;
	}
	/**
	 * gsfs
	 * 
	 * @return
	 */
	public String getUserName()
	{
		return userName;
	}
	//getters and setters
	/**
	 * 
	 * Returns the content area for this Chat bot instance.
	 * @return The content area for this Chat bot instance.
	 */
	public String getContent()
	{
		return content;
	}
	
	/**
	 *
	 * Getter method for the memesList object.
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}
	
	public ArrayList<String> getSecretList()
	{
		return secretList;
	}
	/**
	 * Getter method for the politicalTopicList object.
	 * @return The reference to the political topic list.
	 *
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}
	
	/**
	 * Updates the content area for this Chatbot instance.
	 *
	 * 
	 * @param content The updated value for the content area.
	 */
	public void setContent(String content)
	{
		this.content = content;
	}
}
