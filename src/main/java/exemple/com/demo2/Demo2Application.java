package exemple.com.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    @GetMapping("/")  // Endpoint racine
    public String root() {
        return "Welcome to Spring Boot Application!";
    }

    @GetMapping("/test")  // Endpoint test en minuscules
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/status")  // Endpoint supplémentaire
    public String status() {
        return "Application is running!";
    }
}