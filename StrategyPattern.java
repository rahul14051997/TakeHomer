import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BookInformation {
	String Author;
	String Title;
	int YearPublished;
	String Summary;
	
	public BookInformation(String author, String title, int year, String summary) {
		this.Author = author;
		this.Title = title;
		this.YearPublished = year;
		this.Summary = summary;
	}	
	public String getauthor() {
		return(Author);
	}
	public String gettitle() {
		return(Title);
	}
	public int getyearpublished() {
		return(YearPublished);
	}
	public String getsummary() {
		return(Summary);
	}
}

class BookLibrarian {
	List<BookInformation> books = new ArrayList<BookInformation>();
	sortbook sortbook;
	
	public void addbook(BookInformation b) {
		books.add(b);
	}
	
	public void printList() {
		List<BookInformation> listofbooks;
		if(sortbook != null) {
			listofbooks = sortbook.sort(books);
			System.out.print("running");
		}
		else {
			listofbooks = books;
		}
		for (BookInformation books : listofbooks) {
			System.out.println("author: " + books.getauthor() + "title: " + books.gettitle() + "yearpublished: " + books.getyearpublished() + "summary: " + books.getsummary());
		}
	}
		
	public void setSortMethods(sortbook sortMethod) {
		this.sortbook = sortMethod;
	}

}

class sortbook {
	List<BookInformation> bookinfo = null;
	String sortby;
	
	public sortbook(String sort) {
		this.sortby =sort;
	}
	
	public List<BookInformation> sort(List<BookInformation> b){
		List<BookInformation> sortedbookinfo;
		switch(sortby)
		{
			case "author":
				sortedbookinfo = sortauthor(b);
				return sortedbookinfo;
			case "title":
				sortedbookinfo = sorttitle(b);
				return sortedbookinfo;
			case "yearpublished":
				sortedbookinfo = sortyearpublished(b);
				return sortedbookinfo;
			default :
				return null;
		}
	}
	
	public List<BookInformation> sortauthor(List<BookInformation> bookinfo) { 
		Collections.sort(bookinfo, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation book1, BookInformation book2) {
				return String.valueOf(book1.getauthor()).compareTo(book2.getauthor());
			}
		});	
		return bookinfo;
	}
	
	public List<BookInformation> sorttitle(List<BookInformation> bookinfo) {
		Collections.sort(bookinfo, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation book1, BookInformation book2) {
				return String.valueOf(book1.gettitle()).compareTo(book2.gettitle());
			}
		});
		return bookinfo;
	}
	
	public List<BookInformation> sortyearpublished(List<BookInformation> bookinfo) {
		Collections.sort(bookinfo, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation book1, BookInformation book2) {
				return Integer.valueOf(book1.getyearpublished()).compareTo(book2.getyearpublished());
			}
		});
		return bookinfo;
	}
}

public class StrategyPattern {
	public static void main(String[] args) {
		BookLibrarian book =new BookLibrarian ();
		book.addbook(new BookInformation("Mark Twain", "Adventures of Huckleberry Finn", 1884,"ok" ));
		book.addbook(new BookInformation("John Steinbeck", "The Grapes of Wrath", 1939, "ok" ));
		book.addbook(new BookInformation("Herman Melville", "Moby-Dick", 1851, "ok" ));
		book.addbook(new BookInformation("Tolkien", "The Lord of the Rings", 1954, "ok"));
		book.addbook(new BookInformation("Tolkien", "The Hobbit", 1937,"ok" ));
		book.addbook(new BookInformation("John Steinbeck", "Of Mice and Men", 1937, "ok" ));
		book.addbook(new BookInformation("William Golding", "Lord of the Flies", 1954, "ok" ));
		book.addbook(new BookInformation("Victor Hugo", "Les Misérables",1862,"ok" ));
		book.addbook(new BookInformation("Jane Austen", "Pride and Prejudice", 1813, "ok" ));
		book.addbook(new BookInformation("Miguel de Cervantes", "Don Quixote", 1605, "ok" ));
		book.addbook(new BookInformation("Charles Dickens", "A Christmas Carol", 1843,"ok" ));
		System.out.println("unsorted:");
		book.printList();
		System.out.println("sort by title:");
		book.setSortMethods(new sortbook("title"));
		book.printList();
		System.out.println("sort by author:");
		book.setSortMethods(new sortbook("author"));
		book.printList();
		System.out.println("sort by yearpublished:");
		book.setSortMethods(new sortbook("yearpublished"));
		book.printList();
	}
}