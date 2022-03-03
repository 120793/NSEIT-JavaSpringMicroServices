package com.example.nseit.springbootdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component(value="c")
public class Circle implements Shape {

	@Override
	public String showShape() {
		// TODO Auto-generated method stub
		return "It is circle in shape.. ";
	}

}
