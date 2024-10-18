package com.javabean;

class Student 
{
	private int id;
	private String name;
	private boolean active;
	
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
	public boolean isActive()
	{
		return active;
	}
	public void setActive(boolean active)
	{
		this.active = active;
	}
}
 class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setId(21);
		s1.setName("Karuna");
		s1.setActive(true);
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.isActive());

	}

}
