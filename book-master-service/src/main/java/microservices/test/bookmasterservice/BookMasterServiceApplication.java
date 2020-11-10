package microservices.test.bookmasterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookMasterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMasterServiceApplication.class, args);
	}

}
