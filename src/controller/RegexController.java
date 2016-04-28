package controller;

import model.RegexChecker;
import view.RegexFrame;
import view.RegexPanel;

public class RegexController 
{
	private RegexChecker myBot;
	private RegexFrame baseFrame;
	
	
	public RegexController()
	{
		baseFrame = new RegexFrame(this);
	}
	
	public void start()
	{
		
	} 
	
	public RegexChecker getRegexChecker()
	{
		return myBot;
	}
	
	public RegexFrame getBaseFrame()
	{
		return baseFrame;
	}
}
