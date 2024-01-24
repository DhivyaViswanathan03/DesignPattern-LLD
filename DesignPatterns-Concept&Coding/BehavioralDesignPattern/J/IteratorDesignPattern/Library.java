package J.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Library implements IAggregate {
	
	List<Book> books;
	
	Library(List<Book> books){
		this.books=books;
		
	}

	@Override
	public IIterator createIterator() {
		return new BookIterator(this.books);
	}

}
