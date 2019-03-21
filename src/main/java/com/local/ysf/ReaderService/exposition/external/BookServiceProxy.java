package com.local.ysf.ReaderService.exposition.external;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.local.ysf.ReaderService.Model.Book;

@FeignClient(name="bookService" ,fallback=BookServiceProxyFallBack.class)
public interface BookServiceProxy {

	
	@GetMapping(value="/book/title/{title}")
	public Book getBookByTitle(@PathVariable(name="title") String title);
	
	@GetMapping(value="/book/author/{author}")
	public List<Book> findAllBooksByAuthor(@PathVariable(name="author") String author);
}
