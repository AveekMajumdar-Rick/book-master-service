package microservices.test.bookmasterservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.test.bookmasterservice.modal.Book;

@RestController
@RequestMapping("/master")
public class BookController {

	@GetMapping("/{bookId}")
	public Book getBookDescription(@PathVariable Integer bookId) {
		return new Book(bookId, "catch 22");
	}
}
