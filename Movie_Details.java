package Weekend_Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Movie_Details<actor_name>
{
ArrayList<Movie>ar;
TreeMap<String,Actor>tree;
LinkedHashMap<Actor,Movie>link;
public void addMovie()
{
	ar = new ArrayList<>();
	ar.add(new Movie("RRR","R.R.Rajmouli",450000,new Actor("Ram Charan",21)));
	ar.add(new Movie("Pushpa","Sukumar",350000,new Actor("Allu Arjun",11)));
	ar.add(new Movie("KGF","Mahendra",130000,new Actor("Yash",31)));
	ar.add(new Movie("Rangalstam","Sukumar",100000,new Actor("Ram Charan",21)));
	ar.add(new Movie("Kaithy","Lokesh",400000,new Actor("Karthi",47)));
	ar.add(new Movie("Vikram","Lokesh",400000,new Actor("Suriya",22)));
	

	
}
public void showDetails()
{
	tree = new TreeMap<>(Collections.reverseOrder());
	Iterator<Movie>itr2 = ar.iterator();
	{
	  while(itr2.hasNext())	
	  {
		  Movie m = itr2.next();
		  tree.put(m.name, m.ar);
	  }
	}
	
	Set<Entry<String, Actor>>entries = tree.entrySet();
	Iterator<Entry<String, Actor>>itr = entries.iterator();
	while(itr.hasNext())
	{
		Entry<String, Actor>e = itr.next();
		System.out.println(e.getValue()+ " is the actor acted in " + e.getKey() + " movie");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
public void show()
{
	link = new LinkedHashMap<>();
	Iterator<Movie>itr2 = ar.iterator();
	{
	  while(itr2.hasNext())	
	  {
		  Movie m = itr2.next();
		  link.put(m.ar, m);
	  }
	}
	Set<Entry<Actor,Movie>>entries = link.entrySet();
	Iterator<Entry<Actor,Movie>>itr = entries.iterator();
	while(itr.hasNext())
	{
		Entry<Actor,Movie>e = itr.next();
		System.out.println(e.getKey() + " is Actor in " + e.getValue() + " movie..");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	
}



	public static void main(String[] args)
	{
		Movie_Details m = new Movie_Details();
		m.addMovie();
		m.showDetails();
		System.out.println("######################################################################");
		System.out.println("\n");
		m.show();

	}

}
