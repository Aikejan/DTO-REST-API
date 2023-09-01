package java10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DtoRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DtoRestApiApplication.class, args);
    }

}
