package microservices.test.bookmasterservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class BookConfiguration {

	@Bean
	public WebClient.Builder configureWebClient(){
		return WebClient.builder();
	}
	
}
