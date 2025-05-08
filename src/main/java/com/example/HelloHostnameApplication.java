package main.java.com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.net.InetAddress;

@SpringBootApplication
@RestController
public class HelloHostnameApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloHostnameApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        try {
            String hostname = InetAddress.getLocalHost().getHostName();
            return "Hello from " + hostname;
        } catch (Exception e) {
            return "Hello from Unknown Host";
        }
    }
}