package Weekend_Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Book_Details_Linked_HashMap
{
	LinkedList<Book> list = new LinkedList<Book>();
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>(Collections.reverseOrder());

		public void linkedList() {
			// LinkedList<Book> list = new LinkedList<Book>();
			list.add(new Book("traction", 1, 300, new Author(11, "a", 7020267)));
			list.add(new Book("traction", 2, 400, new Author(12, "b", 7020267)));
			list.add(new Book("traction", 3, 500, new Author(13, "c", 7020267)));
			list.add(new Book("traction", 4, 600, new Author(14, "d", 7020267)));
		}

		public void treemap() {


			Iterator<Book> itr = list.iterator();
			while (itr.hasNext()) {

				Book b = itr.next();

				tree.put(b.bookId, b.at.aName);
			}

			Set<Entry<Integer, String>> entry = tree.entrySet();

			Iterator<Entry<Integer, String>> it = entry.iterator();

			while (it.hasNext()) {

				Entry<Integer, String> en = it.next();

				System.out.println("id no of author is :"+en.getKey() + " Author name is : " + en.getValue());


			}

		}

		public static void main(String[] args) {
			Book_Details_Linked_HashMap b = new Book_Details_Linked_HashMap();
			
			b.linkedList();
			b.treemap();
		}
	}
