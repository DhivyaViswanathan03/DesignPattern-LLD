package J.IteratorDesignPattern;

import java.util.List;

public class BookIterator implements IIterator {
	
	List<Book> books;
	int index=0;
	
	BookIterator(List<Book> books){
		this.books=books;
	}

	@Override
	public boolean hashNext() {
		return index<books.size();
	}

	@Override
	public Object next() {
		if(this.hashNext()) {
			Book book = books.get(index++);
			return book;
		}
		return null;
	}

}
