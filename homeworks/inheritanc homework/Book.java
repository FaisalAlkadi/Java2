package fapplication;

public class Book {
	protected String title;
	protected String author;
	public Book(String ti ,String au) {
		title=ti;
		author=au;
		
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book("bbb","aaa");
		System.out.println(b);
		AudioBook a=new AudioBook("book1"," book2", 7 ," book3");
		System.out.println(a);
		WrittenBook w=new WrittenBook("book4", "book5", 7);
		System.out.println(w);
		PrintedBook p=new PrintedBook("WrittenBook1"," WrittenBook", 7, 3, false);
		System.out.println(p);
		EBook e=new EBook(" WrittenBook2", " WrittenBook3", 3, 7);
		System.out.println(e);

	}

	

}
