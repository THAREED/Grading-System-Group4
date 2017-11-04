package View;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.MemberList;

public class ProfileFrame extends JFrame
{
	MemberList list;
	JLabel firstnameLabel, lastnameLabel;
	JTextField firstname, lastname;
	public ProfileFrame(int index) throws IOException 
	{
		list = new MemberList();
		
		firstnameLabel = new JLabel("Firstname: ");
		lastnameLabel = new JLabel("Lastname");
		firstname = new JTextField(list.getMemberList(index).get)
		
		
	}
	

}
