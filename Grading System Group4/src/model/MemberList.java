package model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MemberList 
{
	ArrayList<Member> memberList;
	ArrayList<String> memberStr;
	File file = new File("userList.txt");
	
	public MemberList() throws IOException 
	{
		memberList = new ArrayList<Member>();
		memberStr = new ArrayList<String>();
		openFile();
		setMemberList();
		saveFile();
	}

	public void openFile() throws IOException
	{		
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String str = reader.readLine();
		while(str != null)
		{
			memberStr.add(str);			
			str = reader.readLine();
		}
		reader.close();
		fileReader.close();
	}
	public void setMemberList() 
	{
		for (int i = 0; i < memberStr.size(); i++) 
		{			
			String info[] = memberStr.get(i).split(",");
			if(info.length > 4)
			{
				ArrayList<String> subject = new ArrayList<String>();
				for(int j = 4 ; j<info.length ; j++) 
				{
					subject.add(info[j]);
				}
				String name[] = info[0].split(" ");
				memberList.add(new Member(name[0], name[1], info[1], info[2], info[3], subject));
			}
		}
	}
	public void saveFile() throws IOException 
	{
		FileWriter fileWriter = new FileWriter(file,false);
		PrintWriter writer = new PrintWriter(fileWriter);
		for (int i = 0; i < memberList.size(); i++) 
		{
			writer.print(memberList.get(i).toString());	
		}		
		writer.close();
		fileWriter.close();
	}	
	public Member getMemberList(int index) 
	{
		return memberList.get(index);
	}
	public int getSize()
	{
		return memberList.size();
	}

}
