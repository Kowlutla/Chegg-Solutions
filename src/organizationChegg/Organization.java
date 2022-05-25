package organizationChegg;

import java.util.ArrayList;

public class Organization 
{
	String name;
	String address;
	int org_id;
	ArrayList<Person>personlist;
	ArrayList<Department>deptlist;
	public Organization(String name, String address, int org_id) 
	{
		this.name = name;
		this.address = address;
		this.org_id = org_id;
	}
	
	public void addPerson(Person p)
	{
		personlist.add(p);
	}
	
	public void addDepartment(Department dp)
	{
		deptlist.add(dp);
	}
	
	public void printEmployee()
	{
		for(Person p:personlist)
		{
			System.out.println(p);
		}
	}
	
	public void printDepartments()
	{
		for(Department dp:deptlist)
		{
			System.out.println(dp);
		}
	}

	@Override
	public String toString() {
		return "Organization [name=" + name + ", address=" + address + ", org_id=" + org_id + "]";
	}
	
	
	
	
	

}
