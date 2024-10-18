package com.javabean;

class Students 
{
	private int id;
	private String name;
	
	//javabean can have array
	private String[] subjects;
	
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
	public String[] getSubjects()
	{
		return subjects;
	}
	public void setSubjects(String[] subjects)
	{
		this.subjects = subjects;
	}
}
public class JavaBeanArray {

	public static void main(String[] args) {
		
		Students s1 = new Students();
		String[] subjects = {"Math","Science","Computer"};
		s1.setId(1);
		s1.setName("Karuna");
		s1.setSubjects(subjects);
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		
		String[] subjectArray = s1.getSubjects();
		for(int i = 0; i<subjectArray.length; i++)
		{
			System.out.println("Student subject " +(i+1)+ " :" +subjectArray[i]);
		}
		

	}

}
