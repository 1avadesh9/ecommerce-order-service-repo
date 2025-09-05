package com.itsajs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class OrderServiceApplicationMain
{
	public static void main(String[] args) 
	{
		log.info("entered in OrderServiceApplicationMain.java main()...");

		SpringApplication.run(OrderServiceApplicationMain.class, args);

		log.info("************ORDER SERVICE APPLICATION STARTED************");
	}

}
