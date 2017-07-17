package main;

import config.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by Namlong on 7/17/2017.
 */
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = {"*"})
public class SpringBootCRUDApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCRUDApp.class, args);
    }
}
