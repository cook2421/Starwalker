package starwalker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    static {
        System.setProperty("spring.config.location", "classpath:/application.yml,classpath:/application-oauth.yml");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
