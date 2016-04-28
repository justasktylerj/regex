package view;

import javax.swing.*;

import controller.*;
import view.*;

public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel basePanel;
	
	public RegexFrame(RegexController baseController)
	{
		this.baseController = baseController;
		basePanel = new RegexPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);  //installs the panel in the frame
		this.setSize(800,800);
		this.setTitle("Art app!"); // find a good size for app
		this.setResizable(false); //can't change size of window
		this.setVisible(true);  //must be last line of setupFrame
	}
	
	public RegexController getBaseController()
	{
		return baseController;
	}
}
