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
		baseLayout.putConstraint(SpringLayout.EAST, quitButton, 0, SpringLayout.EAST, typingFieldFirstName);
		baseLayout.putConstraint(SpringLayout.EAST, typingFieldLastName, -32, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, typingFieldFirstName, -6, SpringLayout.NORTH, typingFieldLastName);
		baseLayout.putConstraint(SpringLayout.EAST, typingFieldFirstName, 0, SpringLayout.EAST, typingFieldLastName);
		baseLayout.putConstraint(SpringLayout.NORTH, typingFieldPhone, 223, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, typingFieldPhone, -32, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, typingFieldLastName, -6, SpringLayout.NORTH, typingFieldPhone);
		baseLayout.putConstraint(SpringLayout.NORTH, typingFieldEmail, 6, SpringLayout.SOUTH, typingFieldPhone);
		baseLayout.putConstraint(SpringLayout.EAST, typingFieldEmail, -32, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, promptLabelFirstName, 6, SpringLayout.NORTH, typingFieldFirstName);
		baseLayout.putConstraint(SpringLayout.WEST, promptLabelFirstName, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, promptLabelLastName, 6, SpringLayout.NORTH, typingFieldLastName);
		baseLayout.putConstraint(SpringLayout.EAST, promptLabelLastName, 0, SpringLayout.EAST, promptLabelFirstName);
		baseLayout.putConstraint(SpringLayout.NORTH, promptLabelPhone, 6, SpringLayout.NORTH, typingFieldPhone);
		baseLayout.putConstraint(SpringLayout.WEST, promptLabelPhone, 0, SpringLayout.WEST, promptLabelFirstName);
		baseLayout.putConstraint(SpringLayout.NORTH, promptLabelEmail, 6, SpringLayout.NORTH, typingFieldEmail);
		baseLayout.putConstraint(SpringLayout.WEST, promptLabelEmail, 0, SpringLayout.WEST, promptLabelLastName);
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
				promptLabelPhone.setText(phone);
				
				String email = typingFieldEmail.getText();
				String emailStatus = baseController.processEmail(email);
				promptLabelEmail.setText(phone);
				
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
