package Controller;

import java.io.IOException;

import javax.security.auth.login.LoginException;
import javax.swing.JOptionPane;

import View.CourseFrame;
import model.MemberList;

public class LoginController 
{
	private String user;
	char password[];
	MemberList list;
	private boolean check;
	public LoginController(String username, char pass[]) throws IOException 
	{
		list = new MemberList();
		this.user = username;
		this.password = pass;
		this.check = false;
		try
		{	
			int index = checkUsername(user);
			if(index == -1)
			{
				throw new LoginException("Username or password is incorrect, please fill in again.");
			}
			checkPassword(index, pass);
		}
		catch (LoginException e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public int checkUsername(String user) 
	{
		int index = -1;
		for (int i = 0; i < list.getSize(); i++) 
		{
			if(user.equalsIgnoreCase(list.getMemberList(i).getUsername()))
			{
				index = i;
			}
		}
		return index;
	}
	
	public void checkPassword(int index, char pass[]) throws IOException
	{
		String passStr = "";
		for (int i = 0; i < pass.length; i++) 
		{
			passStr = passStr + pass[i];			
		}
		if(list.getMemberList(index).getPassword().equals(passStr))
		{			
			new CourseFrame(index);
			check = true;
		}
		else
		{
			JOptionPane.showMessageDialog(null, new LoginException("Username or password is incorrect, please fill in again.").getMessage());
			check = false;
		}		
	}
	public boolean disposeLoginForm() 
	{
		if(check)
		{
			return true;
		}
		return false;
	}
	
	
	
	
	
	

}
