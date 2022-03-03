package com.example.nseit.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Controller1")
public class DemoController {
	 
	@Value("${spring.application.name}")
	String name;
	
	@Value("${server.port}")
	int port;
	
	@GetMapping("/port")
	public String port() {
	return "Application is running on port:"+port;
	}
	
	@Value("${config2.databaseName}")
	String dname;
	@Value("${config1.databaseDriver}")
	String ddriver;
	
	@GetMapping("/test1")
	   public String test1() {
		   return "responce from test1";
	   }
   
   @GetMapping("/test2")
   public String test2() {
	   return "responce from test2";
   }
   
   @GetMapping("/details")
   public Configuration showConfigDetails() {
   return new Configuration(ddriver,dname);
   }
}


//localhost:8080/controller1/test1
//localhost:8080/controller2/test1
