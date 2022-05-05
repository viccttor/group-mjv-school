package br.com.grupofour.javaflix;

import br.com.grupofour.javaflix.models.FilmesModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@SpringBootApplication
public class JavaflixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaflixApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


//		FilmesModel filme = new FilmesModel(null, "Homem-Aranha",
//				LocalDateTime.parse(dateTimeFormatter.format("20/05/2022")),
//				5, LocalTime.of(2,50));


	}
}
