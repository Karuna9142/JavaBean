package com.javabean;

class Employee implements java.io.Serializable{
	
	private int id;
	private String name;
	
	//constructor
	//public Employee() {};
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
    public void setName(String name)
    {
    	this.name=name;
    }
	public String getName()
	{
		return name;
	}
}
public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(2);
		e1.setName("Karuna");
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		

	}

}
