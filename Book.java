package Weekend_Test;

public class Book 
{
	String bookName;int bookId;float price;Author at;
	Book(){}
	Book(String bookName,int bookId,float price,Author at)
	{
		this.bookName = bookName;
		this.bookId = bookId;
		this.price = price;
		this.at = at;
	}
	public String toString(){
		return "Book name : " + bookName +"\nId of the Book " + bookId + "\nPrice of the Book : " + price + "\nAuthor of the Book : " + at;
	}
}

