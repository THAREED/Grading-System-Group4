package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.MemberList;

public class DetailFrame extends JFrame 
{
	DetailPanel detail;
	private int index;
	private String subject;
	MemberList list;
	public DetailFrame(int index , String subject) throws IOException 
	{
		this.index = index;
		this.subject = subject;		
	
		showTopPage();
		detail = new DetailPanel();
		this.add(detail, BorderLayout.CENTER);
		this.setTitle("Course Detail");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();	
		this.setLocationRelativeTo(null);
	}
	public void showTopPage() throws IOException 
	{
		list = new MemberList();
		
		JPanel usrePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel nameLabel = new JLabel(list.getMemberList(index).getName());
		nameLabel.setIcon(new ImageIcon("userIcon.png"));
		usrePanel.add(nameLabel);
		usrePanel.setBackground(new Color(179, 235, 255));
	//	usrePanel.setBorder(BorderFactory.createEmptyBorder());
		
		JPanel subjectPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel subjectLabel = new JLabel(subject);
		subjectPanel.add(subjectLabel);
		subjectLabel.setIcon(new ImageIcon("criterionIcon.png"));
		subjectPanel.add(subjectLabel);
		subjectPanel.setBackground(new Color(179, 235, 255));
	//	subjectPanel.setBorder(BorderFactory.createEmptyBorder());
		
		JPanel topPanel = new JPanel(new GridLayout(1, 2));
		topPanel.add(usrePanel);
		topPanel.add(subjectPanel);
		topPanel.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		add(topPanel, BorderLayout.NORTH);
	}
	
}
