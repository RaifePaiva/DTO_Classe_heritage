package br.com.dtopattern;

import br.com.dtopattern.entities.Employee;
import br.com.dtopattern.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtoPatternsApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(DtoPatternsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Employee employee = new Employee(null, "João Cardoso Silva", 2350.05, "Suporte Técnico");

		personRepository.save(employee);



	}
}
