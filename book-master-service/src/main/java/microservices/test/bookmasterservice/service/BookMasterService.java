package microservices.test.bookmasterservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import microservices.test.bookmasterservice.modal.Book;
import microservices.test.bookmasterservice.modal.BookSummery;

@Service
public class BookMasterService {

	@Autowired
	private WebClient.Builder webClient;
	
	@Value("${api.key}")
	private String apiKey;
	
	@Value("${ext.book.url}")
	private String bookUrl;

	public Book getBooks(String bookId) {
		BookSummery bookSummery = webClient.build()
								  .get()
								  .uri(bookUrl+""+bookId+"?key="+apiKey)
								  .retrieve()
								  .bodyToMono(BookSummery.class)
								  .block();
		return new Book(bookSummery.getId(), bookSummery.getVolumeInfo().getTitle());
	}
	
}
