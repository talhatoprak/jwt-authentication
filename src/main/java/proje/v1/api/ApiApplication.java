package proje.v1.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import proje.v1.api.common.util.Crypt;
import proje.v1.api.domian.user.UserRole;
import proje.v1.api.domian.user.Users;
import proje.v1.api.service.user.UserService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class ApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(
			UserService userService){
		return args -> {
				initUser(userService);
		};
	}

	private void initUser(UserService userService) {

		Users user1 = new Users("user",Crypt.hashWithSha256("user"),"Jhon", "Doe");
		user1.setEmail("jhondoe@gmail.com");
		user1.setImgURL("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSZkd2LNMM1RoBqQ1dOHQvZ-HaHbsc7rKqqg8AARIQYpMFAWQx0");
		user1.setUserRole(UserRole.Teacher);
		userService.save(user1);
	}


}
