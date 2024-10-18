package com.javabean;

import java.util.ArrayList;
import java.util.List;

class Student1 
{
	private int id;
	private String name;
	
	//creating list
	public List<String> subjets;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public List<String> getSubjects()
	{
		return subjets;
	}
	public void setSubjects(List<String> subjects)
	{
		this.subjets = subjects;
	}
}
public class JavaBeanCollection {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		s1.setId(1);
		s1.setName("Priyanka");
		
		List<String> sub = new ArrayList<>();
		sub.add("Bio");
		sub.add("English");
		sub.add("DBMS");
		
		s1.setSubjects(sub);
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getSubjects());

	}

}
