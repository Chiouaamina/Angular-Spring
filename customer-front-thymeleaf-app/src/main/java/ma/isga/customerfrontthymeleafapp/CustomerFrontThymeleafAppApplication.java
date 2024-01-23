package ma.isga.customerfrontthymeleafapp;

import ma.isga.customerfrontthymeleafapp.entities.Customer;
import ma.isga.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("amina").email("amina@amina.com").build());
            customerRepository.save(Customer.builder().name("chioua").email("chioua@chioua.com").build());

        };
    }
}
