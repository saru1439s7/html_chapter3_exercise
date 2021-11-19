import java.util.*;
import java.awt.print.Book;
import java.text.SimpleDateFormat;

public class Main2 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyy/mm/dd");
		ArrayList<Book> books = new ArrayList<>();
	Book b1=new Book();
	b1.setTitle();
	b1.setPublishDate();
	b1.setComment();
	books.add(b1);
	Book b2=new Book();
	b2.setTitle();
	b2.setPublishDate();
	b2.setComment();
	books.add(b2);
	Collections.sort(books,new TitleComparator());
	
	for(Book b:books){
		System.out.println(b.getTitle()+""+f.format(b.getPublishDate())+""+b.getComment();)
	}
	}
}
