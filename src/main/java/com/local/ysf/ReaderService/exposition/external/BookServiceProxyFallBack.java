package com.local.ysf.ReaderService.exposition.external;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.local.ysf.ReaderService.Model.Book;

@Component
public class BookServiceProxyFallBack implements BookServiceProxy {

	@Override
	public Book getBookByTitle(String title) {
		return new Book(UUID.randomUUID(), title, "author", "this is a description", 20);
	}

	@Override
	public List<Book> findAllBooksByAuthor(String author) {
		List<Book> lst = new ArrayList<>();
		lst.add(new Book(UUID.randomUUID(), "title1", author , "this is a description", 20));
		lst.add(new Book(UUID.randomUUID(), "title2", author , "this is a description", 80));
		lst.add(new Book(UUID.randomUUID(), "title3", author , "this is a description", 250));
		return lst;
	}

}
