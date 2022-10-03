package WeekendTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Student_Details
{
	ArrayList<Student>physics;
	ArrayList<Student>chemistry;
	HashSet<Student>result;
	public void addPhysicsMarks()
	{
		physics = new ArrayList<>();
		physics.add(new Student("Rahul",1,99,0));
		physics.add(new Student("Akshay",2,39,0));
		physics.add(new Student("Shubham",3,92,0));
		physics.add(new Student("Rohit",4,76,0));
		System.out.println("____________ArrayList One_________"); 
		System.out.println(physics);
		
	}
	public void addChemistry()
	{
		chemistry = new ArrayList<>();
		chemistry.add(new Student("Rahul",1,0,90));
		chemistry.add(new Student("Robin",2,0,70));
		chemistry.add(new Student("Akshay",3,0,68));
		chemistry.add(new Student("Rohit",4,0,73));
		System.out.println("_______ArrayList Second_______");
		System.out.println(chemistry);
		//return chemistry;

	}
	public void finalMarks() {
		result = new HashSet<>();
	
		System.out.println("__________After updating marks_____________");
		for(int i=0;i<physics.size();i++)
		{
			Student s1 = physics.get(i);
			for(int j=0;j<chemistry.size();j++)
			{
				Student s2 = chemistry.get(i);
				
				if(s1.name.equals(s2.name)  && s1.id == s2.id)
				{

					result.add(new Student(s1.name,s1.id,s1.phy,s2.chem));
				}
			}
		}
		Iterator<Student>itr = result.iterator();
		while(itr.hasNext())
		{
			Student s10 = itr.next();
			System.out.println(s10);
		}
	}
/*	public void showResult()
	{
		//System.out.println(physics);
		result = new HashSet<>();
		Iterator<Student>itr = physics.iterator();
		while(itr.hasNext())
		{
			Student s = itr.next();
			// System.out.println(s);
			chemistry.add(s);
		}
		//System.out.println(chemistry);
		System.out.println();
		Iterator<Student>itr21 = chemistry.iterator();
		while(itr21.hasNext())
		{
			Student s1 = itr21.next();
			//System.out.println(s1);
			result.add(s1);
		}
		Iterator<Student>itr2 = result.iterator();
		while(itr2.hasNext())
		{
			Student s2 = itr2.next();
			System.out.println(s2);
		}
	}*/


	public static void main(String[] args)
	{
		Student_Details obj = new Student_Details();
		obj.addPhysicsMarks();
		obj.addChemistry();
		
		obj.finalMarks();

	}

}