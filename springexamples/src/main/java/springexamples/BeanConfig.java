package springexamples;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
@Bean
public Address getAddress() {
	return new Address(456,"Mahe","Mumbai");
	
}
@Bean 
public Student getStudent() {
	return new Student(101,"sam",getAddress());
}
}
