package com.jdhv.discoveryserver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, properties = { "spring.cloud.config.enabled=false" })
//@TestPropertySource(locations = "classpath:discoveryserver.yml")
class DiscoveryserverApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Test
	void contextLoads() {
		log.info("Testing DiscoveryServer microservice context");
		assertNotNull(context);
	}

}
