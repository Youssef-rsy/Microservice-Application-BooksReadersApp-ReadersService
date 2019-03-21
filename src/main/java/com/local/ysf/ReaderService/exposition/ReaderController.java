package com.local.ysf.ReaderService.exposition;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.local.ysf.ReaderService.Entity.Reader;
import com.local.ysf.ReaderService.Model.Book;
import com.local.ysf.ReaderService.exposition.external.BookServiceProxy;
import com.local.ysf.ReaderService.service.ReadersService;

@RestController
@RequestMapping(value="/reader")
@CrossOrigin(origins="*")
public class ReaderController {

	@Autowired
	private ReadersService readerService;
	
	@Autowired
	private BookServiceProxy myproxy;
	
	@PostMapping(value="")
	public void addReader(@RequestBody Reader reader){
		readerService.saveReader(reader);
	}
	
	@GetMapping(value="/{readerId}")
	public Reader getReaderById(@PathVariable UUID readerId){
		return readerService.getReader(readerId);
	}

	@GetMapping(value="")
	public List<Reader> getAllReader(){
		return readerService.getAllReader();
	}
	
	@PutMapping(value="/{readerId}")
	public Reader updateReader(@PathVariable UUID readerId ,@RequestBody Reader reader){
		return readerService.updateReader(readerId, reader);
	}
	
	@DeleteMapping(value="/{readerId}")
	public void deleteReader(@PathVariable UUID readerId){
		 readerService.deleteReader(readerId);
	}
	
	@GetMapping(value="/book/{title}")
	public Book getBokkInformation(@PathVariable(name="title") String title ){
		Book book = myproxy.getBookByTitle(title);
		return book;
	}
	@GetMapping(value="/book/author/{author}")
	public List<Book> getutorABook(@PathVariable(name="author") String author ){
		List<Book> books = myproxy.findAllBooksByAuthor(author);
		return books;
	}
}
