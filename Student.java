package WeekendTest;

public class Student
{
	String name;
	int id,phy, chem;
	Student(){}
	Student(String name,int id,int phy,int chem)
	{
		this.name = name;
		this.id = id;
		this.phy = phy;
		this.chem = chem;
	}
	
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", phy=" + phy + ", chem=" + chem + "]";
	}
	
	public int hashCode()
	{
		int ans = name.hashCode() + (id * 2) + (phy * 2) + (chem * 2);
		return ans;
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(this.getClass() != obj.getClass())
			return false;
		Student s = (Student)obj;
		if(s.name.equals(this.name) && s.id == this.id && s.phy == this.phy && s.chem == this.chem)
			return true;
		else
			return false;
	}
}