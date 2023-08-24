package in.mritunjay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import in.mritunjay.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages = {"in.mritunjay","com.wallmart"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	

}
