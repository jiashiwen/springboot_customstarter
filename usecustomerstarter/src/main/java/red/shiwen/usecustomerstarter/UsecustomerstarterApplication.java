package red.shiwen.usecustomerstarter;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import red.shiwen.example_spring_boot_starter.ExampleService;

@SpringBootApplication
@RestController
public class UsecustomerstarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsecustomerstarterApplication.class, args);
	}

	
//	@Autowired
//	private ExampleService exampleService;

	@GetMapping("/input")
	public String input(String word) {
//		return exampleService.wrap(word);
		System.out.println(new ExampleService("a", "b").wrap("c"));
		return word;
	}
}
