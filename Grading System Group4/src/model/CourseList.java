package model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CourseList
{
	ArrayList<Course> courseList;
	public CourseList() 
	{
		courseList = new ArrayList<Course>();
		createCourseList();
	}
	public void createCourseList() 
	{
		courseList.add(new Course("cs101", "Discrete Structures"));
		courseList.add(new Course("cs102", "Computer Programming Fund"));
		courseList.add(new Course("cs103", "Intro. to Computer Programming"));
		courseList.add(new Course("cs105", "Practicum for Structural Programming"));
		courseList.add(new Course("cs211", "Software Development using API"));
		courseList.add(new Course("cs213", "Data Structures"));
		courseList.add(new Course("cs215", "Programming Practicum using API"));
		courseList.add(new Course("cs223", "Computer Organization & Architecture"));
		courseList.add(new Course("cs275", "Human Information Processing"));
		courseList.add(new Course("cs284", "Intro. to Software Engineering"));
		courseList.add(new Course("cs285", "Practices & Patterns in O-O Programming"));
		courseList.add(new Course("cs286", "Software Process & Quality Assurance"));
		courseList.add(new Course("cs287", "Software Requirement Specification and Management"));
		courseList.add(new Course("cs296", "Art and Design Foundations"));
		courseList.add(new Course("cs297", "Fundamental Techniques in Computer Graphics using API"));
		courseList.add(new Course("cs298", "Fundamentals of Computer Graphics"));
		courseList.add(new Course("cs299", "Computer Graphics 1"));
		courseList.add(new Course("cs300", "Seminar in Practical Programming"));
		courseList.add(new Course("cs301", "Computer Science Project Proposal and Presentation"));
		courseList.add(new Course("cs342", "Net-Centric Computing 1"));
		courseList.add(new Course("cs355", "Mobile Application Development"));
		courseList.add(new Course("cs365", "Basic Theory in Artificial Intelligence"));
		courseList.add(new Course("cs374", "Human – Computer Interaction"));
		courseList.add(new Course("cs387", "Software Configuration Management"));
		courseList.add(new Course("cs396", "Computer Graphics Modeling"));
		courseList.add(new Course("cs401", "Special Projects 1"));
		courseList.add(new Course("cs407", "Seminar in Software Engineering"));
		courseList.add(new Course("cs409", "Selected Topics in Computer Science"));
		courseList.add(new Course("cs427", "Parallel Algorithm Designs"));
		courseList.add(new Course("cs447", "Operating Systems 2"));
		courseList.add(new Course("cs448", "Net - Centric Computing 3"));
		courseList.add(new Course("cs449", "Selected Topics in Net-Centric Computing"));
		courseList.add(new Course("cs456", "Management Information Systems"));
		courseList.add(new Course("cs457", "Database Systems 2"));
		courseList.add(new Course("cs465", "Advanced Search Strategies"));
		courseList.add(new Course("cs479", "Selected Topics in Multimedia Content Analysis"));
		courseList.add(new Course("cs488", "Formal Methods"));
		courseList.add(new Course("cs498", "Game Programming"));
	}	
	public Course getCourse(int index) 
	{
		return courseList.get(index);
	}
	public int getSize()
	{
		return courseList.size();
	}
	
	public static void main(String[] args) throws IOException 
	{
		CourseList list = new CourseList();
	}


}
