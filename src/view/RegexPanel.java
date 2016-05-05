package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.RegexController;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	
	private SpringLayout baseLayout;
	
	private JTextField typingFieldFirstName;
	private JLabel promptLabelFirstName;
	
	private JTextField typingFieldLastName;
	private JLabel promptLabelLastName;
	
	private JTextField typingFieldPhone;
	private JLabel promptLabelPhone;
	
	private JTextField typingFieldEmail;
	private JLabel promptLabelEmail;
	
	private JButton submitButton;
	private JButton quitButton;
	
	
	

	public RegexPanel(RegexController baseController)
	{
	
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		submitButton = new JButton("Say");
		
		quitButton = new JButton("Quit");
		
		
		
		typingFieldFirstName = new JTextField("first name", 20);
		
		typingFieldLastName = new JTextField("Last name", 20);
		
		typingFieldPhone = new JTextField("Phone number", 20);
	
		typingFieldEmail = new JTextField("Email", 20);
		
		
		promptLabelFirstName = new JLabel("first name");
		
		
		promptLabelLastName = new JLabel("last name");
		
		
		promptLabelPhone = new JLabel("Phone Number");
				
		promptLabelEmail = new JLabel("Email");
	
		
		setupPanel();
		setupLayout();
		setupListeners();
	
	}	
		
	private void setupPanel()
		{
			this.setLayout(baseLayout);
			this.setBackground(Color.MAGENTA);
			this.add(typingFieldFirstName);
			this.add(typingFieldLastName);
			this.add(typingFieldPhone);
			this.add(typingFieldEmail);
			
			this.add(promptLabelFirstName);	
			this.add(promptLabelLastName);	
			this.add(promptLabelPhone);	
			this.add(promptLabelEmail);	
			
			this.add(submitButton);
			this.add(quitButton);
			
			this.setPreferredSize(new Dimension(400, 400));
		
		}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 27, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, submitButton, -25, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, quitButton, 0, SpringLayout.NORTH, submitButton);
		baseLayout.putConstraint(SpringLayout.EAST, quitButton, -32, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, typingFieldFirstName, 56, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, typingFieldFirstName, -32, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, typingFieldLastName, 31, SpringLayout.SOUTH, typingFieldFirstName);
		baseLayout.putConstraint(SpringLayout.WEST, typingFieldLastName, 0, SpringLayout.WEST, typingFieldFirstName);
		baseLayout.putConstraint(SpringLayout.NORTH, typingFieldPhone, 30, SpringLayout.SOUTH, typingFieldLastName);
		baseLayout.putConstraint(SpringLayout.EAST, typingFieldPhone, 0, SpringLayout.EAST, typingFieldFirstName);
		baseLayout.putConstraint(SpringLayout.NORTH, typingFieldEmail, 24, SpringLayout.SOUTH, typingFieldPhone);
		baseLayout.putConstraint(SpringLayout.EAST, typingFieldEmail, 0, SpringLayout.EAST, typingFieldFirstName);
		baseLayout.putConstraint(SpringLayout.NORTH, promptLabelFirstName, 32, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, promptLabelFirstName, 13, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, promptLabelLastName, 51, SpringLayout.SOUTH, promptLabelFirstName);
		baseLayout.putConstraint(SpringLayout.WEST, promptLabelLastName, 0, SpringLayout.WEST, promptLabelFirstName);
		baseLayout.putConstraint(SpringLayout.NORTH, promptLabelPhone, 35, SpringLayout.SOUTH, promptLabelLastName);
		baseLayout.putConstraint(SpringLayout.WEST, promptLabelPhone, 0, SpringLayout.WEST, promptLabelFirstName);
		baseLayout.putConstraint(SpringLayout.NORTH, promptLabelEmail, 37, SpringLayout.SOUTH, promptLabelPhone);
		baseLayout.putConstraint(SpringLayout.WEST, promptLabelEmail, 0, SpringLayout.WEST, promptLabelFirstName);
	
		
	}
		
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String firstName = typingFieldFirstName.getText();
				String firstStatus = baseController.processFirstName(firstName);
				promptLabelFirstName.setText(firstStatus);
				
				
				String lastName = typingFieldLastName.getText();
				String lastStatus = baseController.processLastName(lastName);
				promptLabelLastName.setText(lastStatus);
				
				String phone = typingFieldPhone.getText();
				String phoneStatus = baseController.processPhone(phone);
				promptLabelPhone.setText(phoneStatus);
				
				String email = typingFieldEmail.getText();
				String emailStatus = baseController.processEmail(email);
				promptLabelEmail.setText(emailStatus);
				
			}
		});
		
		 quitButton.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent click)
			 {
				 shutDown();
			 }
		 });
		 
	}
	
	protected void shutDown()
	{
		System.exit(0);
	}
	
}
