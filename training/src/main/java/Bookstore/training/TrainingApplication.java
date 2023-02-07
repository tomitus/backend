package bookstore.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstore.training.TrainingApplication;
import bookstore.training.domain.Book;
import bookstore.training.domain.BookRepository;


@SpringBootApplication
public class TrainingApplication {
	private static final Logger log = LoggerFactory.getLogger(TrainingApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner studentDemo(BookRepository repository) {
		return (args) -> {
			log.info("example data");
			repository.save(new Book("The Snowman", "Nesbo", 1990, "1234567-89", 30.00));
			repository.save(new Book("Dark forces", "Leather", 1999, "9876543-21", 25.00));	
			
			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}
}
