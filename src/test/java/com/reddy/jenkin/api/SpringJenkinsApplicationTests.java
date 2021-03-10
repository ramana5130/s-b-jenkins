package com.reddy.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Logger logger  = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case Executing...");
		logger.info("Test case Executing Second time...");
		logger.info("Test case Executing Third time...");
		
		logger.info("Test case Executing Fourth time...");
		logger.info("Test case Executing Fifth time...");
		logger.info("Test case Executing Sixth time...");
		assertEquals(true, true);
	}

}
