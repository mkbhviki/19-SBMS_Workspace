package in.mritunjay.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppSecurity {
	public AppSecurity() {
		
		System.out.println("AppSecurity :: Constructor");
		
	}

	@Bean
	public AppSecurity createInstance() {
		AppSecurity as= new AppSecurity();
		//costum logic to secure our functionality
		return as;
	}
}
