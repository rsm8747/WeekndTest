package Weekend_Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Book_Details 
{
	TreeMap<String,Book>tree;
	public void addBook()
	{
		tree = new TreeMap<>(Collections.reverseOrder());
	/*	tree.put("Navneet", new Book("Balbharti",12,99,"Mr.Ramesh Deo"));
		tree.put("Maharaj", new Book("Shyamchi Aie",13,130,"Mr.Sane Guruji"));
		tree.put("Rajhans", new Book("Mrutyunjay",14,500,"Mr.Shiavji Sawant"));
		tree.put("Vidhyut", new Book("Batatyachi Chawl",17,120,"Mr.Pu.L.Deshpande"));
		tree.put("Rahul", new Book("The Wall",22,220,"Mr.Rahul Dravid"));
		tree.put("Rajaram", new Book("Ramayan",34,450,"Vyas Maharshi"));
	*/	//tree.put("A", new Book("HarryPotter", 11, 0, "")

	}
	public void showDetails()
	{
		Set<Entry<String,Book>>entries = tree.entrySet();
		Iterator<Entry<String,Book>>itr = entries.iterator();
		while(itr.hasNext())
		{
			Entry<String,Book>e = itr.next();
			System.out.println(e.getKey() +" is the publication name of the Book " + e.getValue());
			System.out.println("\n-----------------------------------------------");
		}
	}


	public static void main(String[] args) 
	{
		Book_Details b = new Book_Details();
		b.addBook();
		b.showDetails();

	}

}
