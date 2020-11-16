package microservices.test.bookmasterservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.test.bookmasterservice.modal.Book;
import microservices.test.bookmasterservice.service.BookMasterService;

@RestController
@RequestMapping("/master")
public class BookController {
	
	@Autowired
	private BookMasterService bookMasterService;

	@GetMapping("/{bookId}")
	public Book getBookDescription(@PathVariable String bookId) {
		return bookMasterService.getBooks(bookId);
	}
}
