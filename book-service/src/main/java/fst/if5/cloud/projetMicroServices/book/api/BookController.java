package fst.if5.cloud.projetMicroServices.book.api;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fst.if5.cloud.projetMicroServices.book.model.Book;
import fst.if5.cloud.projetMicroServices.book.repository.BookRepository;

@RestController
public class BookController {

		
	@Autowired
	BookRepository repository;
	
	protected Logger logger = Logger.getLogger(BookController.class.getName());

	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> findAll() {
		logger.info("Book.findAll()");
		return repository.findAll();
	}
	
	@RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
	public Book findById(@PathVariable("id") String id) {
		logger.info(String.format("Book.findById(%s)", id));
		Book book = repository.findById(id);
		return book;
	}
	
	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public Book add(@RequestBody Book book) {
		logger.info(String.format("Book.add(%s)", book));
		return repository.save(book);
	}
	
	
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void  deleteBook(@PathVariable String id) {
        repository.delete(id);
    }
}