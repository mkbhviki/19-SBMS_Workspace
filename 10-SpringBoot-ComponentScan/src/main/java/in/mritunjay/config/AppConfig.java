package in.mritunjay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.mritunjay.security.AppSecurity;
@Configuration
public class AppConfig {
	
	public AppConfig() {
		
		System.out.println("AppConfig :: Constructor");
		
	}
	@Bean
	public AppSecurity createInstance() {
		AppSecurity as= new AppSecurity();
		//costum logic to secure our functionality
		return as;
	}


}
