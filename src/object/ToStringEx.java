package object;

class Book{
	int bookNumber;
	String bookTitle;
	
	Book(){	}
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookNumber + "," + bookTitle;
	}
}

public class ToStringEx {
	public static void main(String[] argvs) {
		Book book1 = new Book(123,"°³¹Ì");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}
