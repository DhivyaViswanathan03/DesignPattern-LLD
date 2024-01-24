package J.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList(
				new Book("Tamil", 100),
				new Book("English", 200),
				new Book("Maths", 300),
				new Book("Science", 400),
				new Book("Social", 500));
		IAggregate library=new Library(books);
		IIterator iterator=library.createIterator();
		
		while(iterator.hashNext()) {
			Book book=(Book)iterator.next();
			System.out.println(book.getName());
			
		}

	}

}
