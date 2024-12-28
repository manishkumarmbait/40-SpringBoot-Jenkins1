package com.javatechie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(ApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing....");
		assertEquals(true, true);
	}

}
