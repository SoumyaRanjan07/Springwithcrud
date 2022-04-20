package com.tutorial.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootCrudApplication implements CommandLineRunner { // interface with a run method
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception{
		String sql="INSERT into tutorial_ranjan(id,descripition,publish_status,title) VALUES(?, ?, ?, ?)";
		 int result=jdbcTemplate.update(sql,"100","Java#1","published","Javatutorial#1");
		 if(result>0)
			 System.out.println("A NEW ROW HAS BEEN INSERTED SUCCESSFULLY");
	}
	
	 

}
